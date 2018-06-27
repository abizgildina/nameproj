package ru.abizgildina.factory;

import ru.abizgildina.model.Document;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class DocumentFactory {
    public final Random rand = new Random();
    public static   List<String> humanList = Arrays.asList("Иванов Иван Иванович", "Петров Петр Петрович", "Николаев Николай Николаевич","Сергеев Сергей Сергеевич");
    protected List<String> deliveryMethodList = Arrays.asList("Способ 1","Способ 2","Способ 3");
    protected List<Boolean> attributeList = Arrays.asList(true,false);

    public abstract Document getDocument();
}
