package proyectomodelosi;

class FabricaBicicletas implements BicicletaFactory {
    @Override
    public Bicicleta crearBicicleta(TipoBicicleta tipo) {
        switch (tipo) {
            case COMUN:
                return new BicicletaComun();
            case ELECTRICA:
                return new BicicletaElectrica();
            default:
                throw new IllegalArgumentException("Tipo de bicicleta no válido");
        }
    }
}