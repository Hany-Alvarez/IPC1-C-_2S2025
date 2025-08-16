/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hanya
 */
public class Main {
    
    private static void NombreVerificacion(String[] NombredePersonajes,String ingresonombre) 
    {
        
        for (int i=0;i<=100;i++){
            if (NombredePersonajes[i]!= ""){
                System.out.println("Esta vacio");
            }
            else {
                System.out.println("Esta lleno");
            }
        
        
        }
    } 
            

 public static void main (String[] arge) throws IOException{   
    
String[] NombredePersonajes = new String[101];
String[] ArmadePersonajes = new String[101];
String[] Habilidades = new String[502]; // Esto me da la posibilidad de solo poder agregar 100 personajes
Integer[] FuerzadePersonaje = new Integer[100];
 

InputStreamReader capturarTeclado = new InputStreamReader(System.in);
BufferedReader buffer = new BufferedReader(capturarTeclado);

System.out.println("Hola! Quieres jugar");
System.out.println("1.Si");
System.out.println("2.No");

String strjugar = buffer.readLine(); 
    
Integer JUGAR = Integer.parseInt(strjugar); 


while (JUGAR==1){
//Aquí esta la presentación del Menu    
System.out.println("1. Agregar Personaje ");
System.out.println("2. Modificar Personaje ");
System.out.println("3. Eliminar Personaje ");
System.out.println("4. Ver Datos de un Personaje ");
System.out.println("5. Ver listado de Personajes ");
System.out.println("6. Realizar Pelea entre Personajes ");
System.out.println("7. Ver Historial de Peleas ");
System.out.println("8. Ver Datos de Estudiante ");
System.out.println("9. Salir ");
System.out.println("");
System.out.println("Elige una opción");

String strOpcion = buffer.readLine(); 
    
Integer OPCION = Integer.parseInt(strOpcion);


if (OPCION <=9){
// AGREGAR PERSONAJE
    if ( OPCION==1){
        //Nombre del personaje
        Boolean repetido =true;
        while (repetido==true) {  
        System.out.println("Agregar nombre de personaje: ");
        String ingresonombre = buffer.readLine(); 
       NombredePersonajes[0]="Dato de primera comparación";
       repetido =false;
        for (int i=1;i<=101;i++){
            if (NombredePersonajes[i]==null || NombredePersonajes[i].equals ("")){
                NombredePersonajes[i]=ingresonombre;
                
                
                for (int j=0;j<i;j++){
                    
                    if (NombredePersonajes[j].toLowerCase().equals(NombredePersonajes[i].toLowerCase())){
                        System.out.println("El nombre ya existe,ingresa otro nombre");
                        NombredePersonajes[i]=null;
                        repetido = true;
                        break;
                       
                        }
                    }
                break;
                 }
            }
            }
        
        // Arma del Personaje
        System.out.println("Agregar arma: ");
        String ingresoarma= buffer.readLine();
        for (int i=1;i<=101;i++){
            if (ArmadePersonajes[i]==null || ArmadePersonajes[i].equals ("")){
                ArmadePersonajes[i]=ingresoarma;
        
        break;
        }
        }
        
        //Habilidades del Personaje
        System.out.println("Puede agregar hasta 5 habilidades ");
        System.out.println("Agregar habilidad 1 :");
        String ingresohabilidad1=buffer.readLine();
        for (int i=1;i<=502;i+=5){
            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]=ingresohabilidad1;
        
        break;
        }
        }
        
        System.out.println("Agregar habilidad 2 (sino quiere más habilidades escriba saltar):");
        String ingresohabilidad2=buffer.readLine();
        if (ingresohabilidad2=="saltar"){ 
            
           
            for (int i=2;i<=502;i+=5){
                if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]="No habilidad2"; 
                break;
                }
            }
            
            
            for (int i=3;i<502;i+=5){
                if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]="No habilidad3";
                break;
                }   
            }
              
       
        }
        else {
        for (int i=2;i<=502;i+=5){
            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]=ingresohabilidad2;
        
        break;
        }
        }
        }
  
    
    ///
    
        System.out.println("Agregar habilidad 3:");
        String ingresohabilidad3=buffer.readLine();
        for (int i=3;i<=502;i+=5){
            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]=ingresohabilidad3;
        
        break;
        }
        }
        System.out.println("Agregar habilidad 4:");
        String ingresohabilidad4=buffer.readLine();
        for (int i=4;i<=502;i+=5){
            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]=ingresohabilidad4;
        
        break;
        }
        }
        System.out.println("Agregar habilidad 5:");
        String ingresohabilidad5=buffer.readLine();
        for (int i=5;i<=502;i+=5){
            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]=ingresohabilidad5;
        
        break;
        }
        }
    }
       
     
    
    if ( OPCION==2){
    
    
    System.out.println(NombredePersonajes[1]);
    System.out.println(ArmadePersonajes[1]);
    
    
    for (String habilidad : Habilidades) {
    System.out.println(habilidad);
}
    
    }
    if ( OPCION==3){
    System.out.println("3");
    }
    if ( OPCION==4){
    System.out.println("4");
    }
    if ( OPCION==5){
    System.out.println("5");
    }
    if ( OPCION==6){
    System.out.println("6");
    }
    if ( OPCION==7){
    System.out.println("7");
    }
    if ( OPCION==8){
    System.out.println("8");
    }
    if ( OPCION==9){
    System.out.println("Saliendo del juego");
    break;
    }
}
else{
System.out.println("Opción invalida vuelve a elegir otra opción");
}
   
}
}
}








