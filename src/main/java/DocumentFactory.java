import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DocumentFactory {
    private final Random rand = new Random();
    public static List<String> authorList = Arrays.asList("Иванов Иван Иванович", "Петров Петр Петрович", "Николаев Николай Николаевич");
    public String authorName;
    public long registrationNumber;
    private static Set<Long> set = new TreeSet<Long>();

    /**
     *  Метод, проверяющий существование документа с одинаковым регистрационным номером
     * @param registrationNumber Регистрационный номер
     * @return уже существует/ не существует
     */
    private static boolean uniquenessCheck(long registrationNumber) {
        return !set.contains(registrationNumber);
    }
    /**
     * Метод, создающий документ в соответствии с переданнным классом
     * @param classs Класс одного из возможных документов
     * @return Документ
     * @throws DocumentExistsException Ошибка, на случай создания документа с уже существующим регистрационным номером
     */
    public Document getDocument(Class classs) throws DocumentExistsException {
        Document document;
        registrationNumber = ((long) rand.nextInt(100000) + 1);
        if (!uniquenessCheck(registrationNumber)) {
            throw new DocumentExistsException();
        }
        set.add(registrationNumber);
        if (classs.isAssignableFrom(Task.class)) {
            document = new TaskFactory().getTask();
        } else if (classs.isAssignableFrom(Incoming.class)) {
            document = new IncomingFactory().getIncoming();
        } else if (classs.isAssignableFrom(Outgoing.class)) {
            document = new OutgoingFactory().getOutgoing();
        } else
            throw new IllegalArgumentException();
        authorName = authorList.get(rand.nextInt(authorList.size()));

        //Заполнение полей объекта рандомными значениями
        document.setIdDocument((long) (rand.nextInt(1000000) + 1));
        document.setAuthorName(authorName);
        document.setRegnum(registrationNumber);
        document.setDateRegistration(new Date(Math.abs(System.currentTimeMillis() - rand.nextLong())));
        document.setNameDocument(Long.toHexString(Double.doubleToLongBits(Math.random())));
        document.setTextDocument(Long.toHexString(Double.doubleToLongBits(Math.random())));

        return document;
    }
}
