
import java.util.Scanner;
public class GettingAndStoringUserInput {

    public static void main(String args[]){

        //Instanstiating an object for scanner class
       Scanner keyboard = new Scanner(System.in);

       //Ask for data to be inserted and insert them
        System.out.println("Please type in a persons first Initial:");
        String firstInitial = keyboard.next();
        System.out.println("Please type in your Last Name:");
        String LastName = keyboard.next();
        System.out.println("Please Insert a House Number:");
        Long HouseNumber = keyboard.nextLong();
        System.out.println(" Please Insert a Street Name:");
        String StreetName = keyboard.next();
        System.out.println("Please insert street type:");
        String StreetType = keyboard.next();
        System.out.println("Please Insert your city:");
        String City = keyboard.next();
System.out.println("*******INFORMATION DISPALY****");
System.out.println(firstInitial+" "+LastName+" "+HouseNumber);
System.out.println(StreetName+" "+StreetType+"  "+City);
}
}
