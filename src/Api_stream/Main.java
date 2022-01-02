package Api_stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Filtrar
        // Empezamos a utilizar los métodos del "stream"


        List<User> users = new ArrayList<>();

        users.add(new User("Rafael",25));
        users.add(new User("Daniel",20));
        users.add(new User("Tania",15));
        users.add(new User("Luisa",24));
        users.add(new User("Raul",21));


        // contamos la cantidad de elementos
        // con el método count que devuelve un long
        long elementos = users.stream().
                                count();
        System.out.println("======================");
        System.out.println(" cantidad de usuarios");
        System.out.println("======================");
        System.out.println("count = " + elementos+'\n');


        // Utilizando filter para filtrar elementos
        // realizando una función lambda
        // filter devuelve un "stream"
        // obtener cantidad de usuarios mayores a 18 y cuyo nombre empiece con R
        long elementos1 = users.stream().//1
                                filter(user -> user.getEdad() > 18).//2
                                filter(user -> user.getName().startsWith("R"))//3
                                .count();//4

        System.out.println("==========================================");
        System.out.println(" mayores a 18 y cuyo nombre empiece con R");
        System.out.println("===========================================");
        System.out.println("filter = " + elementos1);



    }
}
