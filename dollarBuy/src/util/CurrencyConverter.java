package util;

public class CurrencyConverter {
	public static final double IOF = 6;
	
	public static double conversor(double cot, double dol) {
		return cot  * dol;
	}
	
	public static double imposto(double valor) {
		return (IOF/100 * valor) + valor;
	}
}
