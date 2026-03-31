package questao05;

public abstract class Employee {
    private String primeiroNome;
    private String ultimoNome;
    private String cpf;

    public Employee(String primeiroNome, String ultimoNome, String cpf) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s\nCPF: %s", primeiroNome, ultimoNome, cpf);
    }
}
