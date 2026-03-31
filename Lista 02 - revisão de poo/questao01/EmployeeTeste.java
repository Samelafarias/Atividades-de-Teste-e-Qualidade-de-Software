public class EmployeeTeste {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Samela", "Farias", 3000.0);

        System.out.println("Salario Anual:" + emp1.getSalarioAnual());

        double novoSalario = emp1.getSalarioMes() * 1.10;
        emp1.setSalarioMes(novoSalario);

        System.out.println("Salario anual com 10%:" + emp1.getSalarioAnual());
    }
}
