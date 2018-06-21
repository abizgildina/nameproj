import java.util.Date;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class TaskFactory {
    private final Random rand = new Random();
    List<String> executorList = Arrays.asList("Исполнитель 1","Исполнитель 2","Исполнитель 3");
    List<String> attributeList = Arrays.asList("Контроль"," ");
    List<String> controllerList = Arrays.asList("Контролер 1","Контролер 2","Контролер 3");

    /**
     * Метод для заполнения документа рандомными значениями
     * @return Документ Поручение
     */
    public  Document getTask() {
        String executor = executorList.get(rand.nextInt(executorList.size()-1));
        String attributeControl = attributeList.get(rand.nextInt(executorList.size()-1));
        Date taskDate = new Date(Math.abs(System.currentTimeMillis() - rand.nextLong()));
        String controllerName = controllerList.get(rand.nextInt(controllerList.size()));

        //Создание объекта "Поручение" и заполнение полей объекта
        Task task = new Task();
        task.setTaskDate(taskDate);
        task.setTaskRealise(rand.nextInt(20)+1);
        task.setAttributeControl(attributeControl);
        task.setExecutor(executor);
        task.setControllerName(controllerName);

        return task;
    }
}
