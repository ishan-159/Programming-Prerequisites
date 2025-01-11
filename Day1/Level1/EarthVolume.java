
public class EarthVolume {
    public static void main(String[] args) {

        //Creating a variable radius
        double radius = 6378;

        //Convert km to miles
        double kmToMiles = 0.621371;

        //volume of  sphere = (4/3)*pi*r^3
        double volumeKm = (4 / 3) * Math.PI * Math.pow(radius, 3);

        //Convert radius into miles
        double radiusMiles = radius * kmToMiles;

        //Calculate the volume in cubic miles
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        //Printing the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm +
                " and in cubic miles is " + volumeMiles);
    }
}