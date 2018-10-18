package tp3;

public class Main {

	public static void main(String[] args) {
		Polinomio miPolinomio = new Polinomio(4,new double[] {2, -6, 2, -1});
		System.out.println(miPolinomio.evaluarHorner(4));
		System.out.println(miPolinomio.evaluarMsucesivas(4));
	}

}
