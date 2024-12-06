package Zoo;

public class Jacare extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Resmungo (som de jacaré)");
    }

    @Override
    public void saltar() {
        System.out.println("O jacaré não salta, mas rasteja e nada!");
    }

    public void nadar() {
        System.out.println("O jacaré está nadando.");
    }
}
