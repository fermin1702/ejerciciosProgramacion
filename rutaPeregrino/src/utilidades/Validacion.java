package utilidades;

public class Validacion {

	public static boolean validarNacionalidad(String nacionalidad) {
		boolean ret = false;
		ret = (nacionalidad.length() > 8) && (nacionalidad.contains("A"));
		return ret;
	}

	public static boolean validarNombre(String nombre) {
		boolean ret = false;
		ret = nombre.length() > 3;
		return ret;
	}
}