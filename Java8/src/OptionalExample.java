import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        withJava8();
    }

    public static void withoutJava8(){
        String[] str=new String[10];
        System.out.println(str[5]);
    }

    public static void withJava8(){
        String[] str=new String[10];
        str[5]="Asif";

        Optional<String> empty=Optional.empty();
        System.out.println(empty);


        Optional<String> value = Optional.of(str[5]);
        System.out.println(value.get());

        Optional<String> nullValue = Optional.ofNullable(str[4]);
        nullValue.ifPresent(System.out::println);
        System.out.println(nullValue.orElse("No value"));

        Optional<String> nonEmptyString = Optional.of("Asif");
        Optional<String> emptyString = Optional.empty();
        System.out.println(nonEmptyString.map(String::toUpperCase));
        System.out.println(emptyString.map(String::toUpperCase));

        Optional<Optional<String>> NonEmpptyOptionalInput = Optional.of(Optional.of("Asif"));
        System.out.println("Optional value "+NonEmpptyOptionalInput);
        System.out.println("optional.map "+NonEmpptyOptionalInput.map(i->i.map(String::toUpperCase)));
        System.out.println("optional.flatmap "+NonEmpptyOptionalInput.flatMap(i->i.map(String::toUpperCase)));

        Optional<String> arshad = Optional.of("ARSHAD");
        Optional<String> empty1 = Optional.empty();
        System.out.println(arshad.filter(a->a.equals("arshad")));
        System.out.println(arshad.filter(a->a.equalsIgnoreCase("Asif")));
        System.out.println(empty1.filter(G->G.equals("Asif")));

        if(arshad.isPresent()){
            System.out.println("Value available");
        }
      arshad.ifPresent(c-> System.out.println("value available is "+c));

        System.out.println(arshad.orElse("No value available"));
        System.out.println(empty1.orElse("No value available"));
        System.out.println(empty1.orElseGet(()->"No data available"));
        System.out.println(empty1.orElseThrow(NoSuchElementException::new));

    }
}
