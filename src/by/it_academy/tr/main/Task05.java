package by.it_academy.tr.main;

public class Task05 {

	public static void main(String[] args) {
		// Вычисление с выбором формулы
		double a = 1.0;
		int n = 5;

		double x1 = -2 * a;
		double step = a / 5;

		for (int i = 0; i < n; i++) {
			double x = x1 + i * step;
			double y;

			if (x <= 0) {
				y = a / 2 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
			} else {
				y = 4 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
			}

			System.out.println(i + 1 + ".  " + y);
		}

	}

}
