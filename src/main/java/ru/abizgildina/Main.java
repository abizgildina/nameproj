package ru.abizgildina;

import org.slf4j.LoggerFactory;
import ru.abizgildina.exceptions.DocumentExistsException;
import ru.abizgildina.factory.DocumentFactory;
import ru.abizgildina.factory.DocumentType;
import ru.abizgildina.factory.Factory;
import ru.abizgildina.interfaces.Storable;
import ru.abizgildina.model.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Метод для вывода отчета
 */
public class Main {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args)  {
        Factory factory = new Factory();
        List<Document> documents = new ArrayList<Document>();
        for (int k = 0; k < 5; k++) {
            try {
                documents.add(factory.getDocument(DocumentType.Task1));
                documents.add(factory.getDocument(DocumentType.Outgoing1));
                documents.add(factory.getDocument(DocumentType.Incoming1));
            } catch (DocumentExistsException ex) {
                logger.error(ex.getMessage());
            }
        }
        for (String authorName : DocumentFactory.humanList) {
            logger.debug("\n"+authorName.toString()+":");
            for (Document doc : documents) {
                if (doc.getAuthorName().equals(authorName)) {
                    logger.info(doc.toString());
                }
            }
        }
    }
    public void get(Storable entity){
        entity.getId();
    }
}
