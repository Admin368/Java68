
import java.util.*;
public class GameOfCraps
{
    public static void main(String[] args)
    {
        int amount = 1000;
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int bet;
        int die1, die2, roll, point, win;
        bet = getBet(amount, input);
        while(bet>0) {
            die1 = tossdie(r);
            die2 = tossdie(r);
            roll = die1 + die2;
            output(die1, die2, roll);
            win = Win(roll, 0, 1);
            while(win!=1&&win!=-1)
            {
                point  = roll;
                die1 = tossdie(r);
                die2 = tossdie(r);
                roll = die1 + die2;
                output(die1, die2, roll);
                win = Win(roll,point, 2);
            }
            amount = updateAmount(win, bet, amount);
            if(amount>0) bet = getBet(amount, input );
            else
            {
                System.out.println("sorry, you fail!  ,  you can't play any more");
                bet = 0;
            }
        }
        outputResult(amount);
    }

    public static int Win(int roll, int mark, int turn)
    {
        if(turn==1)
            if(roll==7||roll==11)
            {
                System.out.println("First roll winner!");
                return 1;
            }
            else if(roll==2||roll==3||roll==12)
            {
                System.out.println("loose");
                return 0;
            }
            else return -1;
        else
        if(roll==mark)
        {
            System.out.println("congratulation,you got mark!");
            return 1;
        }
        else if(roll==7)
        {
            System.out.println("Bummer, a 7");
            return -1;
        }
        else return 0;
    }
       public static int getBet(int amount, Scanner in)
    {
        int bet;
        do{
            System.out.println("Enter amount between 1 and " + amount + " that you want to bet");
            System.out.print(" Enter 0 to exit : ");
            bet = in.nextInt();
        }while(bet<0||bet>amount);
        return bet;
    }

    public static void output(int r1, int r2, int roll)
    {
        System.out.println("Your roll is " + r1 + " and " + r2 +" for a total of " + roll);
    }

        public static int tossdie(Random r)
    {
        return r.nextInt(6)+1;
    }


    public static int updateAmount(int win, int bet, int amount)
    {
        if(win==1)
        {
            amount+=bet;
            System.out.println("You won $" + bet + " and now have $" + amount);
        }
        else
        {
            amount-=bet;
            System.out.println("You lost $" + bet + " and now have $" + amount);
        }
        return amount;
    }

    public static void outputResult(int amount)
    {
        if(amount>1000) System.out.println("You have $" + amount + " so you won $" + (amount - 1000));
        else if(amount==2000) System.out.println("You broken, thanks for playing");
        else if(amount>0&&amount<=2000) System.out.println("Sorry! You lost, but still you can play $" + amount);
        else System.out.println("SORRY!You lost it all, TRY ANOTHER TIME");
    }
}