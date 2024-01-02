import java.util.Objects;

public class RequireNonNull {
    public static void main(String[] args) {
        Person person = null;
        processDetais(person);
    }

    private static void processDetais(Person person) {
        Objects.requireNonNull(person, "Person Object Cant be null");
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }

    public class Person {
        public String Name;
        public String Address;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }
    }
}

