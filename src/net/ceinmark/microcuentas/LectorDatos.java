package net.ceinmark.microcuentas;

import java.util.Scanner;

public class LectorDatos {
	public static Gasto crearGasto() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Concepto: "); String c = sc.nextLine();
		System.out.print("Importe: "); double i = sc.nextDouble();
		System.out.print("Categoría: "); String cat = sc.next();
		return new Gasto(c, i, cat);
	}
}

