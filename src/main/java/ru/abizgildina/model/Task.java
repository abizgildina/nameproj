package ru.abizgildina.model;

import java.util.Date;
/**
 * Класс нужен для описания докуемента Поручение
 */
public class Task extends Document {
    /**
     * Создание поля для даты выдачи поручения
     */
    private Date taskDate;
    /**
     * Создание поля для срока исполнения поручения
     */
    private int taskRealise;
    /**
     * Создание поля для ответственного исполнителя
     */
    private String executor;
    /**
     * Создание поля для признака контрольности докуемента
     */
    private String attributeControl;
    /**
     * Создание поля для имени контролера поручения
     */
    private String controllerName;

    @Override
    public String toString() {
        return "\tПоручение " + super.toString();
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public int getTaskRealise() {
        return taskRealise;
    }

    public void setTaskRealise(int taskRealise) {
        this.taskRealise = taskRealise;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getAttributeControl() {
        return attributeControl;
    }

    public void setAttributeControl(String attributeControl) {
        this.attributeControl = attributeControl;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }
}

