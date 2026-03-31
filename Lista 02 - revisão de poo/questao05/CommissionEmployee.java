package questao05;

public class CommissionEmployee extends Employee {
    private double vendasBrutas;
    private double taxaComissao;

    public CommissionEmployee(String primeiro, String ultimo, String cpf, double vendasBrutas, double taxaComissao){
        super(primeiro, ultimo, cpf);
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double earnings(){
        return vendasBrutas * taxaComissao;
    }
}
