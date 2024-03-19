public class Ex02 {
    public static void executar() {
        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");

        double[] valores = new double[tamanho];

        for (int i = 0; i < valores.length; i++) {
           valores[i] = Prompt.lerDecimal("Posição " + i + ":");
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 0){
                Prompt.imprimir("Numero: " + valores[i] + " --- " + "Posição: " + i + " --- " + "Positivo");
            } else if (valores[i] < 0) {
                Prompt.imprimir("Numero: " + valores[i] + " --- " + "Posição: " + i + " --- " + "Negativo");
            } else {
                Prompt.imprimir("Numero: " + valores[i] + " --- " + "Posição: " + i + " --- " + "É Zero");
            }
        }
    }
}
