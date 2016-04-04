package com.blog.samples.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funds")
public class FundEntity {
	
	@Id
	@Column(name="fundid")
	@GeneratedValue
	private String fundId;
	
	@Column(name="funddescription")
	private String fundDescription;
	
	@Column(name="bidprice")
	private double bidPrice;
	
	@Column(name="offerprice")
	private double offerPrice;
	
	private Date lastUpdated;
	
	public String getFundId() {
		return fundId;
	}
	
	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	
	public String getFundDescription() {
		return fundDescription;
	}
	
	public void setFundDescription(String fundDescription) {
		this.fundDescription = fundDescription;
	}
	
	public double getBidPrice() {
		return bidPrice;
	}
	
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	
	public double getOfferPrice() {
		return offerPrice;
	}
	
	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}
	
	public Date getLastUpdated() {
		return lastUpdated;
	}
	
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	

}
