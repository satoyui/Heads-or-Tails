//import java.util.Scanner;
public class coin{
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Who are you?");
        //String st = scanner.next();
        //System.out.println("Hello, "+st+"!");
        System.out.println("Tossing a coin");
        int a = 0;
        int b = 0;
        for( int i=0 ; i<3 ; i++ ){
            int n = 1+(int)(Math.random()*2);
            int k = i+1;
            if( n==1 ){
                System.out.println("Round "+k+" : Heads");
                a++;
            }
            else if( n==2 ){
                System.out.println("Round "+k+" : Tails");
                b++;
            }
        }
        System.out.println("Heads: "+a+", Tails: "+b);
        if( a>b ){
            System.out.println("you won!");
        }
        else{
            System.out.println("you lost.");
        }

    }
}