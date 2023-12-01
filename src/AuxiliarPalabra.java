/**
 * Clase para crear una librería con distintos métodos sobre cadenas
 * @author manuel
 * @version 1.0.0
 */
public class AuxiliarPalabra {
    /**
     * Método que devuelve el número de letras de una palabra</br>
     * -1 si la cadena es null
     * ejemplo hola devuelve 4
     * @param cadena a analizar
     * @return el nº de letras
     */
    public static int obtenerNumeroDeLetras(String cadena) {
        if (cadena == null)
            return -1;
        return cadena.length();
    }

    /**
     * Método que nos dice si una cadena empieza por vocal o no
     * si cadena es null, devuelve null
     * ejemplos amigo true, Amigo true, á true, perro false
     * @param cadena cadena a analizar
     * @return si empieza o no por vocal
     */
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

    /**
     * Método que nos dice si una cadena acaba en vocal o no
     * null si la cadena es null
     * Ejemplo coche true, perro true, á true, camión false
     * @param cadena a analizar
     * @return si acaba o no en vocal
     */
    public static Boolean acabaPorVocal(String cadena) {
        if (cadena == null)
            return null;
        //amig o amig .* [aeiouáéíóú]
        return cadena.toLowerCase().matches(".*[aeiouáéíóú]");
    }

    /**
     * Método que nos devuelve el nº de vocales de una cadena
     * null si la cadena es null
     * ejemplos: cigüeña 4, perro 2, 123 devuelve 0
     * @param cadena a analizar
     * @return el nº de vocales
     */
    public static Integer obtenerNumeroDeVocales(String cadena) {
        if (cadena == null)
            return null;
        int contadorVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.toLowerCase().charAt(i) + "").matches("[aeiouáéíóúü]"))
                contadorVocales++;
        }
        return contadorVocales;
    }

    /**
     * Método que nos dice si una cadena contiene o no un caracter
     * null si la cadena es null
     * ejemplo horror y h devuelve true, horror y z devuelve false
     * @param cadena a analizar
     * @param letra letra a contener
     * @return si contiene o no la letra
     */
    public static Boolean contieneLetra(String cadena, char letra){
        if (cadena == null)
            return null;
        return cadena.contains(letra + "");
    }

    /**
     * método que nos dice si una palabra es o no un palíndromo
     * ejemplo: rotor es palándrimo y casa no lo es
     * se ignoran minúsculas y mayúscula Rotor sería un palíndromo
     * @param cadena a analizar
     * @return si es o no un palíndromo
     */
    public static Boolean esUnPalindromo(String cadena) {
        if (cadena == null)
            return null;
        StringBuilder builder = new StringBuilder(cadena);
        builder.reverse();
        return cadena.equalsIgnoreCase(builder.toString());
    }

    /**
     * Método que nos dice si es o no dos palabra iguales
     * No se tienen en cuenta mayúscula o minúscula
     * Ejemplo amor y Amor son iguales, amor y temor no son iguales
     * @param cadena1 a comparar
     * @param cadena2 a comparar
     * @return nos dices si son o no iguales las cadenas.
     */
    public static Boolean sonPalabrasIguales (String cadena1, String cadena2) {
        if (cadena1 == null || cadena2 == null)
            return null;
        return cadena1.equalsIgnoreCase(cadena2);
    }
    public static Boolean chequearClaveSegura(String clave) {
        if (clave == null)
            return null;
        return tieneLongitudCorrecta(clave) && tieneMayuscula(clave);
    }

    public static boolean tieneMayuscula(String clave) {
        return clave.matches(".*[A-ZÑ].*");

    }

    static boolean tieneLongitudCorrecta(String clave) {
        return clave.length() > 4;
    }

}
