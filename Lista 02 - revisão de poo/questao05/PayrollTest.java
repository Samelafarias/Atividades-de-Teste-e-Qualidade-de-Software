package questao05;

public class PayrollTest {
    public static void main(String[] args){
        SalariedEmployee s1 = new SalariedEmployee("Ana", "Silva", "111.111.111-11", 800.00);
        HourlyEmployee h1 = new HourlyEmployee("Bruno", "Costa", "222.222.222-22", 20.00, 45);
        CommissionEmployee c1 = new CommissionEmployee("Carla", "Souza", "333.333.333-33", 10000.00, 0.06);
        BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee("Daniel", "Oliveira", "444.444.444-44", 5000.00, 0.04, 300.00);

        Employee[] employees = { s1, h1, c1, b1};

        System.out.println("Processamento da folha de pagamento:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee); 
            System.out.printf("Ganhou: $%.2f%n%n", currentEmployee.earnings()); 
        }
    }
}
