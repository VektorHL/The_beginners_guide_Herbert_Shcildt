public class Example2 {
    public static void main(String[] args) {
        int var1;
        int var2;

        kakaha();

        var1 = 1024;

        System.out.println("Переменная var1 содержит " + var1);

        var2 = var1 / 2;

        System.out.print("Переменная var2 содержит var1 / 2: ");
        System.out.println(var2);
        kakaha();
        System.out.println("Вы все - говно!!!");
    }

    public static void kakaha() {
        System.out.println("kakaha!!!");
    }
}
