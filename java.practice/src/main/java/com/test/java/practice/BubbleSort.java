package com.test.java.practice;

class BubbleSort{



	public static void main (String []args) {


		int []array = {55,54,32,45,50};

		for(int i=0;i<array.length;i++) {

			for(int j=0;j<array.length-1;j++) 
				if(array[j]>array[j+1]) {

					int	temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}

		}
		for(int k=0;k<array.length;++k) {

			System.out.print(array[k]+" ");
		}
	}
}