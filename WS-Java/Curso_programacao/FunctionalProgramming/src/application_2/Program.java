package application_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program
{
    public static void main(String[] args)
    {
//        List<Integer> list_int = Arrays.asList(3, 4, 5, 7, 11, 4, 45, 32);
//        Stream<Integer> stream_with_int = list_int.stream().filter(x -> x > 10);
//        System.out.println(Arrays.toString(stream_with_int.toArray()));
//
//        Stream<String> stream_with_string = Stream.of("Jose", "Maria", "Maria Jose", "Jose Maria");
//        System.out.println(Arrays.toString(stream_with_string.toArray()));
//
//        Stream<Integer> stream_with_int_2 = Stream.iterate(1, x -> x * 4);
//        System.out.println(Arrays.toString(stream_with_int_2.limit(8).toArray()));

        Stream<Long> fibonacci_stream = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0] + x[1]}).map(x -> x[0]);
        System.out.println(Arrays.toString(fibonacci_stream.limit(10000000).toArray()));
    }
}
