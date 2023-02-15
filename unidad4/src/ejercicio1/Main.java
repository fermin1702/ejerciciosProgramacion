package ejercicio1;

public class Main {

	public static void main(String[] args) {

		Miclase objeto1 = new Miclase();
		objeto1.setA(13);
		objeto1.b = 1;
		System.out.println("En el objeto 1 el valor de A es: " + objeto1.getA() + " y el valor de B es: " + objeto1.b);

		Miclase objeto2 = new Miclase(16);
		objeto2.b = 2;
		System.out.println("En el objeto 2 el valor de A es: " + objeto2.getA() + " y el valor de B es: " + objeto2.b);

		Miclase objeto3 = new Miclase(28, 3);
		System.out.println("En el objeto 3 el valor de A es: " + objeto3.getA() + " y el valor de B es: " + objeto3.b);

	}

}
