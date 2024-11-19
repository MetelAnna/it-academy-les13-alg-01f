package by.it_academy.tr.main;

public class Task08 {

	public static void main(String[] args) {
		// Сложное условие завершения цикла

		double x = 0.1;
		double step = 0.1;
		double limit = 10.0;
		boolean zeroCrossed = false;

		while (x <= limit) {
			double result = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;

			if (result <= 0) {
				zeroCrossed = true;
				break;
			}

			System.out.println(result);
			x = x + step;
		}

	}

}
