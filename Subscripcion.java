package JUnitLab;

public class Subscripcion {
	/**
	 * precio total de la subscripci�n euro-cent
	 */
	 private int precio ; 
	 /**
	  * periodo de subscripcion en meses
	  */
	 
	 private int periodo ; 
	 /**
	 * El constructor para crear una subscripci�n.
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
	 * Calcula el precio de la subscripci�n mensual en euros,
	 * redonde�ndolo por arriba al c�ntimo m�s cercano.
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
	 * Este m�todo cancela la subscripci�n.
	 */
	 public void cancel() {
		 periodo = 0 ;
	 }
}
