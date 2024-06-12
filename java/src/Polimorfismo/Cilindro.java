package Polimorfismo;

public class Cilindro extends Figuras {

    Cilindro(String nome, double dim1, double dim2) {
        this.nome = nome;
        this.dim1 = dim1;
        this.dim2 = dim2;

    }

    public double volume() {
        double volume;
        volume = Math.PI * Math.pow(dim1, 2) * dim2;
        return volume;
    }

    public double area() {
        double area;
        area = (2 * Math.PI * dim1) * (dim1 + dim2);
        return area;
    }
    void display(){
        System.out.println(nome + dim1 + dim2);
    }

    public void aumentar(){
        dim1 = aumento*dim1;
        dim2 = aumento*dim2;
    }
}
