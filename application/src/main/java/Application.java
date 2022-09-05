public class Application {

    public static void main(String[] args) {

        NumberGenerator ng = new NumberGenerator();
        int floorNumber = Integer.parseInt(args[0]);
        int generatedNumber = ng.generateRandomNumber(floorNumber);

        System.out.println(generatedNumber);
    }
}
