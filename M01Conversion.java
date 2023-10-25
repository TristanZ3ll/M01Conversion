public class M01Conversion {
    
    public static void main(String[] args) throws Exception {
        double j =20.0;
        System.out.println("Feet    Meters   |    Meters     Feet");
        for(double i=1; i < 11; i++){
            System.out.println(i +"    " + footToMeters(i) + "   |    " + j + "     " + metersToFeet(j));
            j+= 5;
        }
    }
    //changes feet to meters
    public static double footToMeters(double foot){
        double meters = 0.305 * foot;
        return meters;
    }
    //changes meters to feet
    public static double metersToFeet(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}


