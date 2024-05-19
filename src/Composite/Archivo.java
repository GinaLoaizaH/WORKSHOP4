package Composite;

public class Archivo implements ComponenteFuncionable {
    private int contadorCopia;
    private String nombre;


    public Archivo(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public void buscar(String buscar) {
        if (nombre.toLowerCase().contains(buscar.toLowerCase())) {
            System.out.println("*Archivo encontrado con nombre " + nombre);
        } else {
            System.out.println("No se econtró archivo con nombre " + buscar);
        }
    }

    @Override
    public void borrar(Carpeta padre) {
        System.out.println("borrando archivo " + nombre);
        if(padre != null) {
            padre.removerComponente(this);
        }
    }

    @Override
    public ComponenteFuncionable copiar() {
        contadorCopia++;
        System.out.println("Copiando Archivo "+ nombre);
        return new Archivo(nombre + "_copy" + contadorCopia);
    }

    @Override
    public void mostrarArchivos() {
        System.out.println("Archivo: " + nombre);

    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
