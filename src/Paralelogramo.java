public class Paralelogramo {


    private int altura;
    private int base;

    public Paralelogramo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }
}
