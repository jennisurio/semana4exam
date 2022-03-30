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
