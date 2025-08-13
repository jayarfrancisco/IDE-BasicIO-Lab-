



   
    
        
    import java.util.Scanner;
import java.time.Year;

public class BasicIO {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


System.out.print("Enter your full name: ");
String fullName = scanner.nextLine();

System.out.print("Enter your age: ");
int age = scanner.nextInt();

// Get current year
int currentYear = Year.now().getValue();

// Calculate the year when the user turns 60
int yearTurningSixty = currentYear + (60 - age);

// Output
System.out.println("Hello " + fullName + ", you are " + age + " years old!");
System.out.println("You will turn 60 years old in the year " + yearTurningSixty + ".");

scanner.close();
}
}
    

