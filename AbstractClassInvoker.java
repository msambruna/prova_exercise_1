/**
 * Invoca l'implementazione della classe AbstractClass dalla riga di comando
 */
public class AbstractClassInvoker {

   /**
    * Metodo utilizzato per l'invocazione dalla riga di comando
    * @param args Argomenti dell'applicazione
    */
   public static void main(String args[]) {
      AbstractClass impl = new AbstractClassImpl();
      int value = (int)(Math.random() * 1000);

      System.out.println("Incremento valore di: " + value);
      System.out.println("Il risultato e': " + impl.increment(value));
   }
}
