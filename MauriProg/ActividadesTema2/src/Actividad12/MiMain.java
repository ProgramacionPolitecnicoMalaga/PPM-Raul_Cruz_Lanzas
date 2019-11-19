package Actividad12;

public class MiMain {
    public static void main(String[] args) {
        Listas listas = new Listas();

        Vehiculos barco1 = new Barcos("Pinta", "12/02/2005", "20/07/2009", 23, 34.4, 45, 21.2);
        Vehiculos camion1 = new Camiones("FGJ5624", "11/02/2017", "23/12/2018", 3567, 2.0, 1.45, 3.54);
        Vehiculos coche1 = new Coches("12/03/2004", "11/03/2014", 1456432, "123465FCZ",2.11, 1, 2.12);
        Vehiculos barco2 = new Barcos("Santa", "12/02/2006", "20/07/2010", 10203, 34.4, 45, 21.2);
        Vehiculos camion2 = new Camiones("LBC5624", "16/11/2019", "23/10/2019", 356703, 2.0, 1.45, 3.54);
        Vehiculos coche2 = new Coches("11/08/2005", "11/11/2019", 225467, "3344RTF", 2.22, 1.12, 2.45);

        Compradores comprador1 = new PersonasFisicas("Asiel", "Rodriguez", "33442121D", "C/Lainez");
        Compradores comprador2 = new PersonasFisicas("Federico", "Cruz", "32411121E", "C/Cruz");
        Compradores comprador3 = new PersonasFisicas("Manuel", "Rosillon", "33677621T", "C/Fernandez");
        Compradores comprador4 = new PersonasFisicas("Raul", "Romero", "33897634G", "C/Sielva");

        System.out.println("---------------");
        System.out.println("Introducir nuevos vehiculos en el deposito: ");
        System.out.println("---------------");
        listas.añadirVehiculoEspera(coche1);
        listas.añadirVehiculoEspera(coche2);
        listas.añadirVehiculoEspera(barco1);
        listas.añadirVehiculoEspera(barco2);
        listas.añadirVehiculoEspera(camion1);
        listas.añadirVehiculoEspera(camion2);
        listas.obtenerListaEspera();
        System.out.println("--------------");
        System.out.println("Poner en subasta algunos vehiculos: ");
        System.out.println("--------------");
        listas.añadirVehiculoSubasta(barco1);
        listas.añadirVehiculoSubasta(barco2);
        listas.añadirVehiculoSubasta(coche1);
        listas.añadirVehiculoSubasta(camion2);
        listas.obtenerListaSubasta();
        System.out.println("--------------");
        System.out.println("Vender vehiculos a compradores y listarlos: ");
        listas.venderVehiculo(barco1, comprador1, 500000, "10/07/2008");
        listas.venderVehiculo(barco2, comprador2, 100000, "21/01/2018");
        listas.venderVehiculo(coche1, comprador3, 34000, "11/03/2008");
        listas.venderVehiculo(camion2, comprador4, 125000, "30/06/2001");
        listas.obtenerListaVendidos();
        System.out.println("Listado completo de los vehiculos: ");
        System.out.println("---------------");
        listas.obtenerListadoCompletoVehiculos();
    }


}
