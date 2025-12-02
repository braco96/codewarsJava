public class DuplicateEncoder {

  // Esta es mi "parametrización" final y optimizada.
  // En lugar de un Mapa pesado, uso un array de 256 espacios (ASCII extendido).
  static int[] v = new int[256]; 

  static String encode(String word) {
    v = new int[256]; 
    return rec(word.toLowerCase(), 0);
  }

  static String rec(String w, int i) {
    if (i == w.length()) return "";

    v[w.charAt(i)]++; 

    String resto = rec(w, i + 1);

    char c = w.charAt(i);
    return (v[c] > 1 ? ")" : "(") + resto;
  }
}
