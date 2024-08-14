package repository;

import org.testng.annotations.Test;

public class Git1 
{
 @Test
 public void Factorial()
 {
	 int no=5;
	 int fact=1;
	 for(int i=no;i>=1;i--)
	 {
		 fact=fact*i;
	 }
	 System.out.println(fact);
 }
}
