public class Main {
    static Integer contador1750 = 0;
    static Integer contador1000 = 0;
    static Integer contadorMas1750 = 0;

    /**
     * Aumenta contador segun rango del sueldo del trabajador.
     *
     * @param args no recibe parámetros
     */


    public static void main(String[] args) {
        //Funciones obxF = new Funciones();
        Trabajador auxTrabajador;

        do {
            auxTrabajador = Funciones.darAltaTrabajador();
            actualizarContadores(auxTrabajador);
        } while (auxTrabajador.getSueldo() != 0);
        mostrarContadores();
    }

    /**
     * Aumenta contadores segun rango  del sueldo del trabajador.
     */
    public static void actualizarContadores(Trabajador auxTrabajador) {
        if (Funciones.obtenerSueldo1750(auxTrabajador.getSueldo())) contador1750++;
        else if (Funciones.obtenerSueldo1000(auxTrabajador.getSueldo())) contador1000++;

    }


    public static void mostrarContadores(Trabajador auxTrabajador) {


    }

}

