package course;

import java.util.Locale;
import java.util.Scanner;

public class Course {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        String product1 = "Computer";
        String product2 = "Office desk";
       
        
        
        String age = "";
        System.out.println("Digite um numero: " + age);
        age = sc.nextLine();
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.println("Products:");
        System.out.printf("Computer, which price is $ %.2f%n", price1);  
        System.out.printf("Office desk, whice price is $ %.2f%n", price2);
        System.out.printf("Record:" );
        System.out.printf(" %d years old, code %d and gender: ", age, code);
        System.out.printf("%s%n", gender);
        System.out.printf("Measue with eight decimal places: ");
        System.out.printf("%f%n", measure);
        System.out.printf("Rounded (three decimal places): ");
        System.out.printf("%.3f%n", measure);
        System.out.printf("US decimal point: ");
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", measure);
       
       
       
                
    }
    
}
