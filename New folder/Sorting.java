import java.util.*;
class Sorting
{
  public static void printArray (int arr[]) //selection srt
  {
    for (int i = 0; i < arr.length - 1; i++)
      {
	System.out.println (arr[i] + " ");
      }
  }
  public static void main (String args[])
  {
    int arr[] = { 5, 4, 33, 6, 9, 2 };
    for (int i = 0; i < arr.length - 1; i++)
      {
	int smallest = i;
	for (int j = i + 1; j < arr.length; j++)
	  {
	    if (arr[i] > arr[j])
	      {
		smallest = j;
	      }
	  }
	//swap
	int temp = arr[smallest];
	arr[smallest] = arr[i];
	arr[i] = temp;
      }
    printArray (arr);
  }
}
