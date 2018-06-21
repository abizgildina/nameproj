import java.util.Date;

/**
 * Класс для описания документа
 */

public abstract class Document implements Comparable<Document>, Storable{
    /**
     * Создание поля для идентификатора докуемента
     */
    private long idDocument;
    /**
     * Создание поля для имени докуемента
     */
    private String nameDocument;
    /**
     * Создание поля для текста докуемента
     */
    private String textDocument;
    /**
     * Создание поля для регистрационного номера докуемента
     */
    private Long registrationNumber;
    /**
     * Создание поля для даты регистрации докуемента
     */
    private Date dateRegistration;
    /**
     * Создание поля для имени автора докуемента
     */
    private String authorName;

    public int compareTo(Document s){
        //условие на проверку неравенства дат
        if (dateRegistration.compareTo(s.dateRegistration) != 0) {
            //Если не равны, сортировать по дате
            return dateRegistration.compareTo(s.dateRegistration);
        }
        else {
            //Если равны сортировать по регистрационному номеру
            return registrationNumber.compareTo(s.registrationNumber);
        }
    }

    @Override
    public String toString() {
        return "№" + idDocument +" от " + DateFormat.DateFormat(dateRegistration) + ". " + nameDocument;
    }

    public long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(long idDocument) {
        this.idDocument = idDocument;
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public String getTextDocument() {
        return textDocument;
    }

    public void setTextDocument(String textDocument) {
        this.textDocument = textDocument;
    }

    public long getRegnum(long regNum) {
        return this.registrationNumber;
    }

    public void setRegnum(long regNum) {
        this.registrationNumber = regNum;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

