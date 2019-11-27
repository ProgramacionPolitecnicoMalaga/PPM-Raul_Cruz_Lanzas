import java.util.Scanner;

public class GeneradorDatosTemperatura implements FuenteDeTemperaturas {
    private int ultimaHoraRegistrada;
    private double ultimaTemperaturaRegistrada;
    private ConsumidorDeTemperaturas[] consumidores;
    private final static int MAX_CONSUMIDORES = 100;
    private int numeroConsumidores;

    public GeneradorDatosTemperatura(){
        numeroConsumidores = 0;
        consumidores = new ConsumidorDeTemperaturas[MAX_CONSUMIDORES];
    }

    @Override
    public void registrarConsumidor(ConsumidorDeTemperaturas consumidor) {
        consumidores[numeroConsumidores] = consumidor;
        numeroConsumidores++;
    }

    @Override
    public void informarConsumidores() {
        for (int i=0; i < numeroConsumidores; i++){
            consumidores[i].setNuevaTemperatura(ultimaTemperaturaRegistrada, ultimaHoraRegistrada);
        }
    }

    public void nuevaLecturaDeTemperatura(double temperatura, int hora){
        this.ultimaHoraRegistrada = hora;
        this.ultimaTemperaturaRegistrada = temperatura;
        informarConsumidores();
    }
}
