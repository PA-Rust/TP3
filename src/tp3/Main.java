package tp3;

public class Main {

	public static void main(String[] args) {
		Polinomio miPolinomio = new Polinomio(3,new double[] {4, 5, 1, 2});
		System.out.println(miPolinomio.evaluarMsucesivas(2));
		System.out.println(miPolinomio.evaluarRecursiva(2));
		System.out.println(miPolinomio.evaluarProgDinamica(2));
		System.out.println(miPolinomio.evaluarMejorada(2));		///progDinamica mejorada
		System.out.println(miPolinomio.evaluarPow(2));
		System.out.println(miPolinomio.evaluarHorner(2));
		
	}

}
