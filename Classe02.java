abstract class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    // Metodo abstrato
    public abstract void mover();

    // Metodo concreto
    public void exibirModelo() {
        System.out.println("Modelo: " + modelo);
    }
}

// Heranca
class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("O carro anda sobre quatro rodas.");
    }
}

class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("A moto anda sobre duas rodas.");
    }
}

class Caminhao extends Veiculo {
    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("O caminhao transporta cargas.");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = {
            new Carro("Toyota Corolla"),
            new Moto("Honda CG 160"),
            new Caminhao("Volvo FH")
        };

        for (Veiculo v : veiculos) {
            v.exibirModelo();
            v.mover();
            System.out.println("----------------");
        }
    }
}
