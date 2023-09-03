package com.tech;

public class Demo1 {
	public static void main(String[] args) {
			int arr[] = {24,35,45,68,87,10,36};
			int sumeven =0;
			int sumodd =0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2 ==0) {
					System.out.println(arr[i]);
					sumeven = sumeven+arr[i];
				}else {
					System.out.println(arr[i]);
					sumodd = sumodd+arr[i];
				}
			}
			System.out.println("sumeven Element is>>"+sumeven);
			System.out.println("sumodd Element is>>"+sumodd);
	}
}
