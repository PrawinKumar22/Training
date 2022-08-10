package com.example1;

import java.util.Arrays;

import java.util.Scanner;

public class OccurrenceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           int[] n = {1,5,2,1,2,6,7,1};
           
           int key;
           
           Scanner scan = new Scanner(System.in);
           
           System.err.println("Enter the key values as the number present in the array");
           
           System.out.println("The numbers in the array are 1,2,5,6,7");
           
           System.out.println("Enter the key:");
           
           key = scan.nextInt();
           
          
           switch(key) {
                  
           case 1:
        	   
        	  int occurrence1 = 0;
        	  
        	  for(int i=0;i<n.length;i++) {
        		  
        		  if(key == n[i]) {
        			  
        			  occurrence1++;  
        			  
        		  }
        		 
        	  }
        	  
        	  System.out.println("Item 1:Occurrence:"+occurrence1);
        	          	  
        	  break;
        	  
           case 2:
        	   
         	  int occurrence2 = 0;
         	  
         	  for(int i=0;i<n.length;i++) {
         		  
         		  if(key == n[i]) {
         			  
         			  occurrence2++;  
         			  
         		  }
         		 
         	  }
        	  
        	  
        	  System.out.println("Item 2:Occurrence:"+occurrence2);
        	  
        	 // System.out.println( Arrays.asList(n).indexOf(n)); 
        	  
        	  break;
        	  
           case 5:
        	   
         	  int occurrence5 = 0;
         	  
         	  for(int i=0;i<n.length;i++) {
         		  
         		  if(key == n[i]) {
         			  
         			  occurrence5++;  
         			  
         		  }
         		 
         	  }
         	  
         	  System.out.println("Item 5:Occurrence:"+occurrence5);
         	  
         	  break;
         	  
           case 7:
        	   
         	  int occurrence7 = 0;
         	  
         	  for(int i=0;i<n.length;i++) {
         		  
         		  if(key == n[i]) {
         			  
         			  occurrence7++;  
         			  
         		  }
         		 
         	  }
         	  
         	  System.out.println("Item 7:Occurrence:"+occurrence7);
         	  
         	  break;
        	  
        	 
           }
           
           
	}

}
