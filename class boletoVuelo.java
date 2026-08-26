class boletoVuelo{

String pasajero;
String destino;
double tarifaBase;
boolean llevaEquipajeExtra;

public boletoVuelo(String pasajero, String destino, double tarifaBase, boolean llevaEquipajeExtra){

    this.pasajero = pasajero;
    this.destino = destino;
    this.tarifaBase = tarifaBase;
    this.llevaEquipajeExtra = llevaEquipajeExtra;

}

public double calcularPrecioFinal(){
        if(this.llevaEquipajeExtra){
            return this.tarifaBase * 1.20;
        }
        return this.tarifaBase;
    }

void mostrarDatos(){
    System.out.println("--------------------------");
    System.out.println("Pasajero: " + pasajero);
    System.out.println("Destino: " + destino);
    System.out.println("Precio Final: $" + calcularPrecioFinal());
    System.out.println("--------------------------");

}


public static void main(String[] args) {

    boletoVuelo b1 = new boletoVuelo("Juan Perez", "Madrid-España", 1000, false);
    boletoVuelo b2 = new boletoVuelo("Marcos Fernandez", "Paris-Francia", 1500, true);

b1.mostrarDatos();

b2.mostrarDatos();


}
}