package Torneiras;

// Classe que representa a funcionalidade básica de uma torneira
public class Torneiras {
    private boolean aberta; // Indica se a torneira está aberta (true) ou fechada (false)
    private int fluxo; // Fluxo de água (valor entre 0 e 10)
    private double consumoTotal; // Total de água consumida em litros

    // Construtor: Inicializa os atributos da torneira
    public Torneiras() {
        aberta = false; // Por padrão, a torneira começa fechada
        fluxo = 0; // Fluxo inicial é zero (sem água saindo)
        consumoTotal = 0.0; // Consumo acumulado começa em zero
    }

    // Método para abrir a torneira
    public void abrir() {
        aberta = true; // Altera o estado para "aberta"
        System.out.println("Torneira aberta."); // Mensagem ao usuário
    }

    // Método para fechar a torneira
    public void fechar() {
        aberta = false; // Altera o estado para "fechada"
        System.out.println("Torneira fechada."); // Mensagem ao usuário
    }

    // Método para ajustar o fluxo de água
    public void ajustarFluxo(int novoFluxo) {
        // Verifica se o fluxo informado está dentro do intervalo permitido (0 a 10)
        if (novoFluxo >= 0 && novoFluxo <= 10) {
            fluxo = novoFluxo; // Atualiza o valor do fluxo
            System.out.println("Fluxo ajustado para: " + fluxo); // Exibe o novo fluxo
        } else {
            System.out.println("O fluxo deve estar entre 0 e 10."); // Mensagem de erro
        }
    }

    // Método para registrar o consumo de água
    public void registrarConsumo(int segundos) {
        // O consumo só é registrado se a torneira estiver aberta
        if (aberta) {
            // Calcula o consumo com base no fluxo e no tempo (segundos)
            // Fórmula: consumo = fluxo * 0.1 litros por segundo * tempo
            double consumo = (fluxo * 0.1) * segundos;

            // Atualiza o consumo total acumulado
            consumoTotal += consumo;

            // Exibe o consumo registrado durante este período
            System.out.printf("Consumo registrado: %.2f litros.\n", consumo);
        } else {
            // Mensagem indicando que não há consumo com a torneira fechada
            System.out.println("A torneira está fechada. Não há consumo.");
        }
    }

    // Método para exibir o consumo total acumulado
    public void exibirConsumoTotal() {
        // Exibe o valor total de água consumida até o momento
        System.out.printf("Consumo total acumulado: %.2f litros.\n", consumoTotal);
    }
}