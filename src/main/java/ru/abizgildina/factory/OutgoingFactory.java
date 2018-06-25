package ru.abizgildina.factory;

import ru.abizgildina.model.Document;
import ru.abizgildina.model.Outgoing;

public class OutgoingFactory extends DocumentFactory{
    /**
     * Метод для заполнения документа рандомными значениями
     * @return Исходящий документ
     */
    @Override
    public Document getDocument(){
        String deliveryMethod = deliveryMethodList.get(rand.nextInt(deliveryMethodList.size()));
        String addressee = addresseeList.get(rand.nextInt(deliveryMethodList.size()));

        //Создание объекта "Исходящие" и заполнение полей объекта
        Outgoing outgoing = new Outgoing();
        outgoing.setDeliveryMethod(deliveryMethod);
        outgoing.setAddressee(addressee);

        return outgoing;
    }
}
