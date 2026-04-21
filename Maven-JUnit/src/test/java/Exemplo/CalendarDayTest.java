package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.DateTimeException; 

class CalendarDayTest {
    CalendarDay cd = new CalendarDay();

    @Test
    void testeDiaNormal() {
        assertEquals("SUNDAY", cd.findDay(12, 4, 2026));
    }

    @Test 
    void testeAnoBissexto() {
        assertEquals("THURSDAY", cd.findDay(29, 2, 2024));
    }

    @Test 
    void testeDataInvalida() {
        assertThrows(DateTimeException.class, () -> {
            cd.findDay(29, 2, 2026);
        });
    }

    @Test
    void testMesInexistente() {
        assertThrows(DateTimeException.class, () -> {
            cd.findDay(1, 13, 2026);
        });
    }
}
