package by.it_academy.tr.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// Подсчитать количество точек, входящих в данную область

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество точек: ");
		int n = scanner.nextInt();

		int count = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Введите координату точки по оси х: ");
			double x = scanner.nextDouble();
			System.out.print("Введите координату точки по оси у: ");
			double y = scanner.nextDouble();

			// Квадрат 1: (-2, 0)(0, 2)
			boolean inSquare1 = (x >= -2 && x <= 0) && (y >= 0 && y <= 2);

			// Квадрат 2: (0, -1)(2, 1)
			boolean inSquare2 = (x >= 0 && x <= 2) && (y >= -1 && y <= 1);

			if (inSquare1 || inSquare2) {
				count++;
			}
		}

		System.out.println("Количество точек, попавших в заданные квадраты: " + count);
	}

}
