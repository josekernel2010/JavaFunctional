package Api_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Formas {
    public static void main(String[] args) {

        /*
        ================================================
        Existen distintas formas de generar un "stream()"
        ================================================
         */

        // Colección

        List<User> users = new ArrayList<>();
        users.stream(); //Abstracción

        //Se puede almacenar en una variable Stream de tipo User
        Stream<User> stream = users.stream();

        users.add(new User("Rafael",25));
        users.add(new User("Daniel",20));
        users.add(new User("Tania",15));
        users.add(new User("Luisa",24));
        users.add(new User("Raul",21));



        //Stream
        // almacenar una función de tipo stream que devuelve un stream
        Stream<User> Filter = stream.filter(user -> user.getEdad() > 18);

        System.out.println("Filter = " + Filter);

        // Arreglos
        int[] numbers = {1,4,5,8,3};

        //haciendo uso de la clase stream y del método "of"

        Stream nuevoStream = Stream.of(numbers);
        
        long cantidad = nuevoStream.count();
        System.out.println("cantidad = " + cantidad);


        //Secuencia
        Stream names = Stream.of("icaro","venus","afrodita","eolo");
        long d = names.count();
        System.out.println("d = " + d);
    }
}
