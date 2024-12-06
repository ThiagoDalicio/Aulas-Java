package Zoo;

public class Animal {
    private String cor;
    private String raca;
    private double peso;
    private String nome;

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("O peso não pode ser negativo.");
        }
        this.peso = peso;
    }

    public String getTamanho() {
        if (peso <= 3) {
            return "Pequeno";
        } else if (peso <= 5) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal.");
    }

    public void saltar() {
        System.out.println("Animal está saltando.");
    }
}
