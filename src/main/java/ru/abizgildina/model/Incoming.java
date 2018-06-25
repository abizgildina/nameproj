package ru.abizgildina.model;

import java.util.Date;
/**
 * Класс нужен для описания Входящего документа
 */
public class Incoming extends Document {
    /**
     * Создание поля для отправителя докуемента
     */
    private String sender;
    /**
     * Создание поля для адресата докуемента
     */
    private String addressee;
    /**
     * Создание поля для исходящего номера докуемента
     */
    private int outgoingNumber;
    /**
     * Создание поля для исходящей даты регистрации докуемента
     */
    private Date outgoingDate;

    @Override
    public String toString() {
        return "\tВходящий " + super.toString();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public int getOutgoingNumber() {
        return outgoingNumber;
    }

    public void setOutgoingNumber(int outgoingNumber) {
        this.outgoingNumber = outgoingNumber;
    }

    public Date getOutgoingDate() {
        return outgoingDate;
    }

    public void setOutgoingDate(Date outgoingDate) {
        this.outgoingDate = outgoingDate;
    }
}
