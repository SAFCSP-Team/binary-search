public class Main{
   public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        for (int x = 1; x<=10; x++){
           obj.insert(x);
   }
   System.out.println(obj.binarySearch(8).data);


}
}
