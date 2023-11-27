package proyectomodelosi;

class Biciparqueadero extends BiciparqueaderoObservable {
    private static Biciparqueadero instancia = null;

    private Biciparqueadero() {
        // Constructor privado para evitar la creación directa de instancias
    }

    public static Biciparqueadero obtenerInstancia() {
        if (instancia == null) {
            instancia = new Biciparqueadero();
        }
        return instancia;
    }

    public void estacionarBicicleta(String idBicicleta) {
        // Lógica para estacionar una bicicleta
        System.out.println("Se ha estacionado la bicicleta con ID: " + idBicicleta);
        notificarObservadores(idBicicleta);
    }

    public void retirarBicicleta(String idBicicleta) {
        // Lógica para retirar una bicicleta
        System.out.println("Se ha retirado la bicicleta con ID: " + idBicicleta);
    }
}
