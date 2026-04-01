public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("--- SIMULAÇÃO DE 12 MESES (TAXA 4%) ---");
        System.out.printf("%-10s | %-15s | %-15s%n", "MÊS", "SAVER 1", "SAVER 2");
        System.out.println("--------------------------------------------------");

        for (int mes = 1; mes <= 12; mes++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            
            System.out.printf("Mês %02d    | $%-14.2f | $%-14.2f%n", 
                              mes, saver1.getBalance(), saver2.getBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("--- SIMULAÇÃO DE 12 MESES (TAXA 5%) ---");
        System.out.printf("%-10s | %-15s | %-15s%n", "MÊS", "SAVER 1", "SAVER 2");
        System.out.println("--------------------------------------------------");

        for (int mes = 1; mes <= 12; mes++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            
            System.out.printf("Mês %02d    | $%-14.2f | $%-14.2f%n", 
                              mes, saver1.getBalance(), saver2.getBalance());
    
        }
    }
}
