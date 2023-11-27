package proyectomodelosi;

class LucesDecorator implements AccesorioBicicleta {
    private Bicicleta bicicleta;

    public LucesDecorator(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public String tipo() {
        return bicicleta.tipo() + " con Luces";
    }

    @Override
    public String obtenerAccesorios() {
        return "Luces";
    }
}