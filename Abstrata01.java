abstract class Veiculo {

    String modelo;
    int ano;
    String cor;

    public Veiculo(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    abstract void mover();

    void mostrarDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}

class Carro extends Veiculo {

    public Carro(String modelo, int ano, String cor) {
        super(modelo, ano, cor);
    }

    @Override
    void mover() {
        System.out.println("O carro esta se movendo.");
    }
}

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro(
            "Corolla",
            2025,
            "Prata"
        );

        carro.mostrarDados();
        carro.mover();
    }
}
