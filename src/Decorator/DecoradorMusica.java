package Decorator;

import Composite.Carpeta;
import Composite.ComponenteFuncionable;

public class DecoradorMusica extends DecoradorCarpeta{

    public DecoradorMusica(ComponenteFuncionable decoradorCarpeta) {
        super(decoradorCarpeta);
    }

    @Override
    public void buscar(String buscar) {

    }

    @Override
    public void borrar(Carpeta padre) {

    }

    @Override
    public ComponenteFuncionable copiar() {
    return null;
    }

    @Override
    public void mostrarArchivos() {

    }


}


