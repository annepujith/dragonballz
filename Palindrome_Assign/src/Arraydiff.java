import java.util.Random;
import java.util.Scanner;

public class Arraydiff {

	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the size of the array");
	        int size = in.nextInt();
	        System.out.println("Enter the maximum value of the array");
	        int max = in.nextInt();
	        int [] arr  = initializeArr(max, size);
	        print(arr);
	        findMinMax(arr);
	        	    }
	    public static void print(int[] arr){
	        for(int val:arr){
	            System.out.print(val + " ");
	        }
	        System.out.println();
	    }
	    public static int[] initializeArr(int max,int size){
	        Random random = new Random();
	        int [] arr = new int[size];
	        for(int ii=0;ii<arr.length;ii++){
	            arr[ii]=random.nextInt(max);
	        }
	        return arr;
	    }
	    public static void findMinMax(int[] arr){
	        int min=arr[0];
	        int max=arr[0];
	        for(int ii=0;ii<arr.length;ii++){
	            if(arr[ii]<min){
	                min=arr[ii];
	            }
	            else if(arr[ii]>max){
	                max=arr[ii];
	            }
	        }
	        System.out.println("The minimum in the array::"+min);
	        System.out.println("The maximum in the array::"+max);
	        int result = max-min;
	        System.out.println(result);
	    }
	}



