package Q3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class FaturamentoMensal {

    public static void main(String[] args) {
        try (Reader reader = new FileReader("dados.json")) {
            Gson gson = new Gson();
            List<FaturamentoDiario> dados = gson.fromJson(reader, new TypeToken<List<FaturamentoDiario>>() {}.getType());

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0.0;
            int diasComFaturamento = 0;

            for (FaturamentoDiario d : dados) {
                double valor = d.valor();
                if (valor > 0) {
                    menor = Math.min(menor,valor);
                    maior = Math.max(maior, valor);
                    soma += valor;
                    diasComFaturamento++;
                }
            }

            double media = soma / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            for (FaturamentoDiario d : dados) {
                if (d.valor() > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.printf("Menor faturamento: R$ %.2f%n", menor);
            System.out.printf("Maior faturamento: R$ %.2f%n",maior);
            System.out.printf("Média (dias com faturamento): R$ %.2f%n",media);
            System.out.printf("Dias acima da média: %d%n",diasAcimaDaMedia);

        } catch (Exception e) {
            System.out.println("Erro ao ler JSON: " + e.getMessage());
        }
    }
}
