package Exemplo; 

import java.time.LocalDate;

public class CalendarDay {
    /**
     * Calcula o nome do dia da semana para uma data fornecida.
     * Utiliza a API JSR-310 para garantir precisão histórica e suporte a ISO-8601.
     */
    public String findDay(int day, int month, int year) {
        
        // LocalDate.of() valida automaticamente a existência da data (ex: bissextos e meses curtos).
        // Se a data for inválida, uma DateTimeException é lançada nativamente.
        return LocalDate.of(year, month, day) 
                        .getDayOfWeek() // Retorna a instância do Enum DayOfWeek
                        .name();        // Retorna a representação textual exata da constante (ex: "SUNDAY")
    }
}
