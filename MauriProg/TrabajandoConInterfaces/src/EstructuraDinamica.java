public interface EstructuraDinamica {
    public Personas getElementoEnPosicion(int i);
    public void removeElementoEnPosicion(int i);
    public default void duplicarEspacio(){
        System.out.println("Duplicar espacio");
    }
}
