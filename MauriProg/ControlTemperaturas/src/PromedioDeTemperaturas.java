public class PromedioDeTemperaturas implements ConsumidorDeTemperaturas {
    private double promedioTemperaturas;
    private int numeroTemperaturas;

    public  PromedioDeTemperaturas(){
        promedioTemperaturas = 0;
        numeroTemperaturas = 0;
    }

    @Override
    public void setNuevaTemperatura(double temperatura, int hora) {
        numeroTemperaturas++;
        promedioTemperaturas += ((promedioTemperaturas*numeroTemperaturas)+ temperatura)/numeroTemperaturas + 1;
    }

    @Override
    public String toString() {
        return Double.toString(promedioTemperaturas);
    }
}
