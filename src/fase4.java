import java.util.Scanner;

public class fase4 {
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

        char[] city1_array = city1.toCharArray();
        char[] city2_array = city2.toCharArray();
        char[] city3_array = city3.toCharArray();
        char[] city4_array = city4.toCharArray();
        char[] city5_array = city5.toCharArray();
        char[] city6_array = city6.toCharArray();

        System.out.print("Reverse names of the cities: \n");
        for(int i = city1_array.length - 1; i >= 0 ; i--){
            System.out.print(city1_array[i]);
        }
        System.out.print("\n");
        for(int i = city2_array.length - 1; i >= 0 ; i--){
            System.out.print(city2_array[i]);
        }
        System.out.print("\n");
        for(int i = city3_array.length - 1; i >= 0 ; i--){
            System.out.print(city3_array[i]);
        }
        System.out.print("\n");
        for(int i = city4_array.length - 1; i >= 0 ; i--){
            System.out.print(city4_array[i]);
        }
        System.out.print("\n");
        for(int i = city5_array.length - 1; i >= 0 ; i--){
            System.out.print(city5_array[i]);
        }
        System.out.print("\n");
        for(int i = city6_array.length - 1; i >= 0 ; i--){
            System.out.print(city6_array[i]);
        }

    }
}
