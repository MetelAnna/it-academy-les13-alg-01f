package by.it_academy.tr.main;

public class Task02 {

	public static void main(String[] args) {
		// Вычисление значения функции

		int n = 10;
		double a = 0.50;
		double b = 1.00;

		double step = (b - a) / (n - 1); // Шаг для равномерного распределения значений по отрезку
		
		System.out.println("  №" + "               x" + "               f(x)");
        System.out.println("-----------------------------------------");
		
        for (int i = 0; i < n; i++) {
			double x = a + i * step;
			double result = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3)))
					+ 1.7;

			System.out.printf("%2d\t%15.6f\t%15.6f\n", i + 1, x, result);
		}
	}

}
