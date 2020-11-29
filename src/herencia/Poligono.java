package herencia;
/**
 * Esta es la super-clase Poligono que se utilizo en la practica 8 para heredar
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Poligono {
    /**
     * Constructor vacio
     */
    public Poligono() {
    }
    /**
     * Metodo area de tipo flotante
     * @return 0
     */
    public float area(){
       return 0; 
    }
    /**
     * Metodo perimetro de tipo flotante
     * @return 0
     */
    public float perimetro(){
        return 0;
    }
    /**
     * Metodo toString
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
