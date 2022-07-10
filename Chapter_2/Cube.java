import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cube {
    public static void main(String[] args) {
        System.out.println("hello");


        //кусок кода с JavaRush с потоками, принимает массив интов, возвращает Лист четных чисел;
        int[] array = {1, 2, 3};
        System.out.println(asd(array));
        System.out.println("здрасьте");
    }

    public static List<Integer> asd(int[] array) {
        return Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
