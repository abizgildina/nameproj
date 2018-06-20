import java.util.Date;

public class Task extends Document {
    private Date taskDate;          //Дата выдачи поручения
    private int taskRealise;        //Срок исполнения поручения
    private String executer;     //Ответственный исполнитель
    private String attribControl;   //Признак контрольности
    private String controlName; //Имя контроллера

    @Override
    public String toString() {
        return "    Поручение " + super.toString();
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public int getTaskRealise() {
        return taskRealise;
    }

    public void setTaskRealise(int taskRealise) {
        this.taskRealise = taskRealise;
    }

    public String getExecuter() {
        return executer;
    }

    public void setExecuter(String executer) {
        this.executer = executer;
    }

    public String getAttribControl() {
        return attribControl;
    }

    public void setAttribControl(String attribControl) {
        this.attribControl = attribControl;
    }

    public String getControlName() {
        return controlName;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }
}

