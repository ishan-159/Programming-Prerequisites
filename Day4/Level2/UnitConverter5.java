public class UnitConverter5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    public static void main(String[] args) {
        double yards = 3, feet = 9, meters = 5, inches = 10;
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
