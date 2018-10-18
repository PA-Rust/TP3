package tp3;

public class Polinomio {
	private int grado;
	private double[] coeficientes;
	
	public Polinomio(double[] coeficientes) {
		this.grado = coeficientes.length-1;
		this.coeficientes = coeficientes;
	}
	
	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
	}
	
	
	
	public double evaluarMsucesivas(double x) {		///1	
		 double contador=0;
		 double aux=0;
		 int decrementador=0;
		
		for (double d : this.coeficientes) {
			contador=d;
			for(int i=0;i<this.grado-decrementador;i++)
			{
				contador*=x;
			}
			decrementador++;
			aux+=contador;
			contador=0;
		}

		return aux;
	}
	
	public double evaluarRecursiva( double x) {		///2
		int aux = 0;
		for (int i = 0; i <= this.grado; i++) {
			aux += coeficientes[i] * powRec(x, this.grado - i );
		}
		return aux;
	}
	
	public static double evaluarIndiceParapow(double x,int i) {		///2
		return i % 2 == 0 ? powRec(x * x, i / 2) : powRec(x, i);
	}
	
	public static double powRec( double x, int i) {
		if (i == 1) 
			return x;
		if (i == 0) 
			return 1;
		return (x * powRec(x, i - 1));
	}
	
	public static double powMia(double x, int i) {
		int aux = 1;
		for (int j = 0; j < i; j++) {
			aux *= x;
		}
		return aux;
	}
	
	public double evaluarProgDinamica(double x) {		///3
		double sumador=0;
		double potencias_dinamicas[] = new double[this.grado+1];
		int aux=this.grado;
		
		potencias_dinamicas[0]=1;
		potencias_dinamicas[1]=x;
		
		for (int i = 2; i <=this.grado; i++)
			potencias_dinamicas[i]= potencias_dinamicas[i-1]*x;
		
		for(double d: this.coeficientes) {
			sumador += d*potencias_dinamicas[aux];
			aux--;
		}
		
		return sumador;
	}
	
	public double evaluarMejorada(double x) {		///4
		double sumador=0;
		double potencias_dinamicas_mejoradas[] = new double[this.grado+1];
		
		potencias_dinamicas_mejoradas[0]=1;
		potencias_dinamicas_mejoradas[1]=x;
		
		for (int i = 0; i <=this.grado; i++) {
			if(i>1)
				potencias_dinamicas_mejoradas[i]= potencias_dinamicas_mejoradas[i-1]*x;
			sumador+=this.coeficientes[this.grado-i]*potencias_dinamicas_mejoradas[i];
		}
		
		return sumador;
	}
	
	public double evaluarPow(double x) {		///5
		int aux = 0;
		for (int i = 0; i <= this.grado; i++) {
			aux += coeficientes[i] * Math.pow(x, this.grado - i );
		}
		return aux;
	}
	
	public double evaluarHorner(double x) {		///6
	        double result = coeficientes[0];   
	   
	        for (int i=1; i<coeficientes.length; i++) 
	            result = result*x + coeficientes[i]; 
	   
	        return result; 
	    
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
