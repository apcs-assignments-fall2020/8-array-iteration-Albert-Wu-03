public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
		int a = arr.length-1;
		int b = 0;
		for(int i = 0; i < arr.length/2; i++) {
			int c = arr[a];
			arr[a] = arr[b];
			arr[b] = c;
			a--;
			b++;			
		}
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
		int temp;
		   for (int i = 1; i < arr.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (arr[j] < arr [j - 1]) {
		      temp = arr[j];
		      arr[j] = arr[j - 1];
		      arr[j - 1] = temp;
		     }
		    }
		   }
		return arr[arr.length-2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
		int b = 0;
		for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]%arr[i] == 0||arr[i]%arr[i+1] == 0) {
                b = 1;
			}else{
                b = 0;
                break;
            }            	
        }
		if(b==0) {
			return false;
		}else{
            return true;
        }
}


    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9};
        System.out.println(reverse(arr));
        System.out.println(secondLargest(arr));
        System.out.println(isGeometric(arr));
    }
}
