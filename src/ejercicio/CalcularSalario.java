/*Calcular el salario de un trabajador en base a los siguientes criterios.
a) Se debe pedir por teclado el número de horas trabajadas en el mes (HT) y el pago por hora (PH). Trabajar con número
reales para ambos casos. 
Evaluar las horas trabajas según lo siguiente:
b) Si las horas trabajadas son menores o iguales a 40, se considera que el empleado no ha realizado horas
extras en el mes. 
c) Si las horas trabajadas son mayores a 40 y menores o iguales a 48, se considera que el empleado ha
realizado horas extras que se le pagan al doble del pago de una hora normal. Haciendo para este caso un total
de 8 horas pagadas como máximo al doble.
d) Si las horas trabajadas exceden de 48, se considera que el empleado ha realizado horas extras que se le
pagan al doble y al triple del pago de una hora normal, Haciendo un total de 8 horas extras pagadas al doble y
las que excedan de 8 se pagan al triple del pago de una hora normal
e) Se debe aplicar el descuento de la retención (RENTA) del 10% al salario bruto.
f) Se debe imprimir en pantalla el nombre del empleado, salario bruto (sin renta), salario líquido (con renta) y
finalmente el monto de la retención aplicada*/
package ejercicio;

public class CalcularSalario {

    private double horTravajadas;
    private double pagPorhora;

    public CalcularSalario() {
    }

    public CalcularSalario(double horTravajadas, double pagPorhora) {
        this.horTravajadas = horTravajadas;
        this.pagPorhora = pagPorhora;
    }

    public double getHorTravajadas() {
        return horTravajadas;
    }

    public void setHorTravajadas(double horTravajadas) {
        this.horTravajadas = horTravajadas;
    }

    public double getPagPorhora() {
        return pagPorhora;
    }

    public void setPagPorhora(double pagPorhora) {
        this.pagPorhora = pagPorhora;
    }

    double calcularSalario() {
        double salario = 0;
        double horasPordos;
        double horasPortres;
        
        if (this.horTravajadas <= 40) {
            salario = this.horTravajadas * this.pagPorhora;
            return salario;
        } else if (this.horTravajadas > 40 && this.horTravajadas < 48) {
            horasPordos = this.horTravajadas - 40;
            salario = (40 * this.pagPorhora) + (horasPordos * this.pagPorhora * 2);
            return salario; 
        } else if (this.horTravajadas > 48) {
            horasPortres = this.horTravajadas - 48;
            salario = (40 * this.pagPorhora) + (8 * this.pagPorhora * 2)+(horasPortres * this.pagPorhora * 3);
            return salario;
        }
        return salario;
    }
    
    double renta(CalcularSalario salario){
    double rent;
    salario.calcularSalario();
    rent = salario.calcularSalario() * 0.10  ;
    return rent;
    }
    
    double salarioLiquido(CalcularSalario salaLiqui){
        double salarioLiqui;
        
        salarioLiqui = salaLiqui.calcularSalario() - salaLiqui.renta(salaLiqui);
        return salarioLiqui;
    }
}
