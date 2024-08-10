

public class PrintFirstArg {
  public static void main(String[] args) {
    if (args.length > 0) {
      String first = args[0];
      System.out.println(first);
    } else {
      System.out.println("Nenhum argumento foi passado.");
    }
  }
}