package claseAbstracta;
/**
 * Esta es la subclase Cuadrilatero que hereda de la super-clase Poligono
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private int a, b, base, altura;
    /**
     * Constructor vacio
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor que recibe seis parametros
     * @param alpha de tipo entero
     * @param beta de tipo entero
     * @param a de tipo entero
     * @param b de tipo entero
     * @param base de tipo entero
     * @param altura de tipo entero
     */
    public Cuadrilatero(int alpha, int beta, int a, int b, int base, int altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Metodo toString
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    /**
     * Metodo area de tipo flotante
     * @return el area del cuadrilatero
     */
    @Override
    public float area(){
        return base * altura;
    }
    /**
     * Metodo perimetro de tipo flotante
     * @return el perimetro del cuadrilatero
     */
    @Override
    public float perimetro(){
        return 2*a + 2*b;
    }
}
