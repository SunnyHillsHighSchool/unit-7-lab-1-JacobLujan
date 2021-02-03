//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Lujan
//Date - 2/2/21

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
   int sum = 0;
 //create a for each loop
for(int i: ray)
{
   sum = i + sum;
}



  return sum;
 }
}