package Zoo;

public class App {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        Animal jacare = new Jacare();
        
        gato.setNome("Bola");
        gato.setCor("Branco");
        gato.setRaca("Vira Lata");
        gato.setPeso(10);

        System.out.println("Características do gato:");
        System.out.println("Cor: " + gato.getCor());
        System.out.println("Raça: " + gato.getRaca());
        System.out.println("Peso: " + gato.getPeso() + " kg");
        System.out.println("Tamanho: " + gato.getTamanho());
        System.out.println("Nome: " + gato.getNome());

        System.out.println("\nAções do gato:");
        gato.saltar();
        gato.emitirSom();
        
        cachorro.setNome("Caramelo");
        cachorro.setCor("Marrom");
        cachorro.setRaca("Vira Balde");
        cachorro.setPeso(2);

        System.out.println("\nCaracterísticas do cachorro:");
        System.out.println("Cor: " + cachorro.getCor());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Peso: " + cachorro.getPeso() + " kg");
        System.out.println("Tamanho: " + cachorro.getTamanho());
        System.out.println("Nome: " + cachorro.getNome());

        System.out.println("\nAções do cachorro:");
        cachorro.saltar();
        cachorro.emitirSom();
        
        jacare.setNome("Jaca");
        jacare.setCor("Verde");
        jacare.setRaca("Papo Amarelo");
        jacare.setPeso(15);

        System.out.println("\nCaracterísticas do jacare:");
        System.out.println("Cor: " + jacare.getCor());
        System.out.println("Raça: " + jacare.getRaca());
        System.out.println("Peso: " + jacare.getPeso() + " kg");
        System.out.println("Tamanho: " + jacare.getTamanho());
        System.out.println("Nome: " + jacare.getNome());

        System.out.println("\nAções do jacare:");
        jacare.saltar();
        jacare.emitirSom();
    }
}
