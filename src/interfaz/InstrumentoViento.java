package interfaz;
/**
 * Esta es la clase InstrumentoViento que hereda Object e implementa a la interfaz InstrumentoMusical
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{
    /**
     * COnstructor vacio
     */
    public InstrumentoViento() {
    }
    /**
     * Metodo tocar de tipo void
     */
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    /**
     * Metodo afinar de tipo void
     */
    @Override
    public void afinar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    /**
     * Metodo tipoInstrumento de tipo String
     * @return 
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    /**
     * Metodo toString
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
