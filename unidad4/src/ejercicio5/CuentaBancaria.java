package ejercicio5;

public class CuentaBancaria {

	private String titular;
	private float saldo;

	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}

	public CuentaBancaria(String titular, float saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void realizaReintegro(float reintegro) {
		saldo -= reintegro;
	}

	public void realizaIngreso(float ingreso) {
		saldo += ingreso;
	}

}
