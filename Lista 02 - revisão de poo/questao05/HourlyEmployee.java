package questao05;

public class HourlyEmployee extends Employee{
    private double remuneracao;
    private double horas;

    public HourlyEmployee(String primeiro, String ultimo, String cpf, double remuneracao, double horas){
        super(primeiro, ultimo, cpf);
        this.remuneracao = remuneracao;
        this.horas = horas;
    }

    @Override
    public double earnings() {
        if (horas <= 40) return remuneracao * horas;
        else return (40 * remuneracao) + ((horas - 40) * remuneracao * 1.5);
    }
    
}
