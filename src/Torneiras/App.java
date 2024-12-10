package Torneiras;

// Classe principal, o uso da torneira
public class App {
    public static void main(String[] args) throws Exception {
        Torneiras torneira = new Torneiras();
        
        // Solicita ao usuário se deseja abrir a torneira
        System.out.println("Deseja abrir a torneira? (sim/não ou s/n): ");
        byte[] entrada = new byte[100]; // Buffer para capturar a entrada do usuário
        int bytesLidos = System.in.read(entrada); // Lê a entrada do teclado
        String resposta = new String(entrada, 0, bytesLidos).trim().toLowerCase(); // Converte para minúsculo e remove espaços extras

        // Verifica a resposta do usuário
        if (resposta.equals("sim") || resposta.equals("s")) { // Aceita "sim" ou "s"
            torneira.abrir(); // Chama o método para abrir a torneira

            // Solicita ao usuário o fluxo desejado
            System.out.println("Defina o fluxo (0 a 10): ");
            bytesLidos = System.in.read(entrada); // Lê a entrada do teclado para o fluxo
            int fluxo = Integer.parseInt(new String(entrada, 0, bytesLidos).trim()); // Converte para um número inteiro
            torneira.ajustarFluxo(fluxo); // Ajusta o fluxo da torneira

            // Solicita o tempo que a torneira ficará aberta
            System.out.println("Por quantos segundos a torneira ficará aberta? ");
            bytesLidos = System.in.read(entrada); // Lê a entrada do teclado para o tempo
            int segundos = Integer.parseInt(new String(entrada, 0, bytesLidos).trim()); // Converte para um número inteiro
            torneira.registrarConsumo(segundos); // Registra o consumo com base no fluxo e no tempo

        } else if (resposta.equals("não") || resposta.equals("nao") || resposta.equals("n")) { // Aceita "não", "nao" ou "n"
            // Mensagem informando que a torneira permanece fechada
            System.out.println("Torneira permanece fechada.");
        } else {
            // Mensagem de erro para entradas inválidas
            System.out.println("Resposta inválida. Reinicie o programa e tente novamente.");
        }

        // Exibe o consumo total acumulado
        torneira.exibirConsumoTotal();
    }
}