package Exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PilhaTeste { 

    private Pilha pilha; 

    @BeforeEach
    void setUp() {
        pilha = new Pilha(); 
    }

    // --- TESTES DE SUCESSO E ESTADO ---

    @Test
    void testPilhaRecemCriadaDeveRetornarTrue() {
        assertTrue(pilha.isEmpty(), "A pilha nova deve iniciar vazia.");
    }

    @Test
    void testPilhaAposPushDeveRetornarFalse() {
        pilha.push("Primeiro");
        assertFalse(pilha.isEmpty(), "A pilha não deve estar vazia após um push.");
    }

    @Test
    void testOrdemLIFO() {
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        assertEquals("C", pilha.pop());
        assertEquals("B", pilha.pop());
        assertEquals("A", pilha.pop());
        assertTrue(pilha.isEmpty());
    }

    // --- TESTES DE VALORES DE BORDA ---

    @Test
    void testPushStringVaziaENull() {
        pilha.push("");
        pilha.push(null);

        assertNull(pilha.pop(), "O topo deveria ser null");
        assertEquals("", pilha.pop(), "O próximo deveria ser a string vazia");
    }

    @Test
    void testPopEPeekEmPilhaVazia() {
        assertNull(pilha.pop(), "Pop em pilha vazia deve retornar null.");
        assertNull(pilha.peek(), "Peek em pilha vazia deve retornar null.");
    }

    @Test
    void testPeekNaoRemoveElemento() {
        pilha.push("Item");
        assertEquals("Item", pilha.peek());
        assertEquals("Item", pilha.peek(), "Chamar peek de novo deve retornar o mesmo elemento.");
        assertEquals("Item", pilha.pop(), "O pop seguinte ainda deve encontrar o elemento.");
    }

    // --- TESTE COMPLEXO: CAPTURANDO SYSTEM.OUT ---

    @Test
    void testPrintComElementos() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(saidaCapturada));

        try {
            pilha.push("A"); 
            pilha.push("B"); 
            pilha.push("C"); 
            
            pilha.print();   

            String resultado = saidaCapturada.toString().trim();
            assertEquals("C -> B -> A -> null.", resultado);
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void testPrintPilhaVazia() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(saidaCapturada));

        try {
            pilha.print(); 
            
            String resultado = saidaCapturada.toString().trim();
            assertEquals("null.", resultado);
        } finally {
            System.setOut(originalOut);
        }
    }
}
