import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class IncomingFactory {
    private final Random rand = new Random();

    List<String> senderList = Arrays.asList("Отправитель 1","Отправитель 2","Отправитель 3");

    List<String> incList = Arrays.asList("Адресат 1","Адерсат 2","Адресат 3");

    public Document getIncoming(){

        String senderName = senderList.get(rand.nextInt(senderList.size()));
        String inAddresse = incList.get(rand.nextInt(incList.size()));

        Date outDatereg = new Date(Math.abs(System.currentTimeMillis() - rand.nextLong()));


        Document incoming = new Incoming();

        ((Incoming)incoming).setOutgoingNumber(rand.nextInt(32000)+1);
        ((Incoming)incoming).setSenderName(senderName);
        ((Incoming)incoming).setAddressee(inAddresse);
        ((Incoming)incoming).setOutgoingDate(outDatereg);

        return incoming;
    }
}
