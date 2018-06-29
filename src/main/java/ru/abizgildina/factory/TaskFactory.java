package ru.abizgildina.factory;

import ru.abizgildina.model.Document;
import ru.abizgildina.model.Task;

import java.util.Date;

public class TaskFactory extends DocumentFactory{

    /**
     * Метод для заполнения документа рандомными значениями
     * @return Документ Поручение
     */
    public Document getDocument() {
        String executor = humanList.get(rand.nextInt(humanList.size()-1));
        Boolean attributeControl = attributeList.get(rand.nextInt(attributeList.size()-1));
        Date taskDate = new Date(Math.abs(System.currentTimeMillis() - rand.nextLong()));
        String controllerName = humanList.get(rand.nextInt(humanList.size()));

        //Создание объекта "Поручение" и заполнение полей объекта
        Task task = new Task();
        task.setTaskDate(taskDate);
        task.setTaskRealise(rand.nextInt(20)+1);
        task.setAttributeControl(attributeControl);
        task.setExecutor(executor);
        task.setControllerName(controllerName);

        return task;
    }
}
