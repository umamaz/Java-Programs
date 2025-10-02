public class Prog44 {
 
  public static <T> void printArray(T[] array) {
    for (T item : array) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
   
    String[] names = {"Azeez", "Ahmad"};

    Integer[] numbers = {1, 2, 3};

   
    printArray(names);
    printArray(numbers);
  }
}