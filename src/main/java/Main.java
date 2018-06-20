import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentExistsException{
    Document doc = null;
    DocumentFactory document = new DocumentFactory();
    List<Document> documents = new ArrayList<Document>();
         for (int k = 0; k < 3; k++) {
            doc = document.getDocument(Task.class);
            documents.add(doc);
            doc = document.getDocument(Incoming.class);
            documents.add(doc);
            doc = document.getDocument(Outgoing.class);
            documents.add(doc);
         }

        for (String n: DocumentFactory.authorList) {
            System.out.println('\n'+n+":");
                for (Document document1 : documents) {
                    if (document1.getAuthor().equals(n)) {
                        System.out.println(document1);
                    }
                }
        }
    }
}
