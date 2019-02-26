package javatips.test;

import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) {
        Stream.iterate(0,n -> n+n+1).limit(10).forEach(System.out::println);
    }
}
