package ru.abizgildina.factory;

import ru.abizgildina.model.Document;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class DocumentFactory {
    public final Random rand = new Random();
    protected List<String> senderList = Arrays.asList("Отправитель 1","Отправитель 2","Отправитель 3");
    protected List<String> addresseeList = Arrays.asList("Адресат 1","Адерсат 2","Адресат 3");
    protected List<String> deliveryMethodList = Arrays.asList("Способ 1","Способ 2","Способ 3");
    protected List<String> executorList = Arrays.asList("Исполнитель 1","Исполнитель 2","Исполнитель 3");
    protected List<String> attributeList = Arrays.asList("Контроль"," ");
    protected List<String> controllerList = Arrays.asList("Контролер 1","Контролер 2","Контролер 3");

    public abstract Document getDocument();
}
