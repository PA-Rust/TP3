package tp3;

public class Main {

	public static void main(String[] args) {
		Polinomio miPolinomio = new Polinomio(4,new double[] {1,2,3,4});
		System.out.println(miPolinomio.evaluarMsucesivas(2));
	}

}
