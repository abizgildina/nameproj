package ru.abizgildina.factory;

import ru.abizgildina.exceptions.DocumentExistsException;
import ru.abizgildina.model.Document;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Factory {
    private final Random rand = new Random();
    public static List<String> authorList = Arrays.asList("Иванов Иван Иванович", "Петров Петр Петрович", "Николаев Николай Николаевич");
    public String authorName;
    public long registrationNumber;
    private static Set<Long> existingRegnums = new TreeSet<Long>();
    /**
     *  Метод, проверяющий существование документа с одинаковым регистрационным номером
     * @param registrationNumber Регистрационный номер
     * @return уже существует/ не существует
     */
    private static boolean checkRegnum(long registrationNumber) {
        return !existingRegnums.contains(registrationNumber);
    }

    public Document getDocument(DocumentType documentType) throws DocumentExistsException {
        Document document = documentType.getDocumentFactory().getDocument();
        registrationNumber = ((long) rand.nextInt(100000) + 1);
        if (!checkRegnum(registrationNumber)) {
            throw new DocumentExistsException("ru.abizgildina.exceptions.DocumentExistsException",null);
        }
        existingRegnums.add(registrationNumber);

        authorName = authorList.get(rand.nextInt(authorList.size()));

        //Заполнение общих полей объекта рандомными значениями
        document.setIdDocument((long) (rand.nextInt(1000000) + 1));
        document.setAuthorName(authorName);
        document.setRegnum(registrationNumber);
        document.setDateRegistration(new Date(Math.abs(System.currentTimeMillis() - rand.nextLong())));
        document.setNameDocument(Long.toHexString(Double.doubleToLongBits(Math.random())));
        document.setTextDocument(Long.toHexString(Double.doubleToLongBits(Math.random())));

        return document;
    }
}
