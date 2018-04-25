import java.util.Arrays;
public class ArraysLab3 {

	public static void main(String[] args) {
		int[] a1 = new int[8];
		for (int x=1; x<a1.length;x++) {
			a1[x]= x*5;
		}
		int[] a2= new int[8];
		for (int x=1; x<a2.length;x++) {
			a2[x]= x*7;
		}
		int[] sumArr = sum(a1,a2);
		int appendNum =200;
		int[] appendArr = append(a1,appendNum);
		int removeIdx =5;
		int[] removeArr= remove(a2,removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] list = new int[arr1.length];
		for (int x=0;x<arr1.length;x++) {
			list[x]= arr1[x]+arr2[x];
		}
		return list;
	}
	public static int[] append(int[] arr,int num) {
		int[] plusone = new int[arr.length +1];
		for(int x=0; x<arr.length;x++) {
			plusone[x]= arr[x];
		}
		plusone[plusone.length-1]=num;
		return plusone;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] notidx = new int[arr.length-1];
		for (int x=0; x<idx;x++) {
			notidx[x]=arr[x];
		}
		for (int x=idx+1;x<arr.length;x++) {
			notidx[x-1]=arr[x];
		}
		return notidx;
	}
	public static int sumEven(int[] arr) {
		int sum=0;
		for (int x=0; x<arr.length;x+=2) {
			sum+=arr[x];
		}
		return sum;
	}
	public static void rotateRight(int[] arr) {
		int last = arr[arr.length-1];
		for (int x = arr.length-1;x>0;x--){
			arr[x]=x-1;
		}
		arr[0]=last;
	}
}
