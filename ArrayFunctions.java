import java.util.*;
class ArrayFunctions{
	void display(ArrayList<Integer> array){
		//UserInput ui = new UserInput();
		//System.out.println("Array is:" +Arrays.toString(array)); //converting array into string
		System.out.println("Array is:" +array); 
		}
	void evenOdd(int[] array){
		//Using array
		//int ODD_INDEX = 0;
		//int EVEN_INDEX = 0;
		//int[] even = new int[5];
		//int[] odd = new int[5];
		
		//Using ArrayLists
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i = 0 ; i<array.length; i++){
			if (array[i] % 2 == 0){
				//even[EVEN_INDEX]=array[i];
				//EVEN_INDEX++;
				even.add(array[i]);
			}
			else{
				//odd[ODD_INDEX]=array[i];
				//ODD_INDEX++;
				odd.add(array[i]);
			}
				
		}
		display(even);
		display(odd);
	}
	
	int findSmallestDistanceIndex(int[] array) {
    int minIndex = 0;
    int minDiff = array[1] - array[0];

    if (minDiff < 0) {
        minDiff = -minDiff; 
    }

    for (int i = 1; i < array.length - 1; i++) {
        int diff = array[i + 1] - array[i];
        if (diff < 0) {
            diff = -diff;
        }

        if (diff < minDiff) {
            minDiff = diff;
            minIndex = i;
        }
    }
    return minIndex;
}

	public static int[] convertArrayOperations(int[] array) {
        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        System.out.println("Converted Array to ArrayList: " + arrayList);

        // Convert ArrayList back to array
        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i);
        }
        System.out.println("Converted ArrayList back to array: " + Arrays.toString(newArray));

        return newArray;
    }
}