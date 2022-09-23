package com.yash.assign;

public class MinimumNumber {
	
		   public static int getThirdSmallest(int[] a) {
		      int temp;
		      //sort the array
		      int count=0;
		      for(int i:a){
		          count++;
		      }
		      for (int i = 0; i < count; i++) {
		         for (int j = i + 1; j < count; j++) {
		            if (a[i] > a[j]) {
		               temp = a[i];
		               a[i] = a[j];
		               a[j] = temp;
		            }
		         }
		      }
		      //return third smallest element
		      return a[2];
		   }
		   public static void main(String args[]) {
		      int a[] = { 11,10,4, 15, 16, 13, 2 };
		      System.out.println("Third Smallest: " +getThirdSmallest(a));
		   }
		}

