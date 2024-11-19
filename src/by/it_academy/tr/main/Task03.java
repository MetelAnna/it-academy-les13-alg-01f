package by.it_academy.tr.main;

public class Task03 {

	public static void main(String[] args) {
		// Накопление сумм произведений

		double x = 0.5;
		int n = 20;
		int k = 1;
		double result;
		double sum = 0.0;
		double comp = 0.0;

		while (k <= n) {
			comp = (Math.sin((k * x) / 2) + Math.sin((k * x - 1) / 2)) / (Math.pow(Math.E, x - 1 / k));
			sum = sum + comp;
			k++;
		}
		
		result = Math.sqrt(n * Math.PI) * sum;
		
		System.out.println("" + result);
	}

}
