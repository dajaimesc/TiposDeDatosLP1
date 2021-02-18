/*
 * Lenguajes de programación I
 * Facultad de Ingeniería
 * Universidad Autónoma de Campeche
 */
package tiposdedatoslp1;

/**
 *
 * @author danieljaimes
 */
public class TiposDeDatosLP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Comentario de una sola línea
        
        /*
        Comentario de varias
        líneas
        */
        
        // El método main inicia el flujo del programa
        
        // VARIABLES
        
        // Permitido
        int primerVariable = 10;
        int _segundaVariable = 10;
        int $terceraVariable = 10;
        
        // No permitido
        // 4aVariable = 10;
        // unaLetra unEspacio = 10;
        
        // tipo entero
        int numEntero = 10;
        System.out.println(numEntero);
        
        // modificamos la variable
        numEntero = 10 + 5;
        System.out.println(numEntero);
        
        // tipo cadena, String es una clase. No es tipo primitivo
        String cadena = "Esto es una cadena";
        System.out.println(cadena);
        
        // El operador (+) concatena
        String cadena1 = "Daniel Jaimes";
        String cadena2 = "Ingeniero";
        System.out.println(cadena2 + " " +cadena1);
        
        // CARACTERES ESPECIALES
        
        // Salto de línea
        System.out.println("Salto \n de \n línea");

        // tabulador
        System.out.println("fila11\tfila12\tfila13");
        System.out.println("fila21\tfila22\tfila23");
        System.out.println("Esto es una comilla simple \'");
        System.out.println("\' Daniel \'");
        System.out.println("'Daniel'");
        System.out.println("Esto es una comilla doble \"");
        System.out.println("Esto es una diagonal invertida \\ y esta otra \\");
        
        // Boolean
        boolean tieneMagna = true;
        System.out.println("tieneMagna = " + tieneMagna);
        
        if (tieneMagna == true) {
            System.out.println("Su auto tiene gasolina magna");
        } else {
            System.out.println("Su auto tiene gasolina premium");
        }
        
        /*
        TIPOS PRIMITIVOS: 
        byte(8bits), short(16bits), int(32bits), long(64bits)
        Con minúscula (byte) es primitiva y con mayúscula es Clase (Byte)
        */
        
        // byte
        byte tipoByte = 127;
        System.out.println("\ntipoByte = " + tipoByte);
        System.out.println("Byte = De " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE );
        
        // short
        short tipoShort = 32767;
        System.out.println("\ntipoShort = " + tipoShort);
        System.out.println("Short = De " + Short.MIN_VALUE + " a " + Short.MAX_VALUE );
        
        // int
        int tipoInt = 2147483647;
        System.out.println("\ntipoInt = " + tipoInt);
        System.out.println("Int = De " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE );
        
        // long 
        // La literal debe llevar el posfijo L, para que no lo interprete como int
        long tipoLong = 9223372036854775807L;
        System.out.println("\ntipoLong = " + tipoLong);
        System.out.println("Long = De " + Long.MIN_VALUE + " a " + Long.MAX_VALUE );
        
        // float 
        // Todas las literales con punto decimal son double 
        float tipoFloat = 3.4028235E38F;
        System.out.println("\ntipoFloat = " + tipoFloat);
        System.out.println("Float = De " + Float.MIN_VALUE + " a " + Float.MAX_VALUE );
        
        // double 
        // Todas las literales con punto decimal son double 
        double tipoDouble = 1.7976931348623157E30D;
        System.out.println("\ntipoDouble = " + tipoDouble);
        System.out.println("Double = De " + Double.MIN_VALUE + " a " + Double.MAX_VALUE );
        
        // char
        char caracter = '!';
        System.out.println("caracter = " + caracter);
        
        // unicode
        char caracterUnicode = '\u0021';
        System.out.println("caracterUnicode = " + caracterUnicode);
        
        // decimal
        char caracterDecimal = 33;
        System.out.println("caracterDecimal = " + caracterDecimal);
        
        
    }
    
}