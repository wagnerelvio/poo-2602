
abstract class Veiculo {
    protected String modelo;
    protected double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public abstract void mover();

    // Metodo abstrato para o preco final
    public abstract double calcularPrecoFinal();

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.printf("Preco base: R$ %.2f%n", preco);
        System.out.printf("Preco final: R$ %.2f%n",
                          calcularPrecoFinal());
    }
}

class Carro extends Veiculo {
    public Carro(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public void mover() {
        System.out.println("O carro anda sobre quatro rodas.");
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.10;
    }
}

class Moto extends Veiculo {
    public Moto(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public void mover() {
        System.out.println("A moto anda sobre duas rodas.");
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}

class Caminhao extends Veiculo {
    public Caminhao(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public void mover() {
        System.out.println("O caminhao transporta cargas.");
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.15;
    }
}

public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = {
            new Carro("Toyota Corolla", 80000),
            new Moto("Honda CG 160", 20000),
            new Caminhao("Volvo FH", 250000)
        };

        for (Veiculo v : veiculos) {
            v.exibirDados();
            v.mover();
            System.out.println("--------------------");
        }
    }
}
