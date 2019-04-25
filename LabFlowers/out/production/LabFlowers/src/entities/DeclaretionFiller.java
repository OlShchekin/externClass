package entities;

        import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Random;

public class DeclaretionFiller {

    private static Map<String, Integer> incomeDeclaration = fillDeclaration();

    private static Map <String, Integer> fillDeclaration() {
        Random rand = new Random();
        incomeDeclaration = new LinkedHashMap<>();
        for (String incomePoint: IncomePoints.incomePoints) {
            incomeDeclaration.put(incomePoint, rand.nextInt(1_000_000));
        }
        return incomeDeclaration;
    }


    public static Map <String, Integer> getDeclaration() {
        return incomeDeclaration;
    }
}