package app;

import java.util.List;

public class IntegerLukija implements NumeroLukija{

	 public void lueNumerot(List<Integer> numbers) {
		 for (Number num : numbers) {
			 System.out.println(num);
		 }
	 }

}
