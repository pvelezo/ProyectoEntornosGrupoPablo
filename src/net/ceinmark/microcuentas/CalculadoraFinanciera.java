package net.ceinmark.microcuentas;

import java.util.ArrayList;

public class CalculadoraFinanciera {
    public static double calcularTotal(ArrayList<Gasto> gastos) {
        double total = 0;
        for (Gasto g : gastos) { total += g.getImporte(); }
        return total;
    }
    
    public static double calcularIVA(double total) {
        return total * 0.21; 
        // Aplicando tus conocimientos de ADE
    }
}
