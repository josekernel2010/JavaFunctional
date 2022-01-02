package Lambda;

public class Lambda {

    public static void main(String[] args) {

        /*
        ================================
        ::: PROGRAMACIÓN DECLARATIVA :::
        ================================
         */


        /*
          instancia la variable de interfaz ISaludo e ISaludo2
          luego creo la función lambda o anónima
        */

        // sin parámetros
        ISaludo saludo = () -> System.out.println("Saludos desde ISaludo :v ");
        System.out.println("\n===============================");
        System.out.println("Funciones Lambda sin parámetros");
        System.out.println("===============================");

        saludo.saludar();
        saludo.saludar();
        saludo.saludar();
        saludo.saludar();



        //con parámetros
        ISaludo2 saludo1 = (name) -> {
            System.out.println("Esta función devuelve el nombre = " + name);
        };


        System.out.println("\n===============================");
        System.out.println("Funciones Lambda con parámetros");
        System.out.println("===============================\n");

        String nombre = "icaro de creta";
        saludo1.saludoName(nombre);









    }
}
