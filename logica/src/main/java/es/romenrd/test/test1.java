package es.romenrd.test;

/**
 * clase test1
 *
 */
public class test1 {

    private int valor1;
    private int valor2;
    private int areaCuad;
    private double areaTriang;

    /**
     * Constructor de test1
     * @param valor1 base del area
     * @param valor2 altura del area
     */
    public test1(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    /**
     * Getter para valor1
     * @return
     */
    public int getValor1() {
        return valor1;
    }
    /**
     * Setter para valor1
     * @param valor1
     */
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
    /**
     * Getter para valor2
     * @return
     */
    public int getValor2() {
        return valor2;
    }
    /**
     * Setter para valor2
     * @param valor2
     */
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    /**
     * Setter para areaCuad 
     * @param area
     */
    public void setAreaCuad(int area) {
        this.areaCuad=area;
    }
    /**
     * Setter para areaTriang 
     * @param area
     */
    public void setAreaTriang(double area) {
        this.areaTriang=area;
    }
    /**
     * Metodo para obtener las areas cuad=b*h triang=(b*h)/2
     * @return
     */
    public void calcArea(){
        setAreaCuad(getValor1()*getValor2());
        setAreaTriang((double)(getValor1())*getValor2());    
    } 
}
