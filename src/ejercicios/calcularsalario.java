
package ejercicios;

public class calcularsalario {
    
    private double horTravajadas;
    private double pagPorhora;

    public calcularsalario() {
    }

    public calcularsalario(double horTravajadas, double pagPorhora) {
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

    double calcularsalario() {
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

    double renta(calcularsalario salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double salarioLiquido(calcularsalario salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
