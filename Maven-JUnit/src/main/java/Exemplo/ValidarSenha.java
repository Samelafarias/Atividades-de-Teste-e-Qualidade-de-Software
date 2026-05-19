package Exemplo;

public class ValidarSenha {
    public boolean ehValida(String senha) {
        if (senha == null) return false;


        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[?!@#$%&*()+\\-])[A-Za-z0-9?!@#$%&*()+\\-]{6,}";

        return senha.matches(regex);
    }
}
