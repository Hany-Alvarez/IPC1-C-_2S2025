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
         
 public static void main (String[] arge) throws IOException{   
    
String[] NombredePersonajes = new String[101];
Integer[] ID = new Integer[100];
String[] ArmadePersonajes = new String[101];
String[] Habilidades = new String[502]; // Esto me da la posibilidad de solo poder agregar 100 personajes
Integer[] Fuerza = new Integer[100];
 

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

// AGREGAR PERSONAJE
if (OPCION <=9){  

    if ( OPCION==1){
        //NOMBRE DE PERSONAJES
        Boolean repetido =true;
        while (repetido==true) {  
        System.out.println("Agregar nombre de personaje: ");
        String ingresonombre = buffer.readLine(); 
       NombredePersonajes[0]="Dato de primera comparación";
       repetido =false;
        for (int i=1;i<=101;i++){
            if (NombredePersonajes[i]==null || NombredePersonajes[i].equals ("")){
                NombredePersonajes[i]=ingresonombre;
                ID[i] = 202500+i;
                System.out.println("ID= "+ID[i]);
                
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
        
        // ARMA DE PERSONAJE
        System.out.println("Agregar arma: ");
        String ingresoarma= buffer.readLine();
        for (int i=1;i<=101;i++){
            if (ArmadePersonajes[i]==null || ArmadePersonajes[i].equals ("")){
                ArmadePersonajes[i]=ingresoarma;
        
        break;
        }
        }
        
        //HABILIDAD DEL PERSONAJE (hasta 5)
        System.out.println("Puede agregar hasta 5 habilidades ");
        System.out.println("Agregar habilidad 1 :");
        String ingresohabilidad1=buffer.readLine();
        for (int i=5;i<=506;i+=5){
            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                Habilidades[i]=ingresohabilidad1;
        
        break;
        }
        }
        
            // Sino quiere habilidad 2 y el resto
            System.out.println("Agregar habilidad 2 (sino quiere más habilidades escriba omitir):");
            String ingresohabilidad2=buffer.readLine();

            if (ingresohabilidad2.equals("omitir")){ 
                for (int i=6;i<=506;i+=5){
                    if (Habilidades[i]==null || Habilidades[i].equals ("")){
                    Habilidades[i]="No habilidad2"; 
                    break;
                    }
                }


                for (int i=7;i<506;i+=5){
                    if (Habilidades[i]==null || Habilidades[i].equals ("")){
                    Habilidades[i]="No habilidad3";
                    break;
                    }   
                }

                for (int i=8;i<506;i+=5){
                    if (Habilidades[i]==null || Habilidades[i].equals ("")){
                    Habilidades[i]="No habilidad4";
                    break;
                    }   
                }

                for (int i=9;i<506;i+=5){
                    if (Habilidades[i]==null || Habilidades[i].equals ("")){
                    Habilidades[i]="No habilidad5";
                    break;
                    }   
                }           

            }

            // else madre
            else {
            // Se guarda la habilidad 2
            for (int i=6;i<=506;i+=5){
                if (Habilidades[i]==null || Habilidades[i].equals ("")){
                    Habilidades[i]=ingresohabilidad2;
                break;
                }
            }
                // Sino se quiere la habilidad 3 y el resto
                System.out.println("Agregar habilidad 3 (sino quiere más habilidades escriba omitir):");
                String ingresohabilidad3=buffer.readLine();

                if (ingresohabilidad3.equals("omitir")){ 
                    for (int i=7;i<506;i+=5){
                        if (Habilidades[i]==null || Habilidades[i].equals ("")){
                        Habilidades[i]="No habilidad3";
                        break;
                        }   
                    }

                    for (int i=8;i<506;i+=5){
                        if (Habilidades[i]==null || Habilidades[i].equals ("")){
                        Habilidades[i]="No habilidad4";
                        break;
                        }   
                    }

                    for (int i=9;i<506;i+=5){
                        if (Habilidades[i]==null || Habilidades[i].equals ("")){
                        Habilidades[i]="No habilidad5";
                        break;
                        }   
                    }           

                }
                // else hijo mayor
                else{
                // Se guarda la habilidad 3
                    for (int i=7;i<=506;i+=5){
                        if (Habilidades[i]==null || Habilidades[i].equals ("")){
                        Habilidades[i]=ingresohabilidad3;
                        break;
                        }
                    }   
                    // Sino se quiere la habilidad 4 y el resto
                    System.out.println("Agregar habilidad 4 (sino quiere más habilidades escriba omitir):");
                    String ingresohabilidad4=buffer.readLine();

                    if (ingresohabilidad4.equals("omitir")){ 
                    for (int i=8;i<506;i+=5){
                        if (Habilidades[i]==null || Habilidades[i].equals ("")){
                        Habilidades[i]="No habilidad4";
                        break;
                        }   
                    }

                    for (int i=9;i<506;i+=5){
                        if (Habilidades[i]==null || Habilidades[i].equals ("")){
                        Habilidades[i]="No habilidad5";
                        break;
                        }   
                    }
                    }
                    // else hijo del medio
                    else{
                        // Se guarda la habilidad 4
                        for (int i=8;i<=506;i+=5){
                            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                            Habilidades[i]=ingresohabilidad4;
                            break;
                            }
                        }

                        // Sino se quiere la habilidad 4 y el resto
                        System.out.println("Agregar habilidad 5 (sino quiere más habilidades escriba omitir):");
                        String ingresohabilidad5=buffer.readLine();

                        if (ingresohabilidad5.equals("omitir")){ 
                        for (int i=9;i<506;i+=5){
                            if (Habilidades[i]==null || Habilidades[i].equals ("")){
                            Habilidades[i]="No habilidad5";
                            break;
                            }   
                        }
                        }
                        //else hijo menor
                        else{
                            // Se guarda la habilidad 5
                            for (int i=9;i<=506;i+=5){
                                if (Habilidades[i]==null || Habilidades[i].equals ("")){
                                Habilidades[i]=ingresohabilidad5;
                                break;
                                }
                            }   
                                }
                    }   
                }
            }
        
        //NIVEL DE PODER
        Boolean repetido2 =true;
        while (repetido2==true) {  
        System.out.println("Agregar nivel de poder en un escala de 1-100");
        String stringresopoder= buffer.readLine();
        Integer PODER = Integer.parseInt(stringresopoder);
        repetido2 =false;
        
        for (int i=1;i<=101;i++){
            if (Fuerza[i]==null){
                Fuerza[i]=PODER;
                    if (Fuerza[i]>=1 && Fuerza[i]<=100){
                        System.out.println("¡Listo!");
                        break;
                    }
                    else {
                        System.out.println("Número fuera de rango, ingresa un valor válido");
                        Fuerza[i]=null;
                        repetido2 = true;
                    }
            break;       
            }
            
        }
        }
   }  
                
    
// MODIFICAR PERSONAJE
if ( OPCION==2){
    
    System.out.println("Escriba el nombre o ID del personaje que desea modificar");
    String modificacion =buffer.readLine();
    
    for (int i=1;i<=101;i++){
    // Si es nulo
    if (modificacion.equalsIgnoreCase(null)){
        System.out.println("Aun no hay personajes, agregue uno para poder modificar");
    }   
    
    //Si se ingresa Nombre      
    if (modificacion.toLowerCase().equals(NombredePersonajes[i].toLowerCase())){
        System.out.println("Estos son las datos del personaje " + NombredePersonajes[i]);
        System.out.println("1.Nombre:"+NombredePersonajes[i]);
        System.out.println("2.Arma:"+ArmadePersonajes[i]);
        System.out.println("3.Habilidades:");
            System.out.println("Habilidad 1= "+ Habilidades[i*5]); 
            System.out.println("Habilidad 2= "+ Habilidades[(i*5)+1]);
            System.out.println("Habilidad 3= "+ Habilidades[(i*5)+2]);
            System.out.println("Habilidad 4= "+ Habilidades[(i*5)+3]);
            System.out.println("Habilidad 5= "+ Habilidades[(i*5)+4]);
        System.out.println("4.Nivel de poder:"+Fuerza[i]);
        System.out.println(" ");
        System.out.println("Si desea modificar algún atributo escriba el número correspondiente");
        System.out.println("5.Sino desea modificar:");
        String modi =buffer.readLine();
        Integer MODI = Integer.parseInt(modi);
        
        // Cambio de Nombre
        if ( MODI==1){
        NombredePersonajes[i]=null;
        
        Boolean repetido =true;
        while (repetido==true) {  
        System.out.println("Cambiar nombre de personaje: ");
        String ingresonombre = buffer.readLine(); 
        NombredePersonajes[0]="Dato de primera comparación";
        repetido =false;
        
            if (NombredePersonajes[i]==null || NombredePersonajes[i].equals ("")){
                NombredePersonajes[i]=ingresonombre;
                
                for (int j=0;j<i;j++){
                    
                    if (NombredePersonajes[j].equalsIgnoreCase(NombredePersonajes[i])){
                        System.out.println("El nombre ya existe,ingresa otro nombre");
                        NombredePersonajes[i]=null;
                        repetido = true;
                        break;
                       
                        }
                    }
                
                 }
            
            }
        }
        
        //Cambiar Arma
        if (MODI==2){
            ArmadePersonajes[i]=null;
            System.out.println("Cambiar arma: ");
            String ingresoarma =buffer.readLine();
            ArmadePersonajes[i]=ingresoarma;          
        }
        
        //Cambiar Habilidades
        if (MODI==3){
            System.out.println("¿Qué habilidad deseas cambiar o agregar? (Escribe el número de 1-5) ");
            String cambiohabilidad= buffer.readLine();
            Integer CAMBIO = Integer.parseInt(cambiohabilidad);
            
            if (CAMBIO ==1){
            System.out.println("Escribe la nueva habilidad 1: ");
            String Hnueva= buffer.readLine();
            Habilidades[i*5]=Hnueva;
            
            }
            
            if (CAMBIO ==2){
            System.out.println("Escribe la nueva habilidad 2: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+1]=Hnueva;
            
            }
            
            if (CAMBIO ==3){
            System.out.println("Escribe la nueva habilidad 3: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+2]=Hnueva;
            
            }
            
            if (CAMBIO ==4){
            System.out.println("Escribe la nueva habilidad 4: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+3]=Hnueva;
            
            }
            
            if (CAMBIO ==5){
            System.out.println("Escribe la nueva habilidad 5: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+4]=Hnueva;
            
            }
        }
        
        // Cambiar nivel de poder
        if (MODI==4){
        
        Boolean repetido2 =true;
        while (repetido2==true) {  
        System.out.println("Seleccione un nuévo rango de poder (1-100)");
        String stringresopoder= buffer.readLine();
        Integer PODER = Integer.parseInt(stringresopoder);
        repetido2 =false;
        
                Fuerza[i]=PODER;
                    if (Fuerza[i]>=1 && Fuerza[i]<=100){
                        System.out.println("¡Listo!");
                        break;
                    }
                    else {
                        System.out.println("Número fuera de rango, ingresa un valor válido");
                        Fuerza[i]=null;
                        repetido2 = true;
                    }
                      
        }
        }  
        
        //Salir sino quiero modificar nada
        if (MODI==5){
            break;
        }
    }
    
    //Si se ingresa ID    
    Integer CID = Integer.parseInt(modificacion);
     if (CID.equals(ID[i])){
        System.out.println("Estos son las datos del personaje " + NombredePersonajes[i]+ " con ID "+ ID[i]);
        System.out.println("1.Nombre:"+NombredePersonajes[i]);
        System.out.println("2.Arma:"+ArmadePersonajes[i]);
        System.out.println("3.Habilidades:");
            System.out.println("Habilidad 1= "+ Habilidades[i*5]); 
            System.out.println("Habilidad 2= "+ Habilidades[(i*5)+1]);
            System.out.println("Habilidad 3= "+ Habilidades[(i*5)+2]);
            System.out.println("Habilidad 4= "+ Habilidades[(i*5)+3]);
            System.out.println("Habilidad 5= "+ Habilidades[(i*5)+4]);
        System.out.println("4.Nivel de poder:"+Fuerza[i]);
        System.out.println(" ");
        System.out.println("Si desea modificar algún atributo escriba el número correspondiente");
        System.out.println("5.Sino desea modificar:");
        String modi =buffer.readLine();
        Integer MODI = Integer.parseInt(modi);
        
        // Cambio de Nombre
        if ( MODI==1){
        NombredePersonajes[i]=null;
        
        Boolean repetido =true;
        while (repetido==true) {  
        System.out.println("Cambiar nombre de personaje: ");
        String ingresonombre = buffer.readLine(); 
        NombredePersonajes[0]="Dato de primera comparación";
        repetido =false;
        
            if (NombredePersonajes[i]==null || NombredePersonajes[i].equals ("")){
                NombredePersonajes[i]=ingresonombre;
                
                for (int j=0;j<i;j++){
                    
                    if (NombredePersonajes[j].equalsIgnoreCase(NombredePersonajes[i])){
                        System.out.println("El nombre ya existe,ingresa otro nombre");
                        NombredePersonajes[i]=null;
                        repetido = true;
                        break;
                       
                        }
                    }
                
                 }
            
            }
        }
        
        //Cambiar Arma
        if (MODI==2){
            ArmadePersonajes[i]=null;
            System.out.println("Cambiar arma: ");
            String ingresoarma =buffer.readLine();
            ArmadePersonajes[i]=ingresoarma;          
        }
        
        //Cambiar Habilidades
        if (MODI==3){
            System.out.println("¿Qué habilidad deseas cambiar o agregar? (Escribe el número de 1-5) ");
            String cambiohabilidad= buffer.readLine();
            Integer CAMBIO = Integer.parseInt(cambiohabilidad);
            
            if (CAMBIO ==1){
            System.out.println("Escribe la nueva habilidad 1: ");
            String Hnueva= buffer.readLine();
            Habilidades[i*5]=Hnueva;
            
            }
            
            if (CAMBIO ==2){
            System.out.println("Escribe la nueva habilidad 2: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+1]=Hnueva;
            
            }
            
            if (CAMBIO ==3){
            System.out.println("Escribe la nueva habilidad 3: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+2]=Hnueva;
            
            }
            
            if (CAMBIO ==4){
            System.out.println("Escribe la nueva habilidad 4: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+3]=Hnueva;
            
            }
            
            if (CAMBIO ==5){
            System.out.println("Escribe la nueva habilidad 5: ");
            String Hnueva= buffer.readLine();
            Habilidades[(i*5)+4]=Hnueva;
            
            }
        }
        
        // Cambiar nivel de poder
        if (MODI==4){
        
        Boolean repetido2 =true;
        while (repetido2==true) {  
        System.out.println("Seleccione un nuévo rango de poder (1-100)");
        String stringresopoder= buffer.readLine();
        Integer PODER = Integer.parseInt(stringresopoder);
        repetido2 =false;
        
                Fuerza[i]=PODER;
                    if (Fuerza[i]>=1 && Fuerza[i]<=100){
                        System.out.println("¡Listo!");
                        break;
                    }
                    else {
                        System.out.println("Número fuera de rango, ingresa un valor válido");
                        Fuerza[i]=null;
                        repetido2 = true;
                    }
                      
        }
        }  
        
        //Salir sino quiero modificar nada
        if (MODI==5){
            break;
        }
    break;
        }   
    } 
}//llave que cierra opcion 2
    
    
    
//ELIMINAR PERSONAJE    
if ( OPCION==3){
    System.out.println("Escriba el ID del personaje que desea eliminar:");
    String eliminar =buffer.readLine();
    
    for (int i=1;i<=101;i++){
    Integer CID = Integer.parseInt(eliminar);
         if (CID.equals(ID[i])){
             NombredePersonajes[i]=null;
             ArmadePersonajes[i]=null;
             Habilidades[i*5]=null;
             Habilidades[(i*5)+1]=null;
             Habilidades[(i*5)+2]=null;
             Habilidades[(i*5)+3]=null;
             Habilidades[(i*5)+4]=null;
             Fuerza[i]=null;
             ID[i]=null;
             System.out.println("El personaje ha sido eliminado exitosamente");
             break;
         }
        
    }
    
    
    }//llave que cierra opcion 3


//VER DATOS DE UN PERSONAJE
if ( OPCION==4){
    System.out.println("Escriba el ID del personaje :");
    String ver =buffer.readLine();
    
    for (int i=1;i<=101;i++){
    Integer CID = Integer.parseInt(ver);
         if (CID.equals(ID[i])){
        System.out.println("Estos son las datos del personaje " + NombredePersonajes[i]+ " con ID "+ ID[i]);
        System.out.println("1.Nombre:"+NombredePersonajes[i]);
        System.out.println("2.ID:"+ID[i]);
        System.out.println("2.Arma:"+ArmadePersonajes[i]);
        System.out.println("3.Habilidades:");
            System.out.println("Habilidad 1= "+ Habilidades[i*5]); 
            System.out.println("Habilidad 2= "+ Habilidades[(i*5)+1]);
            System.out.println("Habilidad 3= "+ Habilidades[(i*5)+2]);
            System.out.println("Habilidad 4= "+ Habilidades[(i*5)+3]);
            System.out.println("Habilidad 5= "+ Habilidades[(i*5)+4]);
        System.out.println("4.Nivel de poder:"+Fuerza[i]);  
         }
    }
}// llave que cierra opcion 4
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








