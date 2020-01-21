package JUnitLab;

public class Subscripcion {
	/**
	 * precio total de la subscripción euro-cent
	 */
	 private int precio ; 
	 /**
	  * periodo de subscripcion en meses
	  */
	 
	 private int periodo ; 
	 /**
	 * El constructor para crear una subscripción.
	 */
	 public Subscripcion(int p, int n) {
	 precio = p ;
	 periodo = n ;
	 
	 }
	 public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	/**
	 * Calcula el precio de la subscripción mensual en euros,
	 * redondeándolo por arriba al céntimo más cercano.
	 *
	 */
	 public double precioPorMes() {
	 if (periodo<=0 || precio<=0)
		 return 0 ;
	 double r = (double) precio / (double) periodo ;
	 double resto = r%1;

	 if (resto > 0)
	return (int) r+1;
	 else
	return r;
	 }
	 
	 /**
	 * Este método cancela la subscripción.
	 */
	 public void cancel() {
		 periodo = 0 ;
	 }
}
