package ru.abizgildina.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    /**
     * Метод, принимающий дату и возвращающий ее в формате "dd.MM.yyyy"
     * @param date Дата
     * @return Форматрованная дата
     */
    public static String format(Date date) {
        return new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH).format(date);
    }
}