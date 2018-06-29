import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Класс для определения персонала
 */
@XmlRootElement(name ="Person")
public class Person extends Staff implements Comparable<Person> {
    /**
     * фамилия
     */
    private String surname;
    /**
     * имя
     */
    private String firstName;
    /**
     * отчество
     */
    private String lastName;
    /**
     * должности
     */
    private String post;

    public String getSurname() {
        return surname;
    }
    @XmlElement
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }
    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPost() {
        return post;
    }
    @XmlElement
    public void setPost(String post) {
        this.post = post;
    }

    public String getShortName(){
        StringBuilder shortName = new StringBuilder();
        shortName
                .append(surname != null ? surname : "")
                .append(" ")
                .append(firstName != null ? firstName : "")
                .append(" ")
                .append(lastName != null ? lastName : "");
          return shortName.toString();
    }
    @Override
    public String getStoreName(){
        return "Person";
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return  surname  + " " + firstName + " " + lastName + " " + post;
    }
}
