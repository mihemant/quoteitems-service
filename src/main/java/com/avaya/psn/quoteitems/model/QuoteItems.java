package com.avaya.psn.quoteitems.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class QuoteItems {
	@Id
	int quoteItemId;
	int configId;
	String offerTag;
	String offerName;
	String offerType;
	boolean InCart;
	String qTags;
	LocalDateTime DateUpdated;
	String updatedBy;
	float offerPrice;
	float offerListPrice;
	String scheduling;
	String schedulingIdentifier;
	boolean deliveryInterval;
	String myCodes;
	boolean updateRequired;
	String sddFile;
	
	public QuoteItems() {
		
	}
	
	public QuoteItems(int configId,String offerTag,String offerName,float offerPrice,String offerType) {
		this.configId=configId;
		this.offerTag=offerTag;
		this.offerName = offerName;
		this.offerPrice =offerPrice;
		this.offerType=offerType;
	}
	
	public int getConfigId() {
		return configId;
	}
	public void setConfigId(int configId) {
		this.configId = configId;
	}
	public String getOfferTag() {
		return offerTag;
	}
	public void setOfferTag(String offerTag) {
		this.offerTag = offerTag;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public boolean isInCart() {
		return InCart;
	}
	public void setInCart(boolean inCart) {
		InCart = inCart;
	}
	public String getqTags() {
		return qTags;
	}
	public void setqTags(String qTags) {
		this.qTags = qTags;
	}
	public LocalDateTime getDateUpdated() {
		return DateUpdated;
	}
	public void setDateUpdated(LocalDateTime dateUpdated) {
		DateUpdated = dateUpdated;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public float getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(float offerPrice) {
		this.offerPrice = offerPrice;
	}
	public float getOfferListPrice() {
		return offerListPrice;
	}
	public void setOfferListPrice(float offerListPrice) {
		this.offerListPrice = offerListPrice;
	}
	public String getScheduling() {
		return scheduling;
	}
	public void setScheduling(String scheduling) {
		this.scheduling = scheduling;
	}
	public String getSchedulingIdentifier() {
		return schedulingIdentifier;
	}
	public void setSchedulingIdentifier(String schedulingIdentifier) {
		this.schedulingIdentifier = schedulingIdentifier;
	}
	public boolean isDeliveryInterval() {
		return deliveryInterval;
	}
	public void setDeliveryInterval(boolean deliveryInterval) {
		this.deliveryInterval = deliveryInterval;
	}
	public String getMyCodes() {
		return myCodes;
	}
	public void setMyCodes(String myCodes) {
		this.myCodes = myCodes;
	}
	public boolean isUpdateRequired() {
		return updateRequired;
	}
	public void setUpdateRequired(boolean updateRequired) {
		this.updateRequired = updateRequired;
	}
	public String getSddFile() {
		return sddFile;
	}
	public void setSddFile(String sddFile) {
		this.sddFile = sddFile;
	}
	
}
