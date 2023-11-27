package eje26;

public class Main {
	public static void main(String[] args) {
		AnimalCarnivoro ac = new AnimalCarnivoro();
		AnimalHerbivoro ah = new AnimalHerbivoro();
		
		ac.alimentarse("aegreg");
		ah.alimentarse("efuighwrg");
	}
}

class Planta extends SerVivo{
	@Override
	public void alimentarse(String comer) {
		System.out.println(comer);
	}
}
class AnimalCarnivoro extends Animal{
	@Override
	public void alimentarse(String comer) {
		System.out.println(comer);
	}
}
class AnimalHerbivoro extends Animal{
	@Override
	public void alimentarse(String comer) {
		System.out.println(comer);
	}
}