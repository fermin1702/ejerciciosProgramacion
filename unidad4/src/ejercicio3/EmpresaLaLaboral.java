package ejercicio3;

public class EmpresaLaLaboral {

	public static void main(String[] args) {

		Coche cocheEmpresaVentas = new Coche("Seat", "Panda", "Rojo", "5566KBG");
		Coche cocheEmpresaDireccion = new Coche("0000BBB");

		cocheEmpresaVentas.imprimeCoche();

		System.out.println("El Coche de Ventas tiene la matricula: " + cocheEmpresaVentas.getMatricula()
				+ " y el Coche de Direccion tiene la matricula: " + cocheEmpresaDireccion.getMatricula());

	}
}
