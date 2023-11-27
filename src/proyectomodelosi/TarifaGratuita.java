package proyectomodelosi;

class TarifaGratuita implements Observer {
    @Override
    public void notificarEstacionamiento(String idBicicleta) {
        System.out.println("Estacionamiento gratuito para la bicicleta con ID: " + idBicicleta + "!");
    }
}