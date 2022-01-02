package Lambda;

public class Operaciones {

    public static void main(String[] args) {

        // generando dos variables tipo int
        double a = 12, b= 10;

        // método que no hace falta declarar el tipo de variable
        // por la declaración en la interfaz
        IOperation sumar = ( f,  g) ->
                System.out.println("La suma es = " +(f+g));


        // alojamos el método en una variable
        System.out.println("================");
        System.out.println("función de suma");
        System.out.println("================");
        sumar.Operation(a,b);


        System.out.println("\n================");
        System.out.println("función de cubo ");
        System.out.println("================");
        IOperation cubo = (f, g) ->{
                System.out.println("Número "+f+" elevado al cubo: "+Math.pow(f,3));
                System.out.println("Número "+g+" elevado al cubo: "+Math.pow(g,3));

        };

        cubo.Operation(5,4);


    }
}
