package Exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class ValidarSenhaTest { 
    ValidarSenha validador = new ValidarSenha();

    @Test
    void testeSenhaValida(){
        assertTrue(validador.ehValida("P@5sword"),
        "Cumpre todos os requisitos de uma senha segura.");
    }

    @Test
    void testeSenhaComCaracterFaltando(){
        assertFalse(validador.ehValida("P@5sw"),
        "Não aceita menos do que 6 caracteres");
    }

    @Test
    void testeSenhaSemNumero(){
        assertFalse(validador.ehValida("P@ssword"),
        "Não aceita senha sem ao menos um número");
    }

    @Test
    void testeSenhaSemLetraMinuscula(){
        assertFalse(validador.ehValida("P@5WORD"),
        "Não aceita senha sem ao menos uma letra minúscula");
    }

    @Test
    void testeSenhaSemLetraMaiuscula(){
        assertFalse(validador.ehValida("p@5sword"),
        "Não aceita senha sem ao menos uma letra maiúscula");
    }

    @Test
    void testeSenhaSemCaracterEspecial(){
        assertFalse(validador.ehValida("P5sword"),
        "Não aceita senha sem ao menos um caractere especial");
    }

    @Test
    void testeSenhaComCaracterEspecialForaDaLista(){
        assertFalse(validador.ehValida("P@5sword:"),
        "Não aceita senha com caracteres especiais fora da lista permitida");
    }

    @Test
    void testeSenhaNula(){
        assertFalse(validador.ehValida(null),
        "Não aceita senha nula");
    }

    @Test
    void testeSenhaVazia(){
        assertFalse(validador.ehValida(""),
        "Não aceita senha vazia");
    }

    @Test
    void testeSucessoLongo(){
        assertTrue(validador.ehValida("P@5sword2026!@#$"),
        "Deve aceitar senhas longas e válidas");
    }
}
