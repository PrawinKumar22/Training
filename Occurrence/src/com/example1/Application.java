package com.example1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {1,5,2,1,2,6,7,1};
		
		int length = n.length;
		
		for(int i =0; i<n.length; i++) {
			
			int occurrence = 0;
			
			for(int j =0; j<n.length;j++) {
				
				if(n[i]==n[j]) {
					
					occurrence++;
		
				}
			}
			System.out.println("occurrence:"+n[i] +"=>"+ occurrence);
		}
		

	}

}
