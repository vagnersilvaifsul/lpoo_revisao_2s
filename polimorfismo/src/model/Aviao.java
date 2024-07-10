package model;

public class Aviao extends Personagem {
    private double z;

    public Aviao() {
    }

    public Aviao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenha um avião");
    }

    public void mover(double x, double y, double z){
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Aviao{" +
            "x=" + x +
            ", y=" + y +
            "} ";
    }
}
