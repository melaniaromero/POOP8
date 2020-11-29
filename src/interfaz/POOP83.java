package interfaz;
/**
 * Esta es la clase POOP83 que se utilizo para la creacion de nuestros objetos 
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class POOP83 {
    public static void main(String[] args) {
        System.out.println("4***************");
        //no se puede instanciar
        //InstrumentoMusical instrumento= new InstrumentoMusical();
        /**
         * Referencia a la interfaz InstrumentoMusical
         */
        InstrumentoMusical instrumento;
        /**
         * Instrumento se instancia de Flauta
         */
        instrumento = new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
        
    }
}
