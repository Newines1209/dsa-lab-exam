import java.util.Scanner;

/* Write a program that allows the user to enter a sequence of numbers into an
//array. The program should then prompt the user to enter a number to be
//searched. The program should determine if the number is present in the array
//and, if so, display the number of times it appears.
 */
public class Main{
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("the number of elements in the array is: ");
        int [] numbers=new int[keyboard.nextInt()];
        System.out.println("enter the value of your array: ");
        for(int i=0; i< numbers.length; i++){
            numbers[i]= keyboard.nextInt();
        }
        System.out.println("the target you want to find");
        int value= keyboard.nextInt();
        int sum=0;
        for(int i=0;i< numbers.length; i++){
            if(numbers[i]==value){
                sum=sum+1;
            }
        }
        if(sum==0){
            System.out.println("not found");
        }
        else{
            System.out.println(value+" is found" + sum+ " time");
        }
    }
}