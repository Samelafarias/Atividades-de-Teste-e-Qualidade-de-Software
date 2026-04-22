package Exemplo; 

import java.time.LocalDate;

public class CalendarDay {

    public String findDay(int day, int month, int year) {

        return LocalDate.of(year, month, day) 
                        .getDayOfWeek() 
                        .name();        
    }
}
