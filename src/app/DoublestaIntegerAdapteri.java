package app;

import java.util.ArrayList;
import java.util.List;

public class DoublestaIntegerAdapteri implements DoubleNumeroLukija{

	 private NumeroLukija numeroLukija;

	 public DoublestaIntegerAdapteri(NumeroLukija numeroLukija) {
	   this.numeroLukija = numeroLukija;
	 }
	
	@Override
	public void lueDoublet(List<Double> doubles) {
		List<Integer> integerLista = new ArrayList<Integer>();
		for (Double d : doubles) {
			integerLista.add((int)Math.round(d));
		}
	    numeroLukija.lueNumerot(integerLista);
	}
	
}
