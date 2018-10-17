/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigosmorse;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author erubie
 */
public class CodigosMorse {

    /**
     * @param args the command line arguments
     */
    

public static void main(String[] args) {
    String respuesta;
    do{
       Scanner scanner=new Scanner(System.in); 
        String palabra=" ";
        
         
        System.out.println("---------------Instruccion---------------");
        System.out.println("Texto) pasa texto a morse");
        System.out.println("Morse) pasa Morse a texto");
         
        System.out.println(" ");
        System.out.println("Elige el tipo de traduccion (Morse | Texto):");
        String tipo=scanner.nextLine();
     
        tipo= tipo.toLowerCase();
        
         // Traduccion de texto a morse
        if(tipo.equals("texto")|tipo.equals("Texto")|tipo.equals("TEXTO")){
            
            System.out.println("Introduce palabra"); 
            palabra=scanner.nextLine(); 
            palabra = palabra.toLowerCase();
            
        
        String morse[] = {
            /**1*/".---- ", 
            /**2*/"..--- ",
            /**3*/"... -- ", 
            /**4*/"....- ",
            /**5*/"..... ", 
            /**6*/"-.... ",
            /**7*/"--... ",
            /**8*/"---.. ",
            /**9*/"----. ",
            /**0*/"----- ",
                 /**A*/".- ",
                /**B*/"-... ", 
                /**C*/"-.-. ", 
                /**D*/"-.. ",
                /**E*/". ", 
                /**F*/"..-. ", 
                /**G*/"--. ", 
                /**H*/".... ", 
                /**I*/".. ", 
                /**J*/".--- ", 
                /**K*/"-.- ", 
                /**L*/".-.. ", 
                /**M*/"-- ",
                /**N*/"-. ",
                /**O*/"--- ", 
                /**P*/".--. ",
                /**Q*/"--.- ",
                /**R*/".-. ", 
                /**S*/"... ",
                /**T*/"- ",
                /**U*/"..- ", 
                /**V*/"...- ",
                /**W*/".-- ",
                /**X*/"-..- ",
                /**Y*/"-.-- ",
                /**Z*/"--.. "
           /*espacio*/,"  "
                }; 
 
        
         String letras = "1234567890abcdefghijklmnopqrstuvwxyz "; 
            int posicion=0; 
            String suma=" "; 
         
        for (int f = 0; f < palabra.length(); f++) { 
            posicion=letras.indexOf(palabra.charAt(f)); 
            suma+=morse[posicion];    
        } 
        System.out.println(suma);   
        }
        //traduccion de morse a texto
        if(tipo.equals("morse") | tipo.equals("Morse")|tipo.equals("MORSE")){
            System.out.println("Introduce palabra"); 
            palabra=scanner.nextLine(); 
            palabra = palabra.toLowerCase();
            
            String letras = "abcdefghijklmnopqrstuvwxyz   0123456789.,?!()[]&:;=+-_$@";
				String codigo[] = new String[60];
				String morse = " ";
		
				codigo[0] = ".-"; //a
				codigo[1] = "-...";//b
				codigo[2] = "-.-.";//c
				codigo[3] = "-..";//d
				codigo[4] = ".";//e
				codigo[5] = "..-.";//f
				codigo[6] = "--.";//g
				codigo[7] = "....";//h
				codigo[8] = "..";//i
				codigo[9] = ".---";//j
				codigo[10] = "-.-";//k
				codigo[11] = ".-..";//l
				codigo[12] = "--";//m
				codigo[13] = "-.";//n
				codigo[14] = "---";//o
				codigo[15] = ".--.";//p
				codigo[16] = "--.-";//q
				codigo[17] = ".-.";//r
				codigo[18] = "...";//s
				codigo[19] = "-";//t
				codigo[20] = "..-";//u
				codigo[21] = "...-";//v
				codigo[22] = ".--";//w
				codigo[23] = "-..-";//x
				codigo[24] = "-.--";//y
				codigo[25] = "--..";//z
				codigo[26] = "/";//espacio
				codigo[27] = "-----";//0
				codigo[28] = ".----";//1
				codigo[29] = "..---";//2
				codigo[30] = "...--";//3
				codigo[31] = "....-";//4
				codigo[32] = ".....";//5
				codigo[33] = "-....";//6
				codigo[34] = "--...";//7
				codigo[35] = "---..";//8
				codigo[36] = "----.";//9
				codigo[37] = ".-.-.-";//.
				codigo[38] = "--..--";//,
				codigo[39] = "..--..";//?
				codigo[40] = ".-.-..";//!
				codigo[41] = "-.--.";//(
				codigo[42] = "-.--.-";//)
				codigo[43] = "-.--.";//[
				codigo[44] = "-.--.-";//]
				codigo[45] = ".-...";//&
				codigo[46] = "---...";//:
				codigo[47] = "-.-.-.";//;
				codigo[48] = "-...-";//=
				codigo[49] = ".-.-.";//+
				codigo[50] = "-....-";//-
				codigo[51] = "..--.-";//_
				codigo[52] = "...-..-";//$
				codigo[53] = ".--.-.";//@
                                
				
				String oracion[] = palabra.split(" ");
				int max = oracion.length;
				
		        for  (int i = 0; i < max; i++){
		        	for (int j = 0; j < 60; j++)
		        		if (oracion[i].equals(codigo[j])) {
		        			morse = morse+letras.charAt(j);
		        			break;
		        		}
		        }
                        System.out.println(morse);
                        }
        
                System.out.println("Desea ingresar otro texto?S/N:");
                respuesta= scanner.next();
           }while("S".equals(respuesta) | "s".equals(respuesta));

        }
}