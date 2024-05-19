package Decorator;

import Composite.Carpeta;
import Composite.ComponenteFuncionable;

public class DecoradorMusica extends DecoradorCarpeta {

    public DecoradorMusica(Carpeta carpeta) {
        super(carpeta);
    }

    public void escucharMusica() {
        System.out.println("Escuchando Musica de la carpeta: "+ getNombre());
    }

    @Override
    public void buscar(String buscar) {
        super.buscar(buscar);
    }

    @Override
    public void borrar(Carpeta padre) {
        super.borrar(padre);
    }

    @Override
    public ComponenteFuncionable copiar() {
        return super.copiar();
    }

}


