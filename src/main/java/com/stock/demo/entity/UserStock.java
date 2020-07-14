package com.stock.demo.entity;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "User_Stock")
public class UserStock {
	@Id
	@NotNull(message = "ID is required")
	@Column(name = "user_stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userStockId;
	@Column(name = "stock_id")
	@NotEmpty(message = "stock id is required")
	private String stockId;
	@Column(name = "stock_price")
	@NotNull(message = "stock price is required")
	private String stockPrice;
	@Column(name = "stock_date")
	@NotNull(message = "date is required")
	private String stockDate;
	@Column(name = "user_id")
	@NotNull(message = "userid column is required")
	private String userId;
	@Column(name = "quantity")
	@NotNull(message = "quantity column is required")
	private String quantity;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "User_id")
	@JsonIgnore
	private User user;
	public Long getUserStockId() {
		return userStockId;
	}
	public void setUserStockId(Long userStockId) {
		this.userStockId = userStockId;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getStockDate() {
		return stockDate;
	}
	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
}