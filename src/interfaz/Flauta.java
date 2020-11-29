package interfaz;
/**
 * Esta es la subclase Flauta que hereda de la interfaz InstrumentoViento
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Flauta extends InstrumentoViento {
    /**
     * Constructor vacio
     */
    public Flauta() {
    }
    /**
     * Metodo tipoInstrumento de tipo String
     * @return 
     */
    @Override
    public String tipoInstrumento(){
        return "flauta";
    
    }
    /**
     * Metodo toString
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
    
}
