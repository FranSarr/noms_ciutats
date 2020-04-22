import java.util.Scanner;

public class fase1 {
    public static void main(String[] args) {
        String city1;
        String city2;
        String city3;
        String city4;
        String city5;
        String city6;

        Scanner entrada = new Scanner(System. in);

        System.out.print("Enter the name of a city : ");
        city1 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        city2 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        city3 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        city4 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        city5 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        city6 = entrada. nextLine();

        System.out.println("The name of the cities are : \n"+city1+", "+city2+", "+city3+", "+city4+", "+city5+", "+city6);
    }
}
