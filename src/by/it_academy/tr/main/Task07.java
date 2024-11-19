package by.it_academy.tr.main;

public class Task07 {

	public static void main(String[] args) {
		// Функция двух переменных

		int n = 5;
		int m = 6;

		double x1 = 3.0;
		double z1 = 1.5;

		double stepx = 0.1;
		double stepz = 0.2;

		for (int i = 0; i < n; i++) {
			double x = x1 + i * stepx;

			for (int j = 0; j < m; j++) {
				double z = z1 + j * stepz;

				if (z > 0 && Math.pow(x, 2) - Math.pow(z, 2) + 3.2 > 0) {
					double result = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z)
							+ (Math.abs(Math.log(z)) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2));
					System.out.println(result);
				}

			}
		}

	}
}