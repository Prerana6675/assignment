package com.yash.assign;

import java.util.Scanner;

public class StringProblemState7 {

	  private String arr[];
	  private int top;
	  private int capacity;


	  StringProblemState7(int size) {
	    arr = new String[size];
	    capacity = size;
	    top = -1;
	  }


	  public void push(String x) {
	    if (isFull()) {
	      System.out.println("OverFlow\nProgram Terminated\n");
	      System.exit(1);
	    }

	    System.out.println("Inserting " + x);
	    arr[++top] = x;
	  }


	  public String pop() {
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      System.exit(1);
	    }
	    return arr[top--];
	  }


	  public int size() {
	    return top + 1;
	  }


	  public Boolean isEmpty() {
	    return top == -1;
	  }


	  public Boolean isFull() {
	    return top == capacity - 1;
	  }

	  public void printStack() {
	    for (int i = 0; i <= top; i++) {
	      System.out.println(arr[i]);
	    }
	  }

	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("\nPlease enrter stack size: ");
		  int stackSize= sc.nextInt();
		  StringProblemState7 stack = new StringProblemState7(stackSize);
		  System.out.println("\nPlease enter stack values to add: ");
		  for(int i=0; i<stackSize; i++) {
			  stack.push(sc.next());
		  }
		  
		  System.out.println("\nprovided stack elements are: ");
		  stack.printStack();
		  
		  

	    stack.pop();
	    System.out.println("\nAfter popping out");

	    stack.printStack();

	  }
	
}
