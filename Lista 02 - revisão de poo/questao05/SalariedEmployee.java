package questao05;

public class SalariedEmployee extends Employee {

    private double salarioSemanal;

    public SalariedEmployee(String primeiro, String ultimo, String cpf, double salario) {
        super(primeiro, ultimo, cpf);
        this.salarioSemanal = salario > 0 ? salario : 0;
    }

    @Override
    public double earnings(){
        return salarioSemanal;
    }

    @Override
    public String toString(){
        return String.format("Assalariado: %s\nSalário Semanal: %.2f", super.toString(), salarioSemanal);
    }
}
