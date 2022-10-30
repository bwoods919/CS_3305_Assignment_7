// Class Heap.java 
// Textbook - Listing 23.9, Page 878

public class TestHeapSort { 
   /** A test method */
   public static void main(String[] args) {

      Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
      Character[] list2 = {'w','f','A','X','T','Q','k','s','8','L','3','b','A','w','s','H','j','K','L'};
      String[] list3 = {"Class", "Study", "Data", "Computing", "hard", "Structures,", "to pass."};

      // list
      System.out.print("Original List:\t");  //print original list
      for (Integer integer : list) System.out.print(integer + " ");
         
      HeapSort.heapSort(list);  //sort the list
      
      System.out.print("\n\nSorted List:\t");  //print original list
      for (Integer integer : list) System.out.print(integer + " ");

      // list2
      System.out.print("\n\nOriginal List2:\t");  //print original list
      for (Character character : list2) System.out.print(character + " ");

      HeapSort.heapSort(list);  //sort the list

      System.out.print("\n\nSorted List2:\t");  //print original list
      for (Character character : list2) System.out.print(character + " ");

      // list3
      System.out.print("\n\nOriginal List3:\t");  //print original list
      for (String s : list3) System.out.print(s + " ");

      HeapSort.heapSort(list);  //sort the list

      System.out.print("\n\nSorted List3:\t");  //print original list
      for (String s : list3) System.out.print(s + " ");
   }
}
