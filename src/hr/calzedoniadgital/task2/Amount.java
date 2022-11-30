package hr.calzedoniadgital.task2;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Amount {
	
	@XmlAttribute
	public Integer quantity;
	
	@XmlValue
    private BigDecimal value;

	public Amount(Integer quantity, BigDecimal value) {
		super();
		this.quantity = quantity;
		this.value = value;
	}
	
	public Amount() {
		super();
	}
	
	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}	

	

}
