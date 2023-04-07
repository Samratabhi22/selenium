package com.example.demo.courseservices;

public class Sample {
 public static void main(String [] args) {
	 int arr[]= {10,20,60,2689};
	 int irr[]={10,20,2689};
	 int count =0;
	 for(int i=0;i<arr.length;i++) {
		 for(int k=0;k<irr.length;k++) {
			 if(arr[i]==irr[k]) {
				
				
				 break;
			 }
			 else {
				 count++;
				 
				 
			 }
			 if(count==irr.length) {
				 System.out.println(arr[i]);
			 }
			 
			 
		 }
	 }
 }
}
