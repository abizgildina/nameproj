package ru.abizgildina.model;

/**
 * Класс нужен для описания Исходящего документа
 */
public class Outgoing extends Document {
    /**
     * Создание поля для адресата докуемента
     */
    private String addressee;
    /**
     * Создание поля для способа доставки докуемента
     */
    private String deliveryMethod;        //Способ доставки

    @Override
    public String toString() {
        return "\tИсходящий " + super.toString();
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}
