import java.util.Date;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class TaskFactory {

        private final Random rand = new Random();

        List<String> exeList = Arrays.asList("Исполнитель 1","Исполнитель 2","Исполнитель 3");

        List<String> atList = Arrays.asList("Контроль"," ");

        List<String> controlList = Arrays.asList("Контролер 1","Контролер 2","Контролер 3");

        public  Document getTask() {

            String exeName = exeList.get(rand.nextInt(exeList.size()-1));
            String atControl = atList.get(rand.nextInt(exeList.size()-1));
            Date taskDate = new Date(Math.abs(System.currentTimeMillis() - rand.nextLong()));
            String controlName = controlList.get(rand.nextInt(controlList.size()));

            Document task = new Task();

            ((Task)task).setTaskDate(taskDate);
            ((Task)task).setTaskRealise(rand.nextInt(20)+1);
            ((Task)task).setAttribControl(atControl);
            ((Task)task).setExecuter(exeName);
            ((Task)task).setControlName(controlName);

            return task;
        }
}
