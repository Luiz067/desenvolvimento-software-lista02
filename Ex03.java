public class Ex03 {
    public static void executar() {
        int tamanho = Prompt.lerInteiro("Tamanho do vetor: ");

        double[] valores = new double[tamanho];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = Prompt.lerDecimal("Valor " + (i + 1) + ":");
        }

        double[] dobros = new double[tamanho];

        for (int i = 0; i < valores.length; i++) {
            dobros[i] = (valores[i] * 2);
        }

        Prompt.imprimir("Dobro dos valores: ");
        for (double num : dobros) {
            Prompt.imprimir(num);
        }
    }
}