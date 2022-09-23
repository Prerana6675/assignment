package com.yash.assign;
import java.util.Scanner;

public class VowelCons1 {

	
	public static void main(String[] args) {
		//Accepting the string from user
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the inputstring1");
			String inputstring1=sc.nextLine();
			
			System.out.println("enter the inputstring2");
			String inputstring2=sc.nextLine();
			
			char input1[]=inputstring1.toCharArray();
			int ind=0;
			
			for(int i=0;i<inputstring1.length();i++)
			{
				char c=inputstring1.charAt(i);
				if(c=='a' || c=='A'|| c=='E'|| c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
				{
					try
					{
				input1[i]=inputstring2.charAt(ind);
				     ind++;
					}
					catch (StringIndexOutOfBoundsException e)
					{
						input1[i]='_';	
					}
				}

			}
			String s=new String(input1);
			System.out.println("Result String ="+s);
	}
	}

