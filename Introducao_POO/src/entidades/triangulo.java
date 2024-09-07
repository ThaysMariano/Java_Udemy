package entidades;
//Problema com a Orientação a Objetos
public class triangulo {

    public double x;
    public double y;
    public double z;

    //metodo calcular area do triangulo
    public double calcularArea(){
        double p =(x+y+z)/2;
        return  Math.sqrt((p*(p-x)*(p-y)*(p-z)));
    }

}

