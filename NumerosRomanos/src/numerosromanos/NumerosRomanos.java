/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author erubie
 */
public class NumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String respuesta;
        do{
        //Decalramos variable y pedimos un valor
       Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa numero: ");
        String numeros2;
        numeros2= sc.nextLine();
        int numeros;
        numeros = Integer.parseInt(numeros2);
            //numeros= Integer.parseInt(JOptionPane.showInputDialog("Ingreso Numero  : " ));
        
        //mostramos y convertirmos el numero entero
        String Str ="";
       
            Str = Str + "Numero " + numeros + " = " + Romanos(numeros)+"\n";
        
        System.out.println(Str);

        System.out.println("Desea ingresar otro numero?S/N:");
        respuesta= sc.next();
       }while("S".equals(respuesta)|"s".equals(respuesta));
    }
    
    //Metodo Para Convertir Numeros Enteros A romanos. Devuelve Una Cadena.
    public static String Romanos(int num){
         int x;
         int mil,cent,dece,unid;
        mil=(num/1000);
        x=num%1000;
        cent=x/100;
        x=num%100;
        dece=x/10;
        unid=num%10;
        String Sim="";
        switch(mil){
            case 1:
                Sim = Sim +"M";
                break;
                 }
        switch(cent){
            case 1:
                Sim = Sim +"C";
                break;
            case 2:
                Sim = Sim +"CC";
                break;
            case 3:
                Sim = Sim +"CCC";
                break;
            case 4:
                Sim = Sim +"CD";
                break;
            case 5:
                Sim = Sim +"D";
                break;
            case 6:
                Sim = Sim +"DC";
                break;
            case 7:
                Sim = Sim +"DCC";
                break;
            case 8:
                Sim = Sim +"DCCC";
                break;
            case 9:
                Sim = Sim +"CM";
                break;
        }
        switch(dece){
            case 1:
                Sim = Sim +"X";
                break;
            case 2:
                Sim = Sim +"XX";
                break;
            case 3:
                Sim = Sim +"XXX";
                break;
            case 4:
                Sim = Sim +"XL";
                break;
            case 5:
                Sim = Sim +"L";
                break;
            case 6:
                Sim = Sim +"LX";
                break;
            case 7:
                Sim = Sim +"LXX";
                break;
            case 8:
                Sim = Sim +"LXXX";
            case 9:
                Sim = Sim +"XC";
                break;
                }
        switch(unid){
            case 1:
                Sim = Sim +"I";
                break;
            case 2:
                Sim = Sim +"II";
                break;
            case 3:
                Sim = Sim +"III";
                break;
            case 4:
                Sim = Sim +"IV";
                break;
            case 5:
                Sim = Sim +"V";
                break;
            case 6:
                Sim = Sim +"VI";
                break;
            case 7:
                Sim = Sim +"VII";
                break;
            case 8:
                Sim = Sim +"VIII";
                break;
            case 9:
                Sim = Sim +"IX";
                break;

        }
        return Sim;
    }

}
