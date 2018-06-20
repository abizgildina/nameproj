import java.util.*;

public class DocumentFactory {
    private final Random rand = new Random();
    public static List<String> authorList = Arrays.asList("Иванов Иван Иванович","Петров Петр Петрович","Николаев Николай Николаевич");
    public String autName;
    public long regNum;

    private static Set<Long> set = new TreeSet<Long>();
    private static boolean regnum_uniq(long regNum){
        if (set.contains(regNum)) {
            return false;
        } else
            return true;
    }

    public Document getDocument(Class classs) throws DocumentExistsException {
        Document document;
        regNum = ((long) rand.nextInt(100000) + 1);
        if (!regnum_uniq(regNum)) {
            throw new DocumentExistsException();
        }
        set.add(regNum);

            if (classs.isAssignableFrom(Task.class)) {
                document = new TaskFactory().getTask();
            } else if (classs.isAssignableFrom(Incoming.class)) {
                document = new IncomingFactory().getIncoming();

            } else if (classs.isAssignableFrom(Outgoing.class)) {
                document = new OutgoingFactory().getOutgoing();
            } else
                throw new IllegalArgumentException();

            autName = authorList.get(rand.nextInt(authorList.size()));


            document.setIdDoc((long) (rand.nextInt(1000000) + 1));
            document.setAuthor(autName);
            document.setRegnum(regNum);
            document.setDateRegistration(new Date(Math.abs(System.currentTimeMillis() - rand.nextLong())));
            document.setNameDoc("Название документа");
            document.setTextDoc("Текст");

            return document;

    }
}
