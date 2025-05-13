package Q4;

public class PercentualFaturamento {

    public static void main(String[] args) {
        String[] estados = {"SP", "RJ","MG", "ES", "Outros"};
        double[] valores = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        //somar o total
        double total = 0.0;
        for ( double v : valores) {
            total += v;
        }

        //calculo e print dos resultados
        System.out.println("Percentual de Faturamento por estado: ");
        for (int i = 0; i < estados.length; i++) {
            double pct = (valores[i] / total) * 100;
            System.out.printf(" %s: %.2f%%%n", estados[i], pct);
        }
    }
}
