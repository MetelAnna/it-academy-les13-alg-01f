package by.it_academy.tr.main;

public class Task01 {

	public static void main(String[] args) {
		// Написать приведенную формулу по правилам ЯП

		double result;

		double x = 0.5;

		result = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3))) + 1.7;

		System.out.println(result);

	}

}
