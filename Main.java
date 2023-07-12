import java.util.*;
import java.lang.*;
public class GuessNum
{
    void guessnumber()
    {
        Scanner sc = new Scanner(System.in);
        int c;
        int i,guess_num;
		int num= 1+(int)(100* Math.random());
		System.out.println("Enter number of choices available:");
		c=sc.nextInt();
		System.out.println("********************");
        System.out.println("A number is selected between 1 to 100.");
		System.out.println("Guess that number within " +c+" trails.");
		int score=c*10;
		System.out.println("Total score="+score);
		System.out.println("********************");
        for (i=0;i<c;i++) 
		{
            System.out.println("Guess the number:");
            guess_num=sc.nextInt();
            if(num==guess_num) 
			{
                System.out.println("Congratulations!! You guessed the correct number.");
				System.out.println("Your score:"+((c-i)*10));
                break;
            }
            else if(num<guess_num) 
		{
                System.out.println("The number is"+" less than "+guess_num);
            }
            else if(num>guess_num) 
		{
                System.out.println("The number is"+" greater than "+guess_num);
            }
        }
        if(i==c)
		{
            System.out.println("You have completed your "+c+" trials.");
			System.out.println("Better Luck next time.");
            System.out.println("The Actual Number is: " + num);
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
		GuessNum g=new GuessNum();
        	g.guessnumber();
    }
}