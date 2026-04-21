package Exemplo;

public class CompareSubstrings {
    public String getSmallestAndLargest(String s, int k) {
        // Inicializamos a menor e maior com a primeira substring possível
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Percorremos a String até o ponto onde ainda caiba uma substring de tamanho k
        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            
            // compareTo retorna < 0 se for menor alfabeticamente
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            // compareTo retorna > 0 se for maior alfabeticamente
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        // Retorna conforme o exemplo do PDF: menor e maior em linhas separadas
        return smallest + "\n" + largest;
    }
}
