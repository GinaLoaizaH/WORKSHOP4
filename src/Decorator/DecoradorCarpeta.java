package Decorator;

import Composite.Carpeta;
import Composite.ComponenteFuncionable;

abstract class DecoradorCarpeta implements ComponenteFuncionable {

    protected Carpeta carpeta;

    public DecoradorCarpeta(Carpeta carpeta) {
        this.carpeta = carpeta;
    }

    @Override
    public void buscar(String buscar) {
        carpeta.buscar(buscar);
    }

    @Override
    public void borrar(Carpeta padre) {
        carpeta.borrar(padre);
    }

    @Override
    public ComponenteFuncionable copiar() {
        return carpeta.copiar();
    }

    @Override
    public void mostrarArchivos() {
        carpeta.mostrarArchivos();
    }

    @Override
    public String getNombre() {
        return carpeta.getNombre();
    }
}
