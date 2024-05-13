package edu.unlam.paradigmas.iterator;

public class App {

	public static void main(String[] args) {
		Matrix<Integer> matriz = new Matrix<Integer>(new Integer[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		});
		
		for (Integer elem : matriz) {
			System.out.println(elem);
		}
	}
	
}
