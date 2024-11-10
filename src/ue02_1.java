import libraries.In;
import libraries.Out;

public class ue02_1 {
        public static void main(String[] args) {
            Out.println("First number: ");
            int number1 = In.readInt();
    
            Out.println("Second number: ");
            int number2 = In.readInt();

            Out.println("Third number: ");
            int number3 = In.readInt();
    
            int max = number1;
    
            if (number2 > max) {
                max = number2;
            }

            if (number3 > max) {
                max = number3;
            } 
    
            Out.println("Maximum: " + max);
    }
} 
