import Composite.Archivo;
import Composite.Carpeta;
public class Main {

    public static void main(String[] args) {


        //Archivos Documentos
        Archivo archivo1 = new Archivo("TrabajoU.txt");
        //Archivos Musica
        Archivo archivo2 = new Archivo("SinTi.mp3");
        Archivo archivo3 = new Archivo("ConejoMalo.mp3");
        //Archivos Imagenes
        Archivo archivo4 = new Archivo("ParaisoTi.jpg");


        Carpeta raiz = new Carpeta("DISCO C");
        raiz.agregarComponente(archivo1);

        Carpeta carpetaMusica= new Carpeta("CARPETA MUSICA");
        carpetaMusica.agregarComponente(archivo2);
        carpetaMusica.agregarComponente(archivo3);

        Carpeta carpetaImagenes = new Carpeta("CARPETA IMAGENES");
        carpetaImagenes.agregarComponente(archivo4);

        raiz.mostrarArchivos();

        System.out.println("*******************");

        archivo3.borrar(carpetaMusica);

        carpetaMusica.mostrarArchivos();

        System.out.println("*******************");
        raiz.agregarComponente(carpetaMusica);
        raiz.agregarComponente(carpetaImagenes);
        raiz.mostrarArchivos();
        System.out.println("-------------------------------------------------");
        carpetaImagenes.agregarComponente(archivo4.copiar());
        raiz.mostrarArchivos();

        raiz.buscar("ti");




    }
}
