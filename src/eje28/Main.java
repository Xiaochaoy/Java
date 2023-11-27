package eje28;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Honda();
		Car c2 = new Jeep();
		Car c3 = new BMW();

		c1.getSpeed();
		c2.getSpeed();
		c3.getSpeed();
	}
}
class Car {
	private String company;
	private int speed;
	
	void getSpeed() {
		System.out.println(company + " car's speed is " + speed +  "Km/hr");
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
class Honda extends Car{
	
	@Override
	public void getSpeed(){
		System.out.println("Honda car's speed is 100Km/hr");
	}
}
class Jeep extends Car{
	
	@Override
	public void getSpeed(){
		System.out.println("Jeep car's speed is 500Km/hr");
	}
}
class BMW extends Car{
	
	@Override
	public void getSpeed(){
		System.out.println("BMW car's speed is 800Km/hr");
	}
}
