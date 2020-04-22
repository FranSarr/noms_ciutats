import java.util.Arrays;
import java.util.Scanner;

public class fase2 {
    public static void main(String[] args) {
        String city1;
        String city2;
        String city3;
        String city4;
        String city5;
        String city6;
        String [] cities_array = new String[6];
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

        cities_array [0] = city1;
        cities_array [1] = city2;
        cities_array [2] = city3;
        cities_array [3] = city4;
        cities_array [4] = city5;
        cities_array [5] = city6;

        Arrays.sort(cities_array);
        System.out.println("The name of the cities are : \n"+ Arrays.toString(cities_array));
    }
}
