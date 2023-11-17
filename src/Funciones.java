import java.util.Scanner;

/**
 * Funciones utilizadas en la clase main
 * @author dam1
 * @version v1.0
 */
public class Funciones {
    /**
     * ccmprueba si el sueldo esta entre 1000 y 1750
     * @param sueldo del trabajador
     * @return si esta dentro del rango
     */
    public static Boolean obtenerSueldo1750(Double sueldo){
        if(sueldo>=1000 && sueldo<=1750){
           return true;
        }
        return false;
    }
    public static Boolean obtenerSueldo1000(Double sueldo) {
        if (sueldo < 1000) {
            return true;
        }
        return false;
    }

    public static boolean obtenerSueldoMas1750(Double sueldo){
        if (sueldo>1750){
            return true;
        }
        return false;
    }
    public static Trabajador darAltaTrabajador() {
        Trabajador obxTrabajador = new Trabajador();
        //obxTrabajador.setNombre("Pepe");
        //obxTrabajador.setSueldo(1200d);

    }
    Scanner sc =new Scanner(System.in);
    System.out.println("Nombre?");
    obxTrabajador.setNombre(sc.nextLine());
    System.out.println("Sueldo?");
    obxTrabajador.setSueldo(sc.nextDouble());
}
