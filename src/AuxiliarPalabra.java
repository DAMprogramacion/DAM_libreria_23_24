public class AuxiliarPalabra {
    public static int obtenerNumeroDeLetras(String cadena) {
        if (cadena == null)
            return -1;
        return cadena.length();
    }
    public static Boolean empiezaPorVocal(String cadena) {
        //cadena = cadena.toLowerCase();
        if (cadena == null)
            return null;
        return cadena.toLowerCase().startsWith("a")  ||
                cadena.toLowerCase().startsWith("e") ||
                cadena.toLowerCase().startsWith("i") ||
                cadena.toLowerCase().startsWith("o") ||
                cadena.toLowerCase().startsWith("u") ||
                cadena.toLowerCase().startsWith("á") ||
                cadena.toLowerCase().startsWith("é") ||
                cadena.toLowerCase().startsWith("í") ||
                cadena.toLowerCase().startsWith("ó") ||
                cadena.toLowerCase().startsWith("ú");
    }
}
