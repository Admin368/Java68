import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args) {
Scanner key_board = new Scanner (System.in);
        int[] LotteryNumbers = new int[6];
        int input; int count = 0;
        System.out.println("Welcome to  lottery program ");
        for (int i = 0; i < LotteryNumbers.length; i++) {
            count ++;
            System.out.println("Enter your Lottery Number  " + count + " (must be between 1 and 49): ");
            input =  key_board.nextInt();
            for(int a=0;a<i;a++){
                if(LotteryNumbers[a]==input||(input<1||input>49)){
                    System.out.println("invalid number,enter another");
                    input= key_board.nextInt();
                    a=-1;
                }
            }

            LotteryNumbers[i] = input;

        }
        int[] Random_lottery_number = new int[6];
        int random;
        for (int j = 0; j < Random_lottery_number.length; j++) {
            random =(int)(Math.random()*49+1);
            for(int x=0;x<j;x++){
                if(Random_lottery_number[j]==random){
                    random=(int)(Math.random()*49+1);
                    x=-1;
                }
            }

            Random_lottery_number[j] = random;

        }
        int counter = 0;
        for (int i = 0; i < LotteryNumbers.length; i++)
        { for (int j = 0; j < Random_lottery_number.length; j++)
        { if (LotteryNumbers[i] == Random_lottery_number [j]) {
            counter ++;
            System.out.println( "YOU WIN!\n"+"The numbers that match up are: " + LotteryNumbers[i]+" ");

        } } } if (counter == 0)
        { System.out.println("No matching numbers  ... Try Again!"); }
        System.out.print("Numbers you entered : ");
        for (int i=0;i<LotteryNumbers.length;i++){
            System.out.print(LotteryNumbers[i] + " ");
        }
        System.out.println();
        System.out.print("Selected numbers are : ");
        for (int j=0;j<Random_lottery_number.length;j++){
            System.out.print(Random_lottery_number[j] + " ");
        }
    } }