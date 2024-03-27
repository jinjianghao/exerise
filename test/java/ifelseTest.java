package test.java;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ifelseTest {


    @Test
    public void romeveIfElse(){
        String a = null;
        System.out.println(Optional.ofNullable(a).orElse("is null"));
        String b = "";
        System.out.println(Optional.of(b).empty().orElse("is null"));
        String c = " ";
        System.out.println(Optional.ofNullable(c).orElse("is null"));
        String d = "dddddd";
        System.out.println(Optional.ofNullable(d).orElse("is null"));
    }
}
