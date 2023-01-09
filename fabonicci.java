public class Main
{
  public static void fabb (int a, int b, int n)
  {
    if (n == 0)
      {
	return;
      }
    int c = a + b;
    System.out.print (c + " ");
    fabb (b, c, n - 1);

  }
  public static void main (String args[])
  {
    int n = 10, a = 0, b = 1;
    System.out.println (a);
    System.out.println (b);
    fabb (0, 1, n - 2);
  }
}
