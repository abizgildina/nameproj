package ru.abizgildina;

import ru.abizgildina.exceptions.DocumentExistsException;
import ru.abizgildina.factory.DocumentType;
import ru.abizgildina.factory.Factory;
import ru.abizgildina.model.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Метод для вывода отчета
 */
public class Main {
    public static void main(String[] args) throws DocumentExistsException {
        Factory factory = new Factory();
        List<Document> documents = new ArrayList<Document>();
        for (int k = 0; k < 5; k++) {
            documents.add(factory.getDocument(DocumentType.Task1));
            documents.add(factory.getDocument(DocumentType.Outgoing1));
            documents.add(factory.getDocument(DocumentType.Incoming1));
        }
        for (String authorName: Factory.authorList) {
            System.out.println('\n'+authorName+":");
            for (Document doc : documents) {
                if (doc.getAuthorName().equals(authorName)) {
                    System.out.println(doc);
                }
            }
        }

    }
}
