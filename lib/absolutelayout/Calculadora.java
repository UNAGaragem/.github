public class Calculadora {

    private int a;
    private int b;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int somar() {
        return a + b;
    }

    public int subtrair() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public int dividir() {
        if (b > 1) {
            return a / b;
        }
        return 0;

    }

}