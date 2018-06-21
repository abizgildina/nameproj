import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OutgoingFactory {
    private final Random rand = new Random();
    List<String> deliveryMethodList = Arrays.asList("Способ 1","Способ 2","Способ 3");
    List<String> addresseeList = Arrays.asList("Адресат 1","Адерсат 2","Адресат 3");

    /**
     * Метод для заполнения документа рандомными значениями
     * @return Исходящий документ
     */
    public Document getOutgoing(){
        String deliveryMethod = deliveryMethodList.get(rand.nextInt(deliveryMethodList.size()));
        String addressee = addresseeList.get(rand.nextInt(deliveryMethodList.size()));

        //Создание объекта "Исходящие" и заполнение полей объекта
        Outgoing outgoing = new Outgoing();
        outgoing.setDeliveryMethod(deliveryMethod);
        outgoing.setAddressee(addressee);

        return outgoing;
    }
}
