package Api_stream;

public class User {

    private String name;
    private int edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public User(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }
}
