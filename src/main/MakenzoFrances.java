package main;

import java.util.Scanner;
import java.util.Arrays;

public class MakenzoFrances {

    public static void main(String[] args) {
        // Arrays con los valores para las operaciones
        int[] sumArray = {4, 36, 4, 23, 867};
        int[] subArray = {785675, 56, 5675, 56544, 234};
        int[] prodArray = {6, 8, 20, 23, 12};
        int TotalRestaArray = subArray[0];  // Fem INT per al resultat de la resta quedi allí guardat
        Scanner s = new Scanner(System.in); // Creem Scanner per a poder fer el moment de espera/resposta del usuari per mostrar el resultat de la Resta
        
        // User 1 fer la suma dels elements de sumArray
     			
     		
        // User 2 fer la resta dels elements de subArray
        
        //Ensenyo els numeros que es restaran
        System.out.println("Tenim estos numeros, que segidament s'aniran restant en ordre"
                + "\n 1- 785675"
                + "\n 2- 56"
                + "\n 3- 5675"
                + "\n 4- 56544"
                + "\n 5- 234");
        
        // Fem que usuari toqui entrer per mostrar les restes i no sigui tot de cop.
        System.out.println("\n Presiona tecla ENTER per a començar i mostrar les restes.");
        s.nextLine();  //Fiquem el Scanner per a poder esperar que l'usuari toqui ENTER per a continuar.
        
        // Bucle per a la resta del Array
        for (int x = 1; x < subArray.length; x++) { 
            //Restem els valors
            TotalRestaArray -= subArray[x]; 
            
            // Fem que per a cada volta mostri cada operació de cada resta.
            if (x == 1) { System.out.println("\nEl resultat de la primer resta és: " + TotalRestaArray); }
            
            if (x == 2) { System.out.println("\nEl resultat de la segona resta és: " + TotalRestaArray); }
            
            if (x == 3) { System.out.println("\nEl resultat de la tercera resta és: " + TotalRestaArray); }
            
            if (x == 4) { System.out.println("\nEl resultat de la quarta resta és: " + TotalRestaArray); }
            
        }
        
        // Tanquem el scanner per finalitzar 
        s.close();
    }
}
