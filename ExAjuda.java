public class ExAjuda {
    public static void executar() {
        String nome = Prompt.lerLinha("Digite o seu nome: ");
        double nota = Prompt.lerDecimal("Digite o seu nota: ");
        
        Prompt.imprimir("Nome: " + nome);
        Prompt.imprimir("Nota " + nota);
    }
}
