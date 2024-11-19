package by.it_academy.tr.main;

public class Task06 {

	public static void main(String[] args) {
		// Табулирование функции

		int n = 20;
		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4.0;
		int count = 0;

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		int i = 1;
		for (int k = -30; k <= 60; k++) {
			int result = k * k * k - 25 * k * k + 50 * k + 1000;
			if ((result > t1 && result < t2) || (result > t3 && result < t4)) {
				System.out.printf("(%5d)", result);
				i++;
			} else {
				count++;
			}
		}
		
		System.out.println();
		System.out.println("Количество значений, не попавших в диапазон: " + count);

	}

}
