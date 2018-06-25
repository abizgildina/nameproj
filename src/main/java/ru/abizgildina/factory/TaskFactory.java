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
        String executor = executorList.get(rand.nextInt(executorList.size()-1));
        String attributeControl = attributeList.get(rand.nextInt(executorList.size()-1));
        Date taskDate = new Date(Math.abs(System.currentTimeMillis() - rand.nextLong()));
        String controllerName = controllerList.get(rand.nextInt(controllerList.size()));

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
