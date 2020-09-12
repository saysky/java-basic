package p4streamapi;

import java.util.Optional;

public class hello3orelse {

    public static void main(String[] args) {
        Optional a = Optional.of("a");
        System.out.println(a.get());

        Optional emptyOptional = Optional.empty();
        System.out.println(emptyOptional.orElse("b"));
        System.out.println(emptyOptional.orElseGet(() -> "c"));


    }

}
