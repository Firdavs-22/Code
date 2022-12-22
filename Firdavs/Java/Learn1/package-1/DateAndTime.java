import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        function.write(ld+"");
        LocalTime lt = LocalTime.now();
        function.write(lt+"");
        LocalDateTime ldt = LocalDateTime.now();
        function.write(ldt+"");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd-MM-yy HH:mm");
        function.write(ldt.format(formatter));

    }
}
