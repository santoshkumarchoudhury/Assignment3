package com.epam.assignment.string;

public class Main {
	
	public static void main (String [] args){
		String str = "TUOPPPPJHHTT";
		char[] array = str.toCharArray();
				int count = 1;
				int max = 0;
				char maxChar = 0;
				for(int i=1; i<array.length; i++){ 
				    if(array[i]==array[i-1]){
				        count++;
				    } else {
				        if(count>max){  
				            max=count;
				            maxChar=array[i-1];
				        }
				        count = 1; 
				    }
				}
				if(count>max){
				    max=count; 
				    maxChar=array[array.length-1];
				}
				System.out.println("Longest run: "+max+", for the character "+maxChar); 
	}

}
