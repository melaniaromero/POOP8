package interfaz;
/**
 * Esta es la interfaz InstrumentoMusical
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public interface InstrumentoMusical {
    //por defecto todos los metodos son public y abstract
    /**
     * Metodo tocar de tipo void
     */
    void tocar();
    /**
     * Metodo afinar de tipo void
     */
    void afinar();
    /**
     * Metodo tipoInstrumento de tipo String
     * @return 
     */
    String tipoInstrumento();
    
}
