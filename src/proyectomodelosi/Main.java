package proyectomodelosi;

public class Main {
    public static void main(String[] args) {
        // Obtener instancia del biciparqueadero
        Biciparqueadero parqueadero = Biciparqueadero.obtenerInstancia();

        // Crear observador para notificar el estacionamiento gratuito
        Observer tarifaGratuita = new TarifaGratuita();
        parqueadero.registrarObservador(tarifaGratuita);

        // Estacionar y retirar bicicletas
        parqueadero.estacionarBicicleta("001");
        parqueadero.retirarBicicleta("001");

        // Crear una fábrica de bicicletas y registrar una bicicleta
        BicicletaFactory fabrica = new FabricaBicicletas();
        Bicicleta bicicletaComun = fabrica.crearBicicleta(TipoBicicleta.COMUN);
        System.out.println("Se ha registrado una " + bicicletaComun.tipo());
        
        
       // Decorar la bicicleta con luces 
        AccesorioBicicleta bicicletaConLuces = new LucesDecorator(bicicletaComun);

        // Mostrar información de la bicicleta decorada
        System.out.println("Bicicleta: " + bicicletaConLuces.tipo());
        System.out.println("Accesorios: " + bicicletaConLuces.obtenerAccesorios());
    }
}