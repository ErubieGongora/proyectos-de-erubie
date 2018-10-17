/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboobjetos;

/**
 *
 * @author erubie
 */
public class Cuadrado {

    public double x;

    public  Cuadrado(double lado) {
        this.x =  lado;
    }
//utilixo el metodo para calcular el area del cuadrado
    public  double calcularArea(){
        return this.x * this.x;
    }
//utilixo el metodo para calcular el perimetro del cuadrado
    public  double calcularPerimetro()
    {
        return this.x *4;
    }
}
