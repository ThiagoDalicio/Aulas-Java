package Zoo;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void saltar() {
        System.out.println("O gato está saltando suavemente.");
    }
}
