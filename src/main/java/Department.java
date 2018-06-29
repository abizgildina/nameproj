import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name ="Department")
public class Department extends Staff {
    /**
     * Полное наименование
     */
    private String fullName;
    /**
     * Краткое наименование
     */
    private String shortName;
    /**
     * Руководитель
     */
    private String head;
    /**
     * Контактные телефоны
     */
    private String contactPhone;

    public String getFullName() {
        return fullName;
    }

    @XmlElement
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    @XmlElement
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getHead() {
        return head;
    }

    @XmlElement
    public void setHead(String head) {
        this.head = head;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    @XmlElement
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String getStoreName(){
        return "Department";
    }
}
