package Composite;

public interface ComponenteFuncionable {
    void buscar(String buscar);
    void borrar(Carpeta padre);
    ComponenteFuncionable copiar();
    void mostrarArchivos();
    String getNombre();
}
