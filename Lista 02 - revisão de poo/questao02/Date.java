public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        if (dia > 0 && dia <= 31) 
            this.dia = dia;
        if (mes > 0 && mes <= 12)
            this.mes = mes;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%d%n", dia, mes, ano);
    }
}
