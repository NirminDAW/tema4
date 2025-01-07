import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que representa una caja tridimensional con dimensiones especificadas.
 * Proporciona métodos para calcular el área de la base, el volumen y ordenar
 * instancias de cajas por volumen de mayor a menor.
 * Además, incluye un método estático para solicitar valores al usuario y crear
 * instancias de caja.
 *
 * @author Nirmin
 */
public class Caja {

    private double ladoBase;
    private double alturaBase;
    private double altura;

    /**
     * Constructor para inicializar una instancia de la clase Caja con las
     * dimensiones especificadas.
     *
     * @param ladoBase   Longitud del lado de la base de la caja.
     * @param alturaBase Altura de la base de la caja.
     * @param altura     Altura total de la caja.
     */
    public Caja(double ladoBase, double alturaBase, double altura) {
        this.ladoBase = ladoBase;
        this.alturaBase = alturaBase;
        this.altura = altura;
    }

    /**
     * Obtiene la longitud del lado de la base de la caja.
     *
     * @return La longitud del lado de la base.
     */
    public double getLadoBase() {
        return ladoBase;
    }

    /**
     * Obtiene la altura de la base de la caja.
     *
     * @return La altura de la base.
     */
    public double getAlturaBase() {
        return alturaBase;
    }

    /**
     * Obtiene la altura total de la caja.
     *
     * @return La altura total de la caja.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la longitud del lado de la base de la caja.
     *
     * @param ladoBase Nueva longitud del lado de la base.
     */
    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    /**
     * Establece la altura de la base de la caja.
     *
     * @param alturaBase Nueva altura de la base.
     */
    public void setAlturaBase(double alturaBase) {
        this.alturaBase = alturaBase;
    }

    /**
     * Establece la altura total de la caja.
     *
     * @param altura Nueva altura total de la caja.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula y devuelve el área de la base de la caja.
     *
     * @return El área de la base de la caja.
     */
    public double areaBase() {
        return (ladoBase * alturaBase);
    }

    /**
     * Calcula y devuelve el volumen de la caja.
     *
     * @return El volumen de la caja.
     */
    public float calcularVolumen() {
        return (float) (ladoBase * alturaBase * altura);
    }

    /**
     * Método estático que solicita al usuario las dimensiones de una caja y
     * crea una instancia de la clase Caja con esos valores.
     *
     * @return Una nueva instancia de la clase Caja con dimensiones proporcionadas por el usuario.
     */
    public static Caja SolicitarValores() {
        double ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado de la base"));
        double alturaBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura de la base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
        return new Caja(ladoBase, alturaBase, altura);
    }

    /**
     * Método principal que crea varias instancias de la clase Caja, realiza cálculos
     * sobre ellas y las ordena por volumen de mayor a menor, mostrando los resultados.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Caja caja1 = SolicitarValores();
        Caja caja2 = SolicitarValores();
        Caja caja3 = SolicitarValores();
        Caja caja4 = SolicitarValores();
        Caja caja5 = SolicitarValores();

        System.out.println("El area de la base de la caja 1 es : " + caja1.areaBase());
        System.out.println("El area de la base de la caja 2 es : " + caja2.areaBase());
        System.out.println("El area de la base de la caja 3 es : " + caja3.areaBase());
        System.out.println("El area de la base de la caja 4 es : " + caja4.areaBase());
        System.out.println("El area de la base de la caja 5 es : " + caja5.areaBase());

        System.out.println("El volumen de la caja 1 es : " + caja1.calcularVolumen());
        System.out.println("El volumen de la caja 2 es : " + caja2.calcularVolumen());
        System.out.println("El volumen de la caja 3 es : " + caja3.calcularVolumen());
        System.out.println("El volumen de la caja 4 es : " + caja4.calcularVolumen());
        System.out.println("El volumen de la caja 5 es : " + caja5.calcularVolumen());

        List<Caja> cajas = new ArrayList<>();
        cajas.add(caja1);
        cajas.add(caja2);
        cajas.add(caja3);
        cajas.add(caja4);
        cajas.add(caja5);

        Collections.sort(cajas, Comparator.comparing(Caja::calcularVolumen).reversed());

        System.out.println("Cajas ordenados de mayor a menor volumen");
        for (Caja caja : cajas) {
            System.out.println("Volumen : " + caja.calcularVolumen());
        }
    }
}
