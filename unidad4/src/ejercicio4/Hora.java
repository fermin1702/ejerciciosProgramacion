package ejercicio4;

public class Hora {

	private int hh;
	private int mm;
	private int ss;

	public Hora() {
		super();
	}

	public Hora(int hh, int mm, int ss) {
		super();

		if (hh < 0 || hh > 24) {
			this.hh = 0;
		} else {
			this.hh = hh;
		}

		if (mm < 0 || mm > 59) {
			this.mm = 0;
		} else {
			this.mm = mm;
		}

		if (ss < 0 || ss > 59) {
			this.ss = 0;
		} else {
			this.ss = ss;
		}
	}

	public String verhora() {
		String verhora = hh + ":" + mm + ":" + ss;
		return verhora;
	}

	public int getHh() {
		return hh;
	}

	public void setHh(int hh) {

		if (hh < 0 || hh > 24) {
			this.hh = 0;
		} else {
			this.hh = hh;
		}
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {

		if (mm < 0 || mm > 59) {
			this.mm = 0;
		} else {
			this.mm = mm;
		}
	}

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {

		if (ss < 0 || ss > 59) {
			this.ss = 0;
		} else {
			this.ss = ss;
		}
	}

	public Hora suma(Hora hora1, Hora hora2) {

		int maxMinutos = 59;
		int maxSegundos = 59;
		int maxHoras = 23;
		int sumaSegundos = hora1.getSs() + hora2.getSs();
		int sumaMinutos = hora1.getMm() + hora2.getMm();
		int sumaHoras = hora1.getHh() + hora2.getHh();

		if (sumaSegundos > maxSegundos) {
			sumaSegundos = sumaSegundos - maxSegundos;
			sumaMinutos += 1;
		}

		if (sumaMinutos > maxMinutos) {
			sumaMinutos = sumaMinutos - maxMinutos;
			sumaHoras += 1;

		}

		if (sumaHoras > maxHoras) {
			sumaHoras = sumaHoras - maxHoras;

		}

		hora1.setHh(sumaHoras);
		hora1.setMm(sumaMinutos);
		hora1.setSs(sumaSegundos);

		return hora1;
	}

	public boolean esIgual(Hora hora1, Hora hora2) {
		boolean isIgual = false;
		if (hora1.getHh() == hora2.getHh()) {
			if (hora1.getMm() == hora2.getMm()) {
				if (hora1.getSs() == hora2.getSs()) {
					isIgual = true;
				}
			}
		}

		return isIgual;
	}

	public boolean mayor_que(Hora hora1, Hora hora2) {
		boolean isMayor = false;
		if (hora1.getHh() > hora2.getHh()) {
			if (hora1.getMm() > hora2.getMm()) {
				if (hora1.getSs() > hora2.getSs()) {
					isMayor = true;
				}
			}
		}

		return isMayor;
	}

	public Hora crearCopia(Hora hora1, Hora horaCopia) {

		horaCopia.setHh(hora1.getHh());
		horaCopia.setMm(hora1.getMm());
		horaCopia.setSs(hora1.getSs());
		return horaCopia;
	}

}
