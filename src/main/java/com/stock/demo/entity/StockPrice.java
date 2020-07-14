package com.stock.demo.entity;


import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Stock_Price")
public class StockPrice {
	@Id
	@NotNull(message = "ID is required")
	@Column(name = "stock_price_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stockPriceId;
	@Column(name = "stock_id")
	@NotEmpty(message = "stock id is required")
	private Long stockId;
	@Column(name = "stock_price")
	@NotNull(message = "stock price is required")
	private Double stockPrice;
	@Column(name = "stock_date")
	@NotNull(message = "date is required")
	private Date stockDate;
	@Column(name = "price_differ_from_preday")
	@NotNull(message = "price differ column is required")
	private Double priceDiffPreDay;
	public Long getStockPriceId() {
		return stockPriceId;
	}
	public void setStockPriceId(Long stockPriceId) {
		this.stockPriceId = stockPriceId;
	}
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public Double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Date getStockDate() {
		return stockDate;
	}
	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}
	public Double getPriceDiffPreDay() {
		return priceDiffPreDay;
	}
	public void setPriceDiffPreDay(Double priceDiffPreDay) {
		this.priceDiffPreDay = priceDiffPreDay;
	}
	
	
}	
