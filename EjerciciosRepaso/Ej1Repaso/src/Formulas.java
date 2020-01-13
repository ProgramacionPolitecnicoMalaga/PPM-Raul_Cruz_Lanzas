public class Formulas {
    public Formulas(){

    }

    public double hipotenusa(double cateto1, double cateto2){
        double formula = ((cateto1 * cateto1) + (cateto2 * cateto2));
        double hipotenusa = Math.sqrt(formula);
        return hipotenusa;
    }

    public double cateto(double cateto1, double hipotenusa){
        double formula = ((hipotenusa * hipotenusa) + (cateto1 * cateto1));
        double cateto2 = Math.sqrt(formula);
        return cateto2;
    }

    public double areaCatHip(double cateto1, double hipotenusa){
        double cateto2 = cateto(cateto1, hipotenusa);
        double area = (cateto1 * cateto2) / 2;
        return area;
    }

    public double areaCatetos(double cateto1, double cateto2){
        double area = (cateto1 * cateto2) / 2;
        return area;
    }
}
