import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    public static String DateFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy",Locale.ENGLISH);
        return dateFormat.format(date);
    }
}