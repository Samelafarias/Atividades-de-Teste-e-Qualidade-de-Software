public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Saldos apos 12 meses com taxa de 4%");

        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("Saver 1: $%.2f%n", saver1.getBalance());
        System.out.printf("Saver 2: $%.2f%n%n", saver2.getBalance());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saldos apos ajuste para 5% (mais 1 mês):");
        System.out.printf("Saver 1: $%.2f%n", saver1.getBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getBalance());

    }
}
