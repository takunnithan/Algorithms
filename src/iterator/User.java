package iterator;


/**
 * Created by takunnithan on 08-01-2017.
 */
public class User{

    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
