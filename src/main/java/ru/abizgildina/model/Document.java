package ru.abizgildina.model;

import ru.abizgildina.utils.DateFormat;
import ru.abizgildina.interfaces.Storable;

import java.util.Date;

/**
 * Класс для описания документа
 */

public abstract class Document implements Comparable<Document>, Storable {
    /**
     * Создание поля для идентификатора докуемента
     */
    private long id;
    /**
     * Создание поля для имени докуемента
     */
    private String name;
    /**
     * Создание поля для текста докуемента
     */
    private String text;
    /**
     * Создание поля для регистрационного номера докуемента
     */
    private Long registrationNumber;
    /**
     * Создание поля для даты регистрации докуемента
     */
    private Date dateRegistration;
    /**
     * Создание поля для имени автора докуемента
     */
    private String authorName;

    public int compareTo(Document s){
        //условие на проверку неравенства дат
        if (dateRegistration.compareTo(s.dateRegistration) != 0) {
            //Если не равны, сортировать по дате
            return dateRegistration.compareTo(s.dateRegistration);
        }
        else {
            //Если равны сортировать по регистрационному номеру
            return registrationNumber.compareTo(s.registrationNumber);
        }
    }

    @Override
    public String toString() {
        return "№" + id +" от " + DateFormat.format(dateRegistration) + ". " + name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getRegnum(long regNum) {
        return this.registrationNumber;
    }

    public void setRegnum(long regNum) {
        this.registrationNumber = regNum;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

