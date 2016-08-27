package team1.blotterJPA;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trade
 *
 */
@Entity
@Table(name="TRADES")
public class Trade implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long tradeID;
	
	private String productType;
	private String productName;
	private long traderID;
	private int quantity;
	private double price;
	private boolean side;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date submitTime;
	
	private String status;
	private String currency;
	private boolean media;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date executionTime;
	
	private String buyerFirm;
	private String sellerFirm;
	
	public Trade() {
		super();
	}

	/**
	 * @return the tradeID
	 */
	public long getTradeID() {
		return tradeID;
	}

	/**
	 * @param tradeID the tradeID to set
	 */
	public void setTradeID(long tradeID) {
		this.tradeID = tradeID;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the traderID
	 */
	public long getTraderID() {
		return traderID;
	}

	/**
	 * @param traderID the traderID to set
	 */
	public void setTraderID(long traderID) {
		this.traderID = traderID;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the side
	 */
	public boolean isSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(boolean side) {
		this.side = side;
	}

	/**
	 * @return the submitTime
	 */
	public Date getSubmitTime() {
		return submitTime;
	}

	/**
	 * @param submitTime the submitTime to set
	 */
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the media
	 */
	public boolean isMedia() {
		return media;
	}

	/**
	 * @param media the media to set
	 */
	public void setMedia(boolean media) {
		this.media = media;
	}

	/**
	 * @return the executionTime
	 */
	public Date getExecutionTime() {
		return executionTime;
	}

	/**
	 * @param executionTime the executionTime to set
	 */
	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}

	/**
	 * @return the buyerFirm
	 */
	public String getBuyerFirm() {
		return buyerFirm;
	}

	/**
	 * @param buyerFirm the buyerFirm to set
	 */
	public void setBuyerFirm(String buyerFirm) {
		this.buyerFirm = buyerFirm;
	}

	/**
	 * @return the sellerFirm
	 */
	public String getSellerFirm() {
		return sellerFirm;
	}

	/**
	 * @param sellerFirm the sellerFirm to set
	 */
	public void setSellerFirm(String sellerFirm) {
		this.sellerFirm = sellerFirm;
	}
   
}
