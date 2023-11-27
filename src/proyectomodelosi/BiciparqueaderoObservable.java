package proyectomodelosi;

import java.util.ArrayList;
import java.util.List;

class BiciparqueaderoObservable {
    private List<Observer> observadores = new ArrayList<>();

    public void registrarObservador(Observer observer) {
        observadores.add(observer);
    }

    public void eliminarObservador(Observer observer) {
        observadores.remove(observer);
    }

    public void notificarObservadores(String idBicicleta) {
        for (Observer observer : observadores) {
            observer.notificarEstacionamiento(idBicicleta);
        }
    }
}