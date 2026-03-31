package questao05;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double salarioBase;

    public BasePlusCommissionEmployee(String primeiro, String ultimo, String cpf, double ofertas, double rate, double salarioBase){
        super(primeiro, ultimo, cpf, ofertas, rate);
        this.salarioBase = salarioBase;
    }

    @Override
    public double earnings(){
        return salarioBase + super.earnings();
    }
    
}
