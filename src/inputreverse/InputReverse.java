import java.util.*;

public class InputReverse {

	public static Scanner kbd;
        
        public static final int MAXSIZE = 10;
	
	public static void main(String[] args) {
		
		kbd = new Scanner(System.in);
		
                int numbers[] = new int[MAXSIZE];
                
		System.out.println("Enter 10 numbers: ");
                
                for (int i = 0; i<MAXSIZE; i++){
                    numbers[i] = kbd.nextInt();
                }
                
                System.out.println("The numbers you entered, in reverse order are:");
                
                for (int x = 9; x>=0; x--){
                    System.out.println(numbers[x]);
                }

		kbd.close();
	}
}