import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OutgoingFactory {

    private final Random rand = new Random();

    List<String> deliveryList = Arrays.asList("Способ 1","Способ 2","Способ 3");

    List<String> outList = Arrays.asList("Адресат 1","Адерсат 2","Адресат 3");

    public Document getOutgoing(){
        String delivery = deliveryList.get(rand.nextInt(deliveryList.size()));
        String outAddresse = outList.get(rand.nextInt(deliveryList.size()));

        Document outgoing = new Outgoing();
        ((Outgoing)outgoing).setDelivery(delivery);
        ((Outgoing)outgoing).setOutAddressee(outAddresse);

        return outgoing;
    }

}
