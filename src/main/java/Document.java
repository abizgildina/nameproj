import java.util.Date;

public abstract class Document implements Comparable<Document>, Storable{

    private long idDoc;           //идентификатор
    private String nameDoc;         //название документа
    private String textDoc;         //текст документа
    private Long registrationNumber;          //регистрационный номер
    private Date dateRegistration;           //дата регистрации документа
    private String author;         //автор документа


    public int compareTo(Document s){
        if (dateRegistration.compareTo(s.dateRegistration)!=0) {
            return dateRegistration.compareTo(s.dateRegistration);
        }
        else {
            return registrationNumber.compareTo(s.registrationNumber);
        }
    }


    @Override
    public String toString() {
        return
                "№" + idDoc +" от " + DateFormat.DateFormat(dateRegistration) + ". " + nameDoc;
    }

    public long getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(long idDoc) {
        this.idDoc = idDoc;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public String getTextDoc() {
        return textDoc;
    }

    public void setTextDoc(String textDoc) {
        this.textDoc = textDoc;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

