public class DateTeste {
    public static void main(String[] args) {
        Date data1= new Date(31, 03, 2026);

        Date dataInvalida = new Date(40, 15, 2026);

        System.out.print("Data 1 'correta': ");
        data1.displayDate();

        System.out.print("Data 2 'incorreta': ");
        dataInvalida.displayDate();
    }
}
