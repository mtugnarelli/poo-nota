
class Nota {

	private int valor;
	
	/*
	 * post: la Nota queda inicializada con valor 4.
	 */
	public Nota() {
		
		valor = 4;
	}
		
	/*
	 * pre : valorDeLaNota está en el rango [0,10]. 
	 * post: la Nota queda inicializada con valorDeLaNota.
	 */
	public Nota(int valorDeLaNota) {
		
		/* verificamos que el valor esté en el rango correcto */
		if (esValorValido(valorDeLaNota)) {
			
			valor = valorDeLaNota;
		
		} else {
			
			valor = 0;
		}
	}
	
	/*
	 * post: indica si el valor de la Nota permite la aprobación.
	 */
	public boolean aprueba() {
		
		return valor >= 4;
	}
	
	/*
	 * post: indica si el valor de la Nota permite la promoción.
	 */
	public boolean promociona() {
		
		return valor >= 7;
	}
	
	public boolean presente() {
		
		return valor != 0;
	}
	
	public boolean ausente() {
		
		return ! presente();
	}
	
	public int obtenerValor() {
		
		return valor;
	}
	
	/* pre : nuevoValor está en el rango [0,10]
	 * post: cambia el valor de la nota por nuevoValor.
	 */
	public void corregir(int nuevoValor) {
		
		if (esValorValido(nuevoValor)) {
			
			valor = nuevoValor;
		}
	}
	
	/*
	 * post: indica si valorAValidar está en el rango [0,10],
	 *       siendo valido para una Nota.
	 */
	private boolean esValorValido(int valorAValidar) {
		
		return ((valorAValidar >= 0) && (valorAValidar <= 10));
	}
	
	/*
	 * pre : nuevoValor está en el rango [0,10]
	 * post: corrige el valor de la Nota SOLO si nuevoValor
	 *       es mayor que el valor anterior.
	 */
	public void recuperar(int nuevoValor) {
	
		/* verifica que además de ser valido, nuevoValor sea mayor
		 * al valor anterior */
		if (esValorValido(nuevoValor) && (nuevoValor > valor)) {
			
			valor = nuevoValor;
		}
	}
}
