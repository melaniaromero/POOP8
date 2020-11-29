package claseAbstracta;
/**
 * Esta es la clase POOP82 que se utilizo para la creacion de nuestros objetos Poligono, Triangulo y Cuadrilatero
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class POOP82 {
    public static void main(String[] args) {
        System.out.println("Actividad 3************");
        //Poligono poligono = new Poligono(); no se puede instanciar
        /**
         * Referencia a la clase abstracta Poligono
         */
        Poligono poligono;
        /**
         * El poligono se esta comportando como un triangulo
         */
        poligono = new Triangulo();
        System.out.println(poligono);
        /**
         * El poligono se comporta como un cuadrilatero
         */
        poligono = new Cuadrilatero();
        System.out.println(poligono);
    }
}
