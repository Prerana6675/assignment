package com.yash.assign;
import java.io.*;
import java.util.*;
	
public class SmallLetter {
	
	
	public static void main(String gg[])
	{
	try
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	Scanner br=new Scanner(System.in);
	System.out.print("Enter a string ");
	int im;
	char []ca;
	ca=new char[100];
	int i=1;
	im=br.read();
	if(im>=65 && im<=91) im=im+32;
	else if(im>=97 && im<=122) im=im-32;
	ca[0]=(char)im;
	while(br.ready())
	{
	im=br.read();
	if(im>=65 && im<=91) im=im+32;
	else if(im>=97 && im<=122) im=im-32;
	ca[i]=(char)im;
	i++;
	}
	for(int ii=0;ii<100;ii++) System.out.print((char)ca[ii]);
	}catch(IOException io)
	{
	System.out.println("gadbaddd !!");
	}
	
	}
}
