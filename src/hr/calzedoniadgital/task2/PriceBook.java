package hr.calzedoniadgital.task2;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pricebook")
@XmlAccessorType(XmlAccessType.FIELD)
public class PriceBook {

	@XmlElement(name = "price-table")
	public List<PriceTable> priceTable;

	public PriceBook(List<PriceTable> priceTable) {
		super();
		this.priceTable = priceTable;
	}

	public PriceBook() {
		super();
	}

	public List<PriceTable> getPriceTable() {
		return priceTable;
	}

	public void setPriceTable(List<PriceTable> priceTable) {
		this.priceTable = priceTable;
	}

}
