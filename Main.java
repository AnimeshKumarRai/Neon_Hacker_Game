
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Game");
        System.out.println("In this game you have to guess a number form 1-100  *enter -1 for exit*");

        int number=0;
        Scanner sc=new Scanner(System.in);
        int num=(int)(Math.random()*100);
        do{
            System.out.println("Enter Number :");
            number=sc.nextInt();
            if(num==number){
                System.out.println("Right Number...You Win");
                break;
            } else if (num < number) {
                System.out.println("Entered number is large");
            }
            else{
                System.out.println("Entered number is Small");
            }
        }while(number>=0);
    }
}