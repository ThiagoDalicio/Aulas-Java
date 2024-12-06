package Zoo;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        if (getPeso() <= 3) {
            System.out.println("Au! (som de cachorro pequeno)");
        } else if (getPeso() <= 5) {
            System.out.println("Auuuu (som de cachorro médio)");
        } else {
            System.out.println("Auuuuuuu (som de cachorro grande)");
        }
    }

    @Override
    public void saltar() {
        System.out.println("O cachorro está saltando com energia.");
    }
}
