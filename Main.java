import java.util.*;
class Main{
	public static void main(String args[]){
		UserInput ui = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();
		//int[] array = ui.arrayInput();
		functions.evenOdd(ui.arrayInput());
		int minIndex = functions.findSmallestDistanceIndex(ui.arrayInput());
        System.out.println("Index of the first number with the smallest distance: " + minIndex);
        
        functions.convertArrayOperations(ui.arrayInput());
	}
}