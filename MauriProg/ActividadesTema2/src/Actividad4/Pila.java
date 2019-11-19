package Actividad4;

public class Pila {
    final static int LONGITUD_MAXIMA = 1000;
    private static Object Pila;
    int[] enteros;
        int numElementos;

        public Pila(int longitudMaxima) {
            enteros = new int[LONGITUD_MAXIMA];
            numElementos = 0;
        }

        public void insertar(int robot) {
            numElementos++;
            enteros[numElementos] = robot;
        }

        public void extraer() {
            numElementos--;
        }

        public int cima() {
            return enteros[numElementos - 1];
        }

        public int[] getEnteros() {
            return enteros;
        }

        public void setEnteros(int[] enteros) {
            this.enteros = enteros;
        }

        public static int getLongitudMaxima() {
            return LONGITUD_MAXIMA;
        }

        public int getNumElementos() {
            return numElementos;
        }

        public static void main(String[] args) {
            Pila = new Pila(LONGITUD_MAXIMA);

        }
}
