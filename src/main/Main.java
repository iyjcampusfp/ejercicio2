package main;

import java.util.Scanner;

import metodos.Persona;

public class Main {

    public static void main(String[] args) {
               
        /*                      Creamos los objetos                                */
        //Creamos un objeto de tipo Scanner (sirve para introducir datos por teclado)
        //Descripción :Hemos creado tres variables , una para cada objeto
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        //=================================================================================//

        /*                      Intoduce los datos de los Objetos                   */
        //1º OBJETO
        System.out.println("Introduce los datos del primer Objeto : ");
        Persona person = new Persona(sc1.nextLine(),sc1.nextInt(),
                                     sc1.next().charAt(0),sc1.nextInt(),sc1.nextDouble());
        
        //2º OBJETO
        System.out.println("Introduce los datos del segundo Objeto : ");        
        Persona personV2  = new Persona(sc2.nextLine(),sc2.nextInt(),sc2.next().charAt(0));
        
        //3º OBJETO
        System.out.println("Introduce los datos del tercer Objeto : ");
        Persona personV3 = new Persona();
        
        //Ahora le daremos valores a (personV3) con Setters
        personV3.setNombre(sc3.nextLine());
        personV3.setEdad(sc3.nextInt());
        personV3.setSexo(sc3.next().charAt(0));
        personV3.setPeso(sc3.nextDouble());
        personV3.setAltura(sc3.nextDouble());
    //=================================================================================//
    
        /*              Aqui comprobaremos el peso ideal de los 3 objetos            */
        //1º Objeto
        System.out.println("Primer Objeto : ");
        person.indicarFormaFisica();
        person.imprimirMayoriaEdad();        //Comrpuebo si es mayor de edad
        System.out.println(person.toString());//Imprimo toda la información
        System.out.println("---------------------------------------------------");
       
        //2º Objeto
        System.out.println("Segundo Objeto : ");
        personV2.indicarFormaFisica();
        personV2.imprimirMayoriaEdad();     //Comrpuebo si es mayor de edad
        System.out.println(personV2.toString());//Imprimo toda la información
        System.out.println("---------------------------------------------------");
        //3º Objeto
        System.out.println("Tercer Objeto : ");
        personV3.indicarFormaFisica();
        personV3.calcularIMC();
        personV3.imprimirMayoriaEdad();     //Comrpuebo si es mayor de edad
        System.out.println(personV3.toString()); //Imprimo toda la información
        System.out.println("---------------------------------------------------");
        
     
    }
    
}
