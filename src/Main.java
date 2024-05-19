import Composite.Archivo;
import Composite.Carpeta;
import Decorator.DecoradorImagen;
import Decorator.DecoradorMusica;

public class Main {

    public static void main(String[] args) {


        //Archivos Documentos
        Archivo archivo1 = new Archivo("TrabajoU.txt");

        //Archivos Musica
        Archivo archivo2 = new Archivo("SinTi.mp3");
        Archivo archivo3 = new Archivo("ConejoMalo.mp3");

        //Archivos Imagenes
        Archivo archivo4 = new Archivo("Paraiso.jpg");

        // CREAMOS CARPETA RAIZ Y AGREGAMOS UN ARCHIVO
        Carpeta raiz = new Carpeta("DISCO C");
        raiz.agregarComponente(archivo1);

        // CREAMOS CARPETAS Y AGREGAMOS SUS ARCHIVOS CORRESPONDIENTES
        Carpeta carpeta1= new Carpeta("MUSICA");
        carpeta1.agregarComponente(archivo2);
        carpeta1.agregarComponente(archivo3);

        Carpeta carpeta2 = new Carpeta("IMAGENES");
        carpeta2.agregarComponente(archivo4);


        System.out.println("*****************************");

        // IMPLEMENTAMOS LOS OTROS METODOS


        // DECORAMOS LA CARPETA MUSICA Y LLAMAMOS AL METODO ESPECIAL
        DecoradorMusica carpetaMusica = new DecoradorMusica(carpeta1);


        System.out.println("\n--------METODO ESPECIALIZADO MUSICA----------");
        carpetaMusica.escucharMusica();

        // DECORAMOS LA CARPETA IMAGEN Y LLAMAMOS AL METODO ESPECIAL
        DecoradorImagen carpetaImagen = new DecoradorImagen(carpeta2);

        System.out.println("------------PRESENTACION IMAGENES--------------");
        carpetaImagen.presentacionCarpetaImagen();

        System.out.println("\n-------BUSCANDO EN LA CARPETA DECORADA-------");
        carpetaImagen.buscar("paraiso");


        System.out.println("***********************************************");
        // AGREGAMOS LAS CARPETAS (IMAGEN-MUSICA) A LA CARPETA RAIZ

        raiz.agregarComponente(carpeta1);
        raiz.agregarComponente(carpeta2);

        // MOSTRAMOS LA CARPETA RAIZ CON TODOS SUS CARPETAS Y ARCHIVOS
        System.out.println("\n------------TODAS LAS CARPETAS Y ARCHIVOS---------------");
        raiz.mostrarArchivos();

        System.out.println("\n------------BORRAR UN ARCHIVO---------------");
        archivo3.borrar(carpeta1);

        System.out.println("\n------------COPIAR UN ARCHIVO---------------");
        carpeta2.agregarComponente(archivo4.copiar());

        System.out.println("\n-----------MOSTRAR CARPETA RAIZ-------------");
        raiz.mostrarArchivos();

        System.out.println("\n-------------BUSCAR ARCHIVOS----------------");
        raiz.buscar("ti");

        System.out.println("\n-----------COPIA CARPETA MUSICA-------------");
        raiz.agregarComponente(carpeta1.copiar());

        System.out.println("\n-----------MUESTRA CARPETA RAIZ-------------");
        raiz.mostrarArchivos();

    }
}
