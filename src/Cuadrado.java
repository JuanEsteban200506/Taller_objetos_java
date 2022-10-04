public class Cuadrado {
    //El area del cuadrado es lado por lado

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }
    //El perimetro es igual a el lado *4

    public int calcularPerimetro() {
        return lado * 4;
    }
}
