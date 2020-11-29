package herencia;
/**
 * Esta es la clase POOP8 que se utilizo para la creacion de nuestros objetos Poligono, Triangulo y Cuadrilatero
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class POOP8 {
    public static void main(String[] args) {
        /**
         * Las clases base pueden comportarse como subclases
         * Tenemos un poligono que se instancia de un poligono
         */
        Poligono poligono = new Poligono();
        System.out.println("Poligono "+ poligono);
        /**
         * Tenemos un objeto que se instancia de un objeto
         */
        Object objeto = new Object();
        System.out.println("Object " + objeto);
        /**
         * A la clase base objeto le actualizamos la referencia y ahora apunta a poligono
         */
        objeto = poligono;
        System.out.println("Object como Poligono "+ poligono);
        /**
         * A Object se le instancia un poligono
         */
        Object objeto2 = poligono;
        System.out.println("Object2 " + objeto2);
        /**
         * A Object se le instancia a un nuevo poligono 
         */
        Object objeto3 = new Poligono();
        System.out.println("Object3 " + objeto3);

        System.out.println("Actividad 2*****************************");
        /**
         * Tenemos un Poligono que se instancia del Triangulo
         */
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        /**
         * Tenemos un Poligono que se instancia del Cuadrilatero
         */
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        /**
         * Tenemos un poligono que se instancia de un poligono
         */
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
    }
    /**
     * Metodo selectorPoligonos de tipo estatico recibe un parametro 
     * @param poligono es la clase poligono
     */
    public static void selectorPoligonos(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");  
        }else if(poligono instanceof Poligono){
            System.out.println("El objeto es un poligono");      
    }else{
            System.out.println("El objeto es otra figura");
        }
}}
