import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    // Esta es mi "Tabla de Variables" compartida (a(x), m(y), etc.)
    // La declaro fuera para que mi recursividad la vaya modificando.
    static Map<Character, Integer> variables; 

    static String encode(String word) {
        variables = new HashMap<>(); // Reseteo mis variables
        return procesarRecursivo(word.toLowerCase(), 0);
    }

    static String procesarRecursivo(String word, int index) {
        if (index == word.length()) return "";

        char letraActual = word.charAt(index);
        variables.put(letraActual, variables.getOrDefault(letraActual, 0) + 1);

        String restoDelResultado = procesarRecursivo(word, index + 1);

        String miSimbolo;
        if (variables.get(letraActual) > 1) {
            miSimbolo = ")";
        } else {
            miSimbolo = "(";
        }
        return miSimbolo + restoDelResultado;
    }
}
