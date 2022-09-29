package com.stream.generate;

public class CreditCardTransactionInfo {
	private String transactionId;
	private String transactionSenderNumber;
	private String transactionSenderName;
	private String transactionRecieverName;
	private String transactionRecieverNumber;
	private float transactionAmount;
	private String transactionDate;
	private String transactionTime;
	private String senderZipCode;
	private String receiverZipCode;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionSenderNumber() {
		return transactionSenderNumber;
	}
	public void setTransactionSenderNumber(String transactionSenderNumber) {
		this.transactionSenderNumber = transactionSenderNumber;
	}
	public String getTransactionSenderName() {
		return transactionSenderName;
	}
	public void setTransactionSenderName(String transactionSenderName) {
		this.transactionSenderName = transactionSenderName;
	}
	public String getTransactionRecieverName() {
		return transactionRecieverName;
	}
	public void setTransactionRecieverName(String transactionRecieverName) {
		this.transactionRecieverName = transactionRecieverName;
	}
	public String getTransactionRecieverNumber() {
		return transactionRecieverNumber;
	}
	public void setTransactionRecieverNumber(String transactionRecieverNumber) {
		this.transactionRecieverNumber = transactionRecieverNumber;
	}
	public float getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getSenderZipCode() {
		return senderZipCode;
	}
	public void setSenderZipCode(String senderZipCode) {
		this.senderZipCode = senderZipCode;
	}
	public String getReceiverZipCode() {
		return receiverZipCode;
	}
	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}
}