package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carpeta implements ComponenteFuncionable {
    private String nombre;
    private int contador;
    private List<ComponenteFuncionable> componentes = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComponente(ComponenteFuncionable componente) {
        componentes.add(componente);
    }

    public void removerComponente(ComponenteFuncionable componente) {
        componentes.remove(componente);
    }

    @Override
    public void buscar(String buscar) {
        System.out.println("Buscando en carpeta " + nombre);
        for (ComponenteFuncionable componente : componentes) {
            componente.buscar(buscar);
        }
    }

    @Override
    public void borrar(Carpeta padre) {
        System.out.println("Borrando carpeta " + nombre);
        Iterator<ComponenteFuncionable> iterator = componentes.iterator();
        while (iterator.hasNext()) {
            ComponenteFuncionable componente = iterator.next();
            componente.borrar(this);
            iterator.remove(); // Eliminar cada componente
        }

        if (padre != null) {
            padre.removerComponente(this);
        }
    }

    @Override
    public ComponenteFuncionable copiar() {
        contador++;
        System.out.println("Copiando carpeta");
        Carpeta carpetaCopia = new Carpeta(this.nombre + "_copy " + contador);
        for (ComponenteFuncionable componente : componentes) {
            carpetaCopia.agregarComponente(componente.copiar());
        }
        return carpetaCopia;
    }

    @Override
    public void mostrarArchivos() {
        System.out.println("Carpeta: " + nombre);
        for (ComponenteFuncionable componente : componentes) {
            componente.mostrarArchivos();
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }


}
