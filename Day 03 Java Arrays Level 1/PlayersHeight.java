import java.util.Scanner; 
public class PlayersHeight{
	public static void main(String[]args){
		//Creating scnammerr class 
		Scanner input=new Scanner(System.in); 
		
		//Creating double array to store height of players 
		double playerHeights[] = new double[11]; 
		
		//Taking Height input from players 
		System.out.println("All players please enter your height "); 
		
		for(int i=0;i<11;i++){
			playerHeights[i]=input.nextDouble(); 
		} 
		//performing sum of the heights
		double totalSumHeight=0.0; 
		
		for(int i=0;i<11;i++){
			totalSumHeight+=playerHeights[i];
		}
		
		//Calculate Result 
		double meanHeight= totalSumHeight/11.0;
		
		//Display Result
		System.out.println("Mean Height of the 11 players is : "+ meanHeight);
	}
	
}