import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class IncomingFactory {
    private final Random rand = new Random();
    List<String> senderList = Arrays.asList("Отправитель 1","Отправитель 2","Отправитель 3");
    List<String> addresseeList = Arrays.asList("Адресат 1","Адерсат 2","Адресат 3");

    /**
     * Метод для заполнения документа рандомными значениями
     * @return Входящий документ
     */
    public Document getIncoming(){
        String sender = senderList.get(rand.nextInt(senderList.size()));
        String addressee = addresseeList.get(rand.nextInt(addresseeList.size()));
        Date outgoingDate = new Date(Math.abs(System.currentTimeMillis() - rand.nextLong()));

        //Создание объекта "Входящие" и заполнение полей объекта
        Incoming incoming = new Incoming();
        incoming.setOutgoingNumber(rand.nextInt(32000)+1);
        incoming.setSender(sender);
        incoming.setAddressee(addressee);
        incoming.setOutgoingDate(outgoingDate);

        return incoming;
    }
}
