package Decorator;

import Composite.Carpeta;
import Composite.ComponenteFuncionable;

public class DecoradorImagen extends DecoradorCarpeta{

    public DecoradorImagen(Carpeta carpeta) {
        super(carpeta);
    }

    public void presentacionCarpetaImagen(){
        System.out.println("Mostrando imagenes de la carpeta: " + getNombre());
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
