package net.ceinmark.microcuentas;

public class Gasto {
	
	 private String concepto;
	    private double importe;
	    private String categoria;

	    public Gasto(String concepto, double importe, String categoria) {
	        this.concepto = concepto;
	        this.importe = importe;
	        this.categoria = categoria;
	    }

	    // Getters
	    public double getImporte() { 
	    	return importe; }
	    public String getConcepto() { 
	    	return concepto; }
	    public String getCategoria() { 
	    	return categoria; }

}
