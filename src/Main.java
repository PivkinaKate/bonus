public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();

        System.out.println("10_000 / 20");
        System.out.println(service.miles(10_000, 20));

        System.out.println("582 / 20");
        System.out.println(service.miles(582, 20));

        System.out.println("25_865 / 20");
        System.out.println(service.miles(25_865, 20));

    }
}