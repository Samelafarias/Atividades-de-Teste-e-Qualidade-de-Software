package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareSubstringsTest {
    CompareSubstrings cs = new CompareSubstrings();

    @Test
    void testeExemploPdf() {
        String resultado = cs.getSmallestAndLargest("welcometojava", 3);
        // O PDF indica que a saída deve ser ava e wel 
        assertEquals("ava\nwel", resultado);
    }

    @Test
    void testeStringCurta() {
        // Se a string tem tamanho exato k, a maior e menor são iguais
        String resultado = cs.getSmallestAndLargest("hello", 5);
        assertEquals("hello\nhello", resultado);
    }
}
