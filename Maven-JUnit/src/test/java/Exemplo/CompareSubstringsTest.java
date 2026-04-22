package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareSubstringsTest {
    CompareSubstrings cs = new CompareSubstrings();

    @Test
    void testeExemploPdf() {
        String resultado = cs.getSmallestAndLargest("welcometojava", 3);
        assertEquals("ava\nwel", resultado);
    }

    @Test
    void testeStringCurta() {
        String resultado = cs.getSmallestAndLargest("hello", 5);
        assertEquals("hello\nhello", resultado);
    }
    
    @Test
    void testeLetrasMaiusculasEMinusculas(){
    	String resultado = cs.getSmallestAndLargest("ABCDEfghijk", 2);
    	assertNotNull(resultado);
    }
}
