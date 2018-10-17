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
public class Cubo extends Cuadrado
{

    public double x;

    public Cubo(double lado) {
        super(lado);

        this.x = lado;
    }

//utilizo el metodo calcular Volumen del cubo
    public  double calcularVolumen(){
        return Math.pow(this.x,3);
    }

//utilizo el metodo calcular Perimetro del cubo
    public   double calcularPerimetro(boolean is_super)
    {

        if (is_super){
           return super.calcularPerimetro ();
        }
        else{
            return this.x*12;
        }


    }
}

