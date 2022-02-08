package basiccoreprogram;
import java.util.Scanner;
public class Flipcoin {

	public static void main(String[] args) {
		//No of times Flip Coin.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times Flip Coin");
        int n = sc.nextInt();
        System.out.println("Enter the number of times Flip Coin");
        int head = 0, tail = 0;
        for(int i=0;i<n;i++) {
        	if(Math.random()<0.5){
        		head++;
        	}
        	else 
        	{
        		tail++;
        	}
        }
        int hper = (head*100)/n;
        int tper = (tail*100)/n;
        System.out.println("Head Percentage(%)=" +hper);
        System.out.println("Head Percentage(%)=" +tper);
        System.out.println("HEADS=" +head);
        System.out.println("TAILS=" +tail);
        
	}

}
