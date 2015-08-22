package com.teddygu.treedomain.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="TREE_PRICE_DETAIL", schema="netheart")
public class TreePriceDetail {

	@Id
	@GeneratedValue(generator="TableIdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.TableGenerator", name="TableIdGen", parameters={
			@Parameter(name = "table_name", value = "TPDID_GENERATE"),
			@Parameter(name = "segment_value", value = "tpdId"),
			@Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "10")
	})
	private Long tpdId;
	@Column(name = "PURCHASE_PRICE", nullable = false, unique = false)
	private String purchasePrice;
	@Column(name = "SALE_PARICE", nullable = false, unique = false)
	private Boolean saleParice;
	@Column(name = "TAX", nullable = false, unique = false)
	private String tax;
	@Column(name = "PURCHASE_PERCENT", nullable = false, unique = false)
	private Date purchasePercent;
	@Column(name = "SALE_PERCENT", nullable = false, unique = false)
	private Date salePercent;
	@Column(name = "PROFIT", nullable = false, unique = false)
	private Date profit;
	/**
	 * @return the tpdId
	 */
	public Long getTpdId() {
		return tpdId;
	}
	/**
	 * @param tpdId the tpdId to set
	 */
	public void setTpdId(Long tpdId) {
		this.tpdId = tpdId;
	}
	/**
	 * @return the purchasePrice
	 */
	public String getPurchasePrice() {
		return purchasePrice;
	}
	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	/**
	 * @return the saleParice
	 */
	public Boolean getSaleParice() {
		return saleParice;
	}
	/**
	 * @param saleParice the saleParice to set
	 */
	public void setSaleParice(Boolean saleParice) {
		this.saleParice = saleParice;
	}
	/**
	 * @return the tax
	 */
	public String getTax() {
		return tax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(String tax) {
		this.tax = tax;
	}
	/**
	 * @return the purchasePercent
	 */
	public Date getPurchasePercent() {
		return purchasePercent;
	}
	/**
	 * @param purchasePercent the purchasePercent to set
	 */
	public void setPurchasePercent(Date purchasePercent) {
		this.purchasePercent = purchasePercent;
	}
	/**
	 * @return the salePercent
	 */
	public Date getSalePercent() {
		return salePercent;
	}
	/**
	 * @param salePercent the salePercent to set
	 */
	public void setSalePercent(Date salePercent) {
		this.salePercent = salePercent;
	}
	/**
	 * @return the profit
	 */
	public Date getProfit() {
		return profit;
	}
	/**
	 * @param profit the profit to set
	 */
	public void setProfit(Date profit) {
		this.profit = profit;
	}

}
