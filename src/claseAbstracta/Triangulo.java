package claseAbstracta;

import herencia.*;
/**
 * Esta es la subclase Triangulo que hereda de la super-clase Poligono
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Triangulo extends Poligono {
    private float a, b, c;
    private int alpha, beta, gama;
    private float base, altura;
    /**
     * Constructor vacio
     */
    public Triangulo() {
    }
    /**
     * Constructor que recibe ocho parametros 
     * @param a de tipo flotante
     * @param b de tipo flotante
     * @param c de tipo flotante
     * @param alpha de tipo entero
     * @param beta de tipo entero
     * @param gama de tipo entero
     * @param base de tipo flotante
     * @param altura de tipo flotante
     */
    public Triangulo(float a, float b, float c, int alpha, int beta, int gama, float base, float altura) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.alpha = alpha;
        this.beta = beta;
        this.gama = gama;
        this.base = base;
        this.altura = altura;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
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

    public int getGama() {
        return gama;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Metodo toString
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", alpha=" + alpha + ", beta=" + beta + ", gama=" + gama + ", base=" + base + ", altura=" + altura + '}';
    }
    /**
     * Metodo area de tipo flotante
     * @return el area del triangulo
     */
    @Override/*sobreescrituras de metodos*/
    public float area(){
        return base*altura/2;
    }
    /**
     * Metodo perimetro de tipo flotante
     * @return el perimetro del triangulo
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
}
