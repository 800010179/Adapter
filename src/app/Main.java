package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 NumeroLukija numeroLukija = new IntegerLukija();
		 List<Integer> integerit = new ArrayList<Integer>();
		 integerit.add(1);
		 integerit.add(2);
		 integerit.add(3);
		 numeroLukija.lueNumerot(integerit);

		 DoubleNumeroLukija adapteri = new DoublestaIntegerAdapteri(numeroLukija);
		 List<Double> doublet = new ArrayList<Double>();
		 doublet.add(4.5);
		 doublet.add(5.3);
		 doublet.add(6.7);
		 adapteri.lueDoublet(doublet);
	}

}
