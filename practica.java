package main;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
		int sum = 0;
        for (int num : sumArray) {
            sum += num;
        }
        System.out.println("La suma es : " + sum);
		
		
		// User 2 fer la resta dels elements de subArray
		int subResult = subArray[0];
		for (int i = 1; i < subArray,length; i++) {
			subResult = subArray[i]
		}
		System.out.println("resta de los elementos de subArray: " + subResult);
		
		// User 3 fer la multiplicació dels elements de prodArray
	}

}
