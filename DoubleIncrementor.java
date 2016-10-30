/**
 * Implementa il metodo definito dalla classe di base
 * AbstractClass
 */
public class DoubleIncrementor extends AbstractClass {

   /**
    * Incrementa di 2 il valore fornito
    * @param value Intero da incrementare
    * @return result Valore incrementato, come Intero
    */
   public int increment(int value) {
      int result =super.increment(value);
      return ++result;
   }

   /**
    * Metodo utilizzato per l'invocazione dalla riga di comando
    * @param args Argomenti dell'applicazione
    */
   public static void main(String args[]) {
      AbstractClass impl = new DoubleIncrementor();
      int value = (int)(Math.random() * 1000);

      System.out.println("Incremento valore di: " + value);
      System.out.println("Il risultato e': " + impl.increment(value));
   }
}
