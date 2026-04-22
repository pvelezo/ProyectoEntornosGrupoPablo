package net.ceinmark.microcuentas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Guardado {
	
	public static void exportarTXT(ArrayList<Gasto> gastos) {
	
		try (PrintWriter writer = new PrintWriter(new FileWriter("reporte.txt"))) {
			
			for (Gasto g : gastos) {
				writer.println(g.getConcepto() + " | " + g.getImporte() + "€");
            }
			
			System.out.println("Archivo guardado con éxito.");

		} catch (IOException e) {
			System.out.println("Error al guardar.");
        }
    
	}

}
