import java.util.Date;

public class Outgoing extends Document {
    private String outAddressee;   //Адресат
    private String delivery;        //Способ доставки


    @Override
    public String toString() {
        return "    Исходящий " + super.toString();
    }

    public String getOutAddressee() {
        return outAddressee;
    }

    public void setOutAddressee(String outAddressee) {
        this.outAddressee = outAddressee;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}
