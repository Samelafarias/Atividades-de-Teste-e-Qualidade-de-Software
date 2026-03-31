public class Employee {
    private String primeiroNome;
    private String ultimoNome;
    private double salarioMes;

    public Employee(String primeiroNome, String ultimoNome, double salarioMes){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;

        //so deixa inicializar se o número for positivo
        if (salarioMes > 0.0) {
            this.salarioMes = salarioMes;
        }
    }

    //se o novo salario for negaivo ele vai ignorar a mudança
    public void setSalarioMes(double salarioMes) {
        if (salarioMes > 0.0){
            this.salarioMes = salarioMes;
        }
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public double getSalarioAnual() {
        return salarioMes * 12;
    }
}