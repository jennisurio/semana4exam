
package ejercicios;

public class edificio {
    
    String ubicacion,nombreE,cantidadDep,cantidadpisos;

    public edificio(String ubicacion, String nombreE,String cantidadDep, String cantidadpisos) {
        this.ubicacion = ubicacion;
        this.nombreE = nombreE;
          this.cantidadDep = cantidadDep;
        this.cantidadpisos = cantidadpisos;
    }

    

    edificio() {
      
    }

    public String getUbicacion() {
        System.out.println("Km 64 1/2 , desvio Hacienda el Nilo sobre autopista a Zacatecoluca y Usulutan El Salvador ");        
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        
        this.ubicacion = ubicacion;
    }

    public String getNombreE(){ 
        System.out.println("ITCA FEPADE Edificio C");
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

     
    public String getCantidadDep() {
        System.out.println("cuatro departamentos ");
        return cantidadDep;
    }

    public void setCantidadDep(String cantidadDep) {
        this.cantidadDep = cantidadDep;
    }

    public String getCantidadpisos() {
        System.out.println("tres pisos en el edificio C Y dos pisos en el edificio B");
        return cantidadpisos;
    }

    public void setCantidadpisos(String cantidadpisos) {
        this.cantidadpisos = cantidadpisos;
    }

   
    }

   
    
