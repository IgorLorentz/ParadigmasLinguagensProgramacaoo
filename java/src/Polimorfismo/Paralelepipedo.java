package Polimorfismo;

public class Paralelepipedo extends Figuras{
    Paralelepipedo(String nome, double dim1, double dim2, double dim3){
        this.nome = nome;
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }
    public double volume() {
        double volume;
        volume = dim1 * dim2 * dim3;
        return volume;
    }

    public double area() {
        double area;
        area = (2 * dim1 * dim2) + (2 * dim1 * dim3) + (2 * dim2 * dim3);
        return area;
    }
    void display(){
        System.out.println(nome + dim1 + dim2 + dim3);
    }
    public void aumentar(){
        dim1 = aumento*dim1;
        dim2 = aumento*dim2;
        dim3 = aumento*dim3;
    }
}
