package ru.abizgildina.factory;

import ru.abizgildina.exceptions.DocumentExistsException;
import ru.abizgildina.model.Document;

import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Factory {
    private final Random rand = new Random();
    String authorName;
    long registrationNumber;
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
        authorName = DocumentFactory.humanList.get(rand.nextInt(DocumentFactory.humanList.size()));

        //Заполнение общих полей объекта рандомными значениями
        document.setId((long) (rand.nextInt(1000000) + 1));
        document.setAuthorName(authorName);
        document.setRegnum(registrationNumber);
        document.setDateRegistration(new Date(Math.abs(System.currentTimeMillis() - rand.nextLong())));
        document.setName(Long.toHexString(Double.doubleToLongBits(Math.random())));
        document.setText(Long.toHexString(Double.doubleToLongBits(Math.random())));

        return document;
    }
}
