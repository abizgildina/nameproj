package ru.abizgildina.factory;

import ru.abizgildina.model.Document;
import ru.abizgildina.model.Incoming;

import java.util.Date;

public class IncomingFactory extends DocumentFactory {

    /**
     * Метод для заполнения документа рандомными значениями
     * @return Входящий документ
     */
    @Override
    public Document getDocument(){
        String sender = senderList.get(rand.nextInt(senderList.size()));
        String addressee = addresseeList.get(rand.nextInt(addresseeList.size()));
        Date outgoingDate = new Date(Math.abs(System.currentTimeMillis() - rand.nextLong()));

        //Создание объекта "Входящие" и заполнение полей объекта
        Incoming incoming = new Incoming();
        incoming.setOutgoingNumber(rand.nextInt(32000)+1);
        incoming.setSender(sender);
        incoming.setAddressee(addressee);
        incoming.setOutgoingDate(outgoingDate);

        return incoming;
    }
}
