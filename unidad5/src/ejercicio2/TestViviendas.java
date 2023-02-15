package ejercicio2;

public class TestViviendas {

	public static void main(String[] args) {

		Casa casa1 = new Casa(4, 400, 1000, "Barcelona", "Centro", 34, false);
		System.out.println(casa1.toString());

		Piso piso1 = new Piso(3, 100, 1000, "Madrid", "Centro", 50, false);
		System.out.println(piso1.toString()+ " la comision es de: " + Piso.comision(piso1.getPrecio(), piso1.getMetrosCuadrados()));
	}
}
