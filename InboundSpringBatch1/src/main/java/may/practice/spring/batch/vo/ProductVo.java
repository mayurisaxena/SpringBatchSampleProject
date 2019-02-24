package may.practice.spring.batch.vo;

import java.beans.Transient;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PRODUCT_LIST")
public class ProductVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String productId;

	private String productName;

	private String productQty;

	private String productPrice;

	private String currency;

	@XmlElement(name = "PRODUCT_ID")
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@XmlElement(name = "PRODUCT_NAME")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@XmlElement(name = "PRODUCT_QTY")
	public String getProductQty() {
		return productQty;
	}

	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}

	@XmlElement(name = "PRODUCT_PRICE")
	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@XmlElement(name = "CURRENCY")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
