import java.lang.Math.*;
class EarthVolumeCalculator{
    public static void main(String[] args) {         
        double radius = 6378;  
        double volumeKm3 = (4 / 3) * Math.PI * Math.pow(radius, 3);  
        double volumeMiles3 = volumeKm3 * 0.239913;  
        System.out.printf("The volume of Earth in cubic kilometers is %f and in cubic miles is %f%n", 
                           volumeKm3, volumeMiles3);
    }
}
