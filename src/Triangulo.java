public class Triangulo {

    private int base;
    private int altura;
    private int lado1;
    private int lado2;

    public Triangulo(int base, int altura, int lado1, int lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }

    public int calcularPerimetro(){
        return base+lado1+lado2;
    }
}
