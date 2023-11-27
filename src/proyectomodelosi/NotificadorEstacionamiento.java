package proyectomodelosi;

class NotificadorEstacionamiento implements Observer {
    @Override
    public void notificarEstacionamiento(String idBicicleta) {
        System.out.println("Se ha estacionado la bicicleta con ID: " + idBicicleta);
    }
}