public class DiarioTemperaturas  implements ConsumidorDeTemperaturas{
   private double TemperaturasPorHoras[];

   public DiarioTemperaturas(){
       TemperaturasPorHoras = new double[24];
   }

    @Override
    public void setNuevaTemperatura(double temperatura, int hora) {
       TemperaturasPorHoras[hora] = temperatura;
    }

    public String toString(){
       String cadena = " ";
       for(int i=0; i < TemperaturasPorHoras.length; i++){
           cadena += i + "(" +TemperaturasPorHoras[i] + ") -";
       }
       return cadena;
    }
}
