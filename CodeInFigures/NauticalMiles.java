public class NauticalMiles {
    public static void main(String[] args) {
        double KILOMETER = 1.852, MILES = 1.150779, NAUTICALMILESTOCALCULATE = 12, CalculationOfKm, CalculationOfMiles;
        CalculationOfKm = KILOMETER * NAUTICALMILESTOCALCULATE;
        CalculationOfMiles = MILES * NAUTICALMILESTOCALCULATE;
        System.out.println(NAUTICALMILESTOCALCULATE + " Nautical miles is equal to " + CalculationOfKm + " Kilometers and " + CalculationOfMiles + " Miles");
    }
}
