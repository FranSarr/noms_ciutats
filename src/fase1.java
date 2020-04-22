import java.util.Scanner;

public class fase1 {
    public String city1;
    public String city2;
    public String city3;
    public String city4;
    public String city5;
    public String city6;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System. in);

        System.out.print("Enter the name of a city : ");
        String city1 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        String city2 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        String city3 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        String city4 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        String city5 = entrada. nextLine();

        System.out.print("Enter the name of a city : ");
        String city6 = entrada. nextLine();

        System.out.println("The name of the cities are : \n"+city1+", "+city2+", "+city3+", "+city4+", "+city5+", "+city6);
    }
}
