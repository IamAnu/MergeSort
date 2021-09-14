import java.util.Scanner;



public class solution {

	public static void mergeSort(int[] arr){
		int n = arr.length;
		int a1[] = new int[n/2];
		int a2[] = new int[n-a1.length];

		for(int i=0 ; i<n/2 ; i++){
			a1[i] = arr[i];
		}

		for(int j=n/2; j<n ; j++){
			a2[j-n/2] = arr[j];
		}

		mergeSort(a1);
		mergeSort(a2);
		solveMerging(a1 , a2, arr); 
		
	}

	public static void solveMerging(int a1[] , int  a2[]  , int d[]){

		int a1_ind =0,a2_ind = 0, d_ind =0;
		int p = a1.length;
		int q = a2.length;
		int r = d.length;

		while(a1_ind < p && a2_ind < q){
			if(a1[a1_ind] <= a2[a2_ind]){
				d[d_ind] = a1[a1_ind];
				a1_ind++;
				d_ind++;
			}
			else {
				d[d_ind] = a2[a2_ind];
				a2_ind++;
				d_ind++;
			}
		}

		while(a1_ind < p){
			d[d_ind] = a1[a1_ind];
				a1_ind++;
				d_ind++;
		} 
		while(a2_ind < q){
			d[d_ind] = a2[a2_ind];
				a2_ind++;
				d_ind++;
		}
	}
    
    
    
    
}





class MergerArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}
