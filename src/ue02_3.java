import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {

        double x;
        double y;
        double distance;

        Out.print("Please put in your X coordinate: ");
        x = In.readDouble();

        Out.print("Please put in your Y coordinate: ");
        y = In.readDouble();

        distance = Math.sqrt(x * x + y * y);

        if (x > 0 && y > 0) {

        if (distance > 4 && x <= 4 && y <= 4) {
        System.out.print("The point is whithin the green Zone!");
            }
        } 
        else {
        
            System.out.print("The point is outside of the green Zone!");
        }
    }
}
