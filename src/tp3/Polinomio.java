package tp3;

public class Polinomio {
	private int grado;
	private double[] coeficientes;
	
	public Polinomio(double[] coeficientes) {
		this.grado = coeficientes.length;
		this.coeficientes = coeficientes;
	}
	
	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
	}
	
	public static double powMia(double x, int i) {
		int aux = 1;
		for (int j = 0; j < i; j++) {
			aux *= x;
		}
		return aux;
	}
	
	public double evaluarMsucesivas(double x) {
		int aux = 0;
		for (int i = 0; i < this.grado; i++) {
			aux += coeficientes[i] * Polinomio.powRec(x, this.grado - i -1);
		}
		return aux;
	}
	
	public double evaluarProgDinamica(double x) {
		return 1.0;
	}
	
	public static double evaluarIndiceParapow(double x,int i) {
		return i % 2 == 0 ? powRec(x * x, i / 2) : powRec(x, i);
	}
	
	public static double powRec( double x, int i) {
		if (i == 1) {
			return x;
		} else if (i == 0) {
			return 1;
		}
		return (x * powRec(x, i - 1));
	}
	
	
	public double evaluarRecursiva( double x) {
		int aux = 0;
		for (int i = 0; i < this.grado; i++){
			aux += coeficientes[i] * (x * powRec(x, this.grado - i - 2));
		}
		return aux;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public double[] getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes(double[] coeficientes) {
		this.coeficientes = coeficientes;
	}
	
}
