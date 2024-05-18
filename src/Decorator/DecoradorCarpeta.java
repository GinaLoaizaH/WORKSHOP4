package Decorator;

import Composite.Archivo;
import Composite.Carpeta;
import Composite.ComponenteFuncionable;

abstract class DecoradorCarpeta implements ComponenteFuncionable {

    protected ComponenteFuncionable decoradorCarpeta;

    public DecoradorCarpeta(ComponenteFuncionable decoradorCarpeta){
        this.decoradorCarpeta = decoradorCarpeta;
    }

    @Override
    public void buscar(String buscar) {

    }

    @Override
    public void borrar(Carpeta padre) {

    }

    public ComponenteFuncionable copiar() {
        return null;
    }

}
