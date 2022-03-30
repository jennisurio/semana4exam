package ejercicios;

/*En la escuela especializada en ingeniería ITCA-FEPADE se manejan un número grande de empleados,
recursos humanos proporciono la siguiente información. Todo empleado tiene nombre, código de empleado,
edad, dirección, área a la que pertenece, cargo que desempeña en el área, sueldo base, fecha de ingreso. Los
empleados pueden ser docentes o administrativos. El docente puede ser permanente o por servicio. El área
cuenta con código de área, nombre, cantidad de empleados, numero de edificio.
Al final se desea capturar la información del empleado, imprimir los datos personales y el área a la que
pertenece. Del edificio se conoce la ubicación, el nombre, cantidad de departamentos que alberga,
cantidad de pisos. Además, se desea saber el salario final del empleado tomando en cuenta todos los
descuentos de ley (ISSS, AFP Y RENTA), recordar que si es empleado por servicio solo se le debe
descontar renta.*/


public class empleado {
   class Trabajador {
    int cargoDempeña,servicio,docente;
    double renta,salario,ISSS,AFP;
     public void servicio (int cargoDesempeñar){
        
        if (cargoDesempeñar ==1){
             renta= (salario * 0.10);
             salario= (salario-renta);
             System.out.println("El salario final del trabajador es  : " + salario);
        }
     }
     public void docente (int cargoDesempeñar){
        if (cargoDesempeñar ==2){
             renta= (salario * 0.10);
             ISSS= (salario* 0.14);
             AFP= (salario * 0.10);
             salario= (salario-renta-ISSS-AFP);
             System.out.println("El salario final del trabajador es  : " + salario);
     }
     
 }
 }
        
    }

