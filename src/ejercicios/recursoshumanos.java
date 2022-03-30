package ejercicios;


import java.util.Scanner;

/**
 En la escuela especializada en ingeniería ITCA-FEPADE se manejan un número grande de empleados,
recursos humanos proporciono la siguiente información. Todo empleado tiene nombre, código de empleado,
edad, dirección, área a la que pertenece, cargo que desempeña en el área, sueldo base, fecha de ingreso. Los
empleados pueden ser docentes o administrativos. El docente puede ser permanente o por servicio. El área
cuenta con código de área, nombre, cantidad de empleados, numero de edificio.
Al final se desea capturar la información del empleado, imprimir los datos personales y el área a la que
pertenece. Del edificio se conoce la ubicación, el nombre, cantidad de departamentos que alberga,
cantidad de pisos. Además, se desea saber el salario final del empleado tomando en cuenta todos los
descuentos de ley (ISSS, AFP Y RENTA), recordar que si es empleado por servicio solo se le debe
descontar renta
 */

public class recursoshumanos{

     private Scanner teclado;
    private String nombre,direccion,Nedificio;
    private int cargoDe,codigo,edad;
    private double salario,salariofinal,renta,AFP,ISSS;
    

    
   public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
        System.out.print("Ingrese salario bruto:");
        salario=teclado.nextDouble();
        System.out.print("Ingrese 1 si su cargo es por servicio y 2 si es permanente:");
        cargoDe =teclado.nextInt();
          System.out.print("Ingrese su direccion:");
        direccion=teclado.next();
          System.out.print("Ingrese Numero de edificio ");
        Nedificio=teclado.next();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("Nombre:"+nombre+"\n");
        System.out.println("Edad:"+edad+"\n");
         System.out.println("direccion:"+direccion+"\n");
         System.out.println("numero de edificio :"+Nedificio );
         System.out.println("");
    }
    public void cargo() {
        if (cargoDe==1) {
            renta= (salario * 0.10);
             salariofinal= (salario-renta);
             System.out.println("");
            System.out.print("su cargo es por servicio y su salario final es :"+ salariofinal);
             System.out.println("");
            
        } else if(cargoDe==2){
             renta= (salario * 0.10);
             ISSS= (salario* 0.14);
             AFP= (salario * 0.10);
             salariofinal= (salario-renta-ISSS-AFP);
             System.out.println("");
            System.out.print(" su cargo es permanente y su salario final es :"+salariofinal);
                    System.out.println("");
        }
        }
    public static void main(String[] args) {
        edificio objeto= new edificio();
     recursoshumanos Dpersona1;
        Dpersona1=new recursoshumanos();
        Dpersona1.inicializar();
        Dpersona1.imprimir();
        Dpersona1.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombreE();
        objeto.getCantidadDep();
        objeto.getCantidadpisos();
        
        System.out.println("");
         
         codigoarea  codigo= new codigoarea();
         codigo.getCcomputos();
         codigo.getBiblioteca();
         codigo.getCancha();
         codigo.getLab();
         codigo.getZonaVerd();
}}