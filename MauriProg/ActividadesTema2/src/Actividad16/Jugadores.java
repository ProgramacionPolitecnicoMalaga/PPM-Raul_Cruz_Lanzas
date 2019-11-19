package Actividad16;

import java.util.LinkedList;
import java.util.ListIterator;

public class Jugadores {
    private String color;
    private String nombreJugador;
    private int casillaActual;
    private int numeroDeMovimientosTotales = 0;
    LinkedList historialMovimientos;
    LinkedList redoUndo = new LinkedList();

    public Jugadores(String color, String nombreJugador){
        this.color = color;
        this.nombreJugador = nombreJugador;
        casillaActual = 0;
        historialMovimientos = new LinkedList();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getCasillaActual(){
        return casillaActual;
    }

    public void setCasillaActual(int casillaActual){
        this.casillaActual = casillaActual;
    }

    public void avanzarCasillas(int numeroCasillasAvance){
        casillaActual = casillaActual + numeroCasillasAvance;
        Movimientos avance = new Movimientos(casillaActual, "Avance ");
        historialMovimientos.addLast(avance);
        redoUndo=new LinkedList();
    }

    public void retrocederCasillas(int numeroCasillasRetrocedidas){
        casillaActual = numeroCasillasRetrocedidas;
        Movimientos retroceso = new Movimientos(casillaActual, "Retroceso ");
        historialMovimientos.addLast(retroceso);
    }

    public void historial(){
        ListIterator<Movimientos> iterator = historialMovimientos.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public void undo(){
        if(historialMovimientos.size() >= 1){
            Movimientos movimientos = (Movimientos) (historialMovimientos.removeLast());
            redoUndo.addLast(movimientos);
            if(historialMovimientos.size() > 0){
                casillaActual = ((Movimientos)(historialMovimientos.getLast())).getNumeroCasilla();
            } else{
                casillaActual = 0;
            }
        } else{
            System.out.println("Casilla de salida "+casillaActual);
        }
    }

    public void redo(){
        if(redoUndo.size() >= 1){
            Movimientos movimientos = (Movimientos)(redoUndo.getLast());
            historialMovimientos.addLast(movimientos);
            casillaActual = movimientos.getNumeroCasilla();
            redoUndo.removeLast();
        }else{
            System.out.println("No tienes mas movimientos para rehacer");
        }
    }
}
