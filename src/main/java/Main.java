import java.util.ArrayList;
import java.util.List;

/**
 * Метод для вывода отчета
 */
public class Main {
    public static void main(String[] args) throws DocumentExistsException{
        DocumentFactory document = new DocumentFactory();
        List<Document> documents = new ArrayList<Document>();
        for (int k = 0; k < 10; k++) {
            documents.add(document.getDocument(Task.class));
            documents.add(document.getDocument(Outgoing.class));
            documents.add(document.getDocument(Incoming.class));
        }
        for (String n: DocumentFactory.authorList) {
            System.out.println('\n'+n+":");
            for (Document doc : documents) {
                if (doc.getAuthorName().equals(n)) {
                    System.out.println(doc);
                }
            }
        }
    }
}
