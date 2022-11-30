package hr.calzedoniadgital.task2;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXB;

public class Main {
	
	private static List<String> productIds = Arrays.asList(
			"1AC003   2632TU",
			"1AC003   3323TU",
			"1AC014   019 M/L",
			"1AC102   166 00002",
			"1AC1066  4957TU",
			"1AC116   019 00002",
			"1AC118   019 00002",
			"1AC120   009 00004",
			"1AC120   009 S/M");

	public static void main(String[] args) {
		/*
		 * Read contents of 'xml' file present in resource folder 'task2.xml'; 
		 * Filter contents leaving only product with id's in list 'productIds'
		 * Set new price to each of them to '4.99'
		 * Save contents to new file and into folder 'destination' 
		 */
		
		//SOLUTION
		PriceBook priceBook = JAXB.unmarshal(new File("resources/task2.xml"), PriceBook.class);
		
		List<PriceTable> priceTableListOut = priceBook.getPriceTable().stream()
				.filter(p -> productIds.contains(p.getProductId()))
				.map(t -> {
							t.setAmount(new Amount(t.getAmount().getQuantity(), new BigDecimal("4.99")));
							return t;
				}).collect(Collectors.toList());

		JAXB.marshal(new PriceBook(priceTableListOut), new File("destination/task2.xml"));

	}

}
