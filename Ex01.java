public class Ex01 {
    public static void executar() {
        double[] valores = new double[5];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = Prompt.lerDecimal("Digito o " + (i + 1) + "° número: ");
        }

        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        double media = soma / valores.length;

        Prompt.imprimir("Média: " + media);

        Prompt.imprimir("Valores menores que a média: ");
        for (double valor : valores) {
            if (valor < media) {
                Prompt.imprimir(valor);
            }
        }

        Prompt.imprimir("Valores iguais a média: ");
        for (double valor : valores) {
            if (valor == media) {
                Prompt.imprimir(valor);
            }
        }

        Prompt.imprimir("valores maiores que a média:");
        for (double valor : valores) {
            if (valor > media) {
                Prompt.imprimir(valor);
            }
        }
    }
}
