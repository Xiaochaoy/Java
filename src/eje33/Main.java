package eje33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Connection connection;
		final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "admin";
		final String pass = "admin";
		
		try {
			connection = DriverManager.getConnection(url, user, pass);
			
			show();
			int option = sc.nextInt();
			while(option > 0 && option < 6) {
				sc.nextLine();
				switch(option) {
					case 1:
						select(connection);
						break;
					case 2:
						insert(connection);
						break;
					case 3:
						update(connection);
						break;
					case 4:
						delete(connection);
						break;
					case 5:
						manual(connection);
						break;
					default:
						System.out.println("Introdueixi una de les opcions anteriors");
						break;
				}
				show();
				option = sc.nextInt();
			}
			connection.close();
		}catch (Exception e) {
			System.err.println(e);
		}
	}
	
	private static void manual(Connection connection) {
		System.out.println("Escribe tu query:");
		String sql = sc.nextLine();
		
		try {
			Statement st = connection.createStatement();
			if(sql.trim().toUpperCase().startsWith("SELECT")) {
				ResultSet result = st.executeQuery(sql);
				
				ResultSetMetaData metaData = result.getMetaData();
				int columnCount = metaData.getColumnCount();
				while (result.next()) {
					for (int i = 1; i <= columnCount; i++) {
						System.out.print(result.getString(i) + "\t");
					}
					System.out.println();
				}
				result.close();				
			}else {
				int rowCount = st.executeUpdate(sql);
	            System.out.println("Insertados: " + rowCount);
			}
			st.close();
		}catch(Exception e){
			System.err.println(e);
		}
	}
	public static void select(Connection c) {
		try {
			Statement st = c.createStatement();
			ResultSet result = st.executeQuery("Select * from db_test.usuarios");
			
			while(result.next()) {
				int id_usuarios = result.getInt("id_usuarios");
				String nombre = result.getString("Nombre");
				int edad = result.getInt("Edad");
				String nacionalidad = result.getString("Nacionalidad");
				System.out.printf("%10d%10s%10d%10s%n", id_usuarios, nombre, edad, nacionalidad);
			}
			result.close();
			st.close();
		}catch(Exception e){
			System.err.println(e);
		}
	}
	private static void insert(Connection connection) {
		try {
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Edad: ");
			int edad = sc.nextInt();
			sc.nextLine();
			System.out.print("Nacionalidad: ");
			String nacio = sc.nextLine();
			
			String sql = "INSERT INTO usuarios " +
                    "(nombre, edad, nacionalidad) VALUES (?,?,?)";

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setInt(2, edad);
            pst.setString(3, nacio);

            pst.executeUpdate();

            pst.close();
		}catch(Exception e){
			System.err.println(e);
		}
	}
	private static void update(Connection connection) {
		try {
            Statement st = connection.createStatement();
            ResultSet result = st.executeQuery("Select * from db_test.usuarios");
			
			while(result.next()) {
				int id_usuarios = result.getInt("id_usuarios");
				String nombre = result.getString("Nombre");
				System.out.printf("%10d%10s%n", id_usuarios, nombre);
			}
			System.out.print("A quien quieres cambiar: ");
	        String nom = sc.nextLine();
            System.out.print("Escribe el nuevo nombre: ");
            String newNom = sc.nextLine();

            st.executeUpdate("update usuarios set nombre='" + newNom + "' where nombre='" + nom + "'");
            
            result.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
	private static void delete(Connection connection) {
		try {
            Statement st = connection.createStatement();
            ResultSet result = st.executeQuery("Select * from db_test.usuarios");
			
			while(result.next()) {
				int id_usuarios = result.getInt("id_usuarios");
				String nombre = result.getString("Nombre");
				System.out.printf("%10d%10s%n", id_usuarios, nombre);
			}
            System.out.print("A quien quieres eliminar: ");
            String nom = sc.nextLine();
            st.executeUpdate("delete from usuarios where nombre='" + nom + "'");

            result.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	private static void show() {
		System.out.println("\n1. Select Todo");
		System.out.println("2. Insert Usuario");
		System.out.println("3. Update Nombre");
		System.out.println("4. Delete Usuario");
		System.out.println("5. Manual Query");
		System.out.print("Elige: ");
	}
}
