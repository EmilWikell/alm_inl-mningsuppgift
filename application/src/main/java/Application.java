import java.util.Date;

public class Application {

    public static void main(String[] args) {

        NumberGenerator ng = new NumberGenerator();
        int floorNumber = 100;
        int generatedNumber = ng.generateRandomNumber(floorNumber);

        System.out.println(generatedNumber);
    }
}
