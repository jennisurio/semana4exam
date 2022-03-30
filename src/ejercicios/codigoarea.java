
package ejercicios;


public class codigoarea {
    
    String Ccomputos,Biblioteca,zonaVerde,laboratorios,cancha;
        public codigoarea(String Ccomputos, String Biblioteca, String zonaVerd, String lab, String cancha) {
        this.Ccomputos = Ccomputos;
        this.Biblioteca = Biblioteca;
        this.zonaVerde = zonaVerde;
        this.laboratorios = lab;
        this.cancha = cancha;
    }

    public codigoarea() {
    }

    public String getCcomputos() {
        System.out.println("el codigo de las aulas informaticas son r002 ");
        return Ccomputos;
    }

    public void setCcomputos(String Ccomputos) {
        this.Ccomputos = Ccomputos;
    }

    public String getBiblioteca() {
        System.out.println("la area de biblioteca tiene un codigo de 45g3");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZonaVerd() {
        System.out.println("el codigo de la zona verde es x524");
        return zonaVerde;
    }

    public void setZonaVerd(String zonaVerd) {
        this.zonaVerde = zonaVerde;
    }

    public String getLab(){
        System.out.println("el codigo de los laboratorio es h500");
        return laboratorios;
    }

    public void setLab(String laboratorios) {
        this.laboratorios = laboratorios;
    }

    public String getCancha() {
        System.out.println("el codigo de la cancha es t102");
        return cancha;
    }

    
}
