package hr.calzedoniadgital.task2;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "price-table")
@XmlAccessorType(XmlAccessType.FIELD)
public class PriceTable {

	@XmlAttribute(name = "product-id")
	public String productId;

	@XmlElement(name = "online-from")
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public LocalDateTime onlineFrom;

	@XmlElement(name = "online-to")
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public LocalDateTime onlineTo;

	@XmlElement
	public Amount amount;

	public PriceTable(String productId, LocalDateTime onlineFrom, LocalDateTime onlineTo, Amount amount) {
		super();
		this.productId = productId;
		this.onlineFrom = onlineFrom;
		this.onlineTo = onlineTo;
		this.amount = amount;
	}

	public PriceTable() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public LocalDateTime getOnlineFrom() {
		return onlineFrom;
	}

	public void setOnlineFrom(LocalDateTime onlineFrom) {
		this.onlineFrom = onlineFrom;
	}

	public LocalDateTime getOnlineTo() {
		return onlineTo;
	}

	public void setOnlineTo(LocalDateTime onlineTo) {
		this.onlineTo = onlineTo;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

}
