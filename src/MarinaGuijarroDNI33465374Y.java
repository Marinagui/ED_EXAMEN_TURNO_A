import java.util.*;
/**
 * version 1.0
 * @author Marina Guijarro DNI 33465374Y email marinaguijarro.mg@gmail.com
 * Programa para calculara el salario base de un empleado y las horas extra en caso de que las realice. 
 */

public class MarinaGuijarroDNI33465374Y {
        static final double FACTOR_HORA_EXTRA = 1.2;
        private String nombreCompleto, dni;
        private double salarioBasePorHora = 10.56;
        public MarinaGuijarroDNI33465374Y(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    
        /**
         * Calcula el salario final teniendo en cuenta las horas extra
         * @param horasExtra usa el salario base y lo multiplica por el factor hora extra
         * @return  devuelve el salario total (final)
         */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora *
       FACTOR_HORA_EXTRA;
        salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        MarinaGuijarroDNI33465374Y emp = new MarinaGuijarroDNI33465374Y("MARINA GUIJARRO",
       "33465374Y");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes
       será de " + emp.getSalarioEsteMes(horasExtra)
        + " euros, al hacer " + horasExtra + " horas extra.");
 }
