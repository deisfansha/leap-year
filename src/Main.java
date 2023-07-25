import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        int year = input.nextInt();
        isLeapYear(year);
    }

    public static void isLeapYear(int year) {

        if(year % 4 == 0 && year %100 != 0 || year %400 == 0){
            System.out.println("Tahun "+year+" adalah tahun kabisat.");
        }else {
            System.out.println("Tahun " +year+" bukan tahun kabisat.");
        }
    }
}