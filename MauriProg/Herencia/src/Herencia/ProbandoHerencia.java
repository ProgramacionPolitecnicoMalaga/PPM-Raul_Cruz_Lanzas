package Herencia;

public class ProbandoHerencia {
    public static void main(String[] args) {
        Superclase superclase = new Superclase("Punto1");
        Subclase subclase = new Subclase("Punto2");
        Subsubclase subsubclase = new Subsubclase("Punto3", 3);
        superclase.Saludo();
        subclase.Saludo();
        subsubclase.Saludo();
    }
}
