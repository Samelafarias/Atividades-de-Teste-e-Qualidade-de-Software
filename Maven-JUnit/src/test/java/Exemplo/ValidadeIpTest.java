package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadeIpTest {
    ValidadeIp validator = new ValidadeIp();
    
    @Test
    void testeIpValido() {
        assertTrue(validator.validade("192.168.0.1"));
        assertTrue(validator.validade("255.255.255.255")); 
        assertTrue(validator.validade("0.0.0.0"));         
    }
    
    @Test
    void testeIpInvalido() {
        assertFalse(validator.validade("192.168.0.256"));
    }
    
    @Test
    void testeIpMuitosBlocos() {
        assertFalse(validator.validade("192.168.0.1.5"));
    }
    
    @Test
    void testeIpComLetras() {
        assertFalse(validator.validade("abc.def.fgh.ijk")); 
        assertFalse(validator.validade("192.168.0.abc"));
    }
    
    @Test
    void testeIpNulo() {
        assertFalse(validator.validade(""));
        assertFalse(validator.validade(null));
    }
}
