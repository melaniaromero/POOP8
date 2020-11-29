package claseAbstracta;
/**
 * Esta es una clase abstracta Poligono que se utilizo en la practica 8 para heredar
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public abstract class Poligono {
    /**
     * Metodo area de tipo flotante abstracto
     * @return 
     */
    public abstract float area();
    /**
     * Metodo perimetro de tipo flotante abstracto
     * @return 
     */
    public abstract float perimetro();
    /**
     * Metodo toString
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
}
