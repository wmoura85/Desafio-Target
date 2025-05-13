# Desafio Técnico

## Vaga Desenvolvedor de Sistemas Jr


## 📋 Exercícios

### ✅ Questão 1 – Soma Sequencial utilizando `while`

Calcula a soma dos números de 1 até 13.

**Classe:** `Q1.CalculaSoma`

**Resposta:**

```
Valor final de SOMA: 91
```

---

### ✅ Questão 2 – Verificador de Fibonacci (O(1))

Determina se um número pertence à sequência de Fibonacci usando teste de quadrado perfeito.

**Classe:** `Q2.VerificaFibonacci`

**Entrada:** via console (número inteiro)

**Resposta:**

```
21 faz parte da sequência de Fibonacci.
22 NÃO faz parte da sequência de Fibonacci.
```

---

### ✅ Questão 3 – Análise de Faturamento Mensal

Lê arquivo `dados.json` com faturamento diário e calcula:

* Menor valor (ignora 0)
* Maior valor
* Média mensal (dias com faturamento > 0)
* Número de dias com faturamento acima da média

**Classes:**

* `Q3.FaturamentoDiario` (record)
* `Q3.FaturamentoMensal`


**Resposta (exemplo):**

```
Menor faturamento: R$ 373,78
Maior faturamento: R$ 48.924,24
Média (dias com faturamento): R$ 31.556,81
Dias acima da média: 10
```

---

### ✅ Questão 4 – Percentual de Faturamento por Estado

Calcula o percentual de participação de cada estado no faturamento total, usando dados fixos do enunciado.

**Classe:** `Q4.PercentualFaturamento`

**Resposta:**

```
Percentual de faturamento por estado:
  SP: 37,21%
  RJ: 20,13%
  MG: 16,06%
  ES: 14,94%
  Outros: 10,66%
```

---

### ✅ Questão 5 – Inversão de String

Inverte uma string sem usar métodos prontos, percorrendo manualmente um array de caracteres.

**Classe:** `Q5.StringReversa`

**Entrada:** via console (texto livre)

**Resposta (exemplo):**

```
Original: Desafio Java
Invertida: avaJ ojsafeD
```

---

## ▶️ Como executar

1. Importe o projeto no IntelliJ como Maven/Gradle.
2. Adicione dependência do **Gson** em `pom.xml` para a Questão 3.
3. Coloque `dados.json` em `src/main/resources` e marque como *Resources*.
4. Execute cada classe com `main()` no IntelliJ ou por linha de comando:

   ```bash
   mvn clean compile exec:java -Dexec.mainClass="br.com.java.QX.NomeDaClasse"
   ```

---

## ✔️ Observações

* Código escrito com foco em legibilidade, modularidade e uso de records em Java 16+.
* Sem uso de métodos prontos (exceto `toCharArray`,`Math.sqrt`, `printf`).
* Estrutura de pastas alinhada ao padrão Maven.
