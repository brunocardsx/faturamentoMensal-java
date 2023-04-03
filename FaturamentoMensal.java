import java.util.ArrayList;
import java.util.Scanner;

public class FaturamentoMensal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> faturamentoDiario = new ArrayList<Double>();
        int numeroDias = 0;
        double totalFaturamento = 0.0;
        double maiorFaturamento = 0.0;
        double menorFaturamento = Double.MAX_VALUE;

        System.out.print("Informe o número de dias do mês: ");
        numeroDias = scanner.nextInt();

        for (int i = 1; i <= numeroDias; i++) {
            System.out.printf("Informe o faturamento do dia %d: ", i);
            double faturamento = scanner.nextDouble();
            faturamentoDiario.add(faturamento);
            totalFaturamento += faturamento;

            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }

            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
        }

        double mediaFaturamento = totalFaturamento / numeroDias;
        int diasAcimaMedia = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);
    }

}