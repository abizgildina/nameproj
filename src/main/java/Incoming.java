import java.util.Date;

public class Incoming extends Document {
    private String senderName;      //Отправитель
    private String Addressee;    //Адресат
    private int outgoingNumber;             //Исходящий номер
    private Date outgoingDate;        //Исходящая дата регистрации


    @Override
    public String toString() {
        return "    Входящий " + super.toString();
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getAddressee() {
        return Addressee;
    }

    public void setAddressee(String addressee) {
        this.Addressee = addressee;
    }

    public int getOutgoingNumber() {
        return outgoingNumber;
    }

    public void setOutgoingNumber(int outgoingNumber) {
        this.outgoingNumber = outgoingNumber;
    }

    public Date getOutgoingDate() {
        return outgoingDate;
    }

    public void setOutgoingDate(Date outgoingDate) {
        this.outgoingDate = outgoingDate;
    }
}
