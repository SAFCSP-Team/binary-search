public class DoublyLinkedList {
 Node head;

 public void insert(int data) {
    Node Node = new Node(data);
     if (head == null) {
         head = Node;
   } else {
    Node current = head;
      while (current.next != null) {
        current = current.next;
          }
          Node.previous = current;
          current.next = Node;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
   Node current = head;
     while (current != null) {
       if (current.data == data) {
        if (current.previous == null) {
            /*  Node to delete is the head node */
               head = current.next;
               if (head != null) {
                head.previous = null;
                    }
                } else {
                    /* Node to delete is not the head node */
                    current.previous.next = current.next;
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                }
                break;
            }
            current = current.next;
        }
    }
    

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public Node binarySearch(int target) {
          int low = 0;
          int high = getLength() -1;
          

          while(low <= high){
            int mid = low + (high - low)/2;
            Node midNode = getNodeAtIndex(mid);
            if(target == midNode.data){
                return midNode;
            }else if(midNode.data> target){
                high = mid-1;
            }else{
                low = mid + 1;
            }
          }
          return new Node(-1);

   }
 
   public int getLength(){
    Node current = head;
    int length = 0;
     while(current != null){
        current = current.next;
        length++;
     }return length;
   }

public Node getNodeAtIndex(int index){
    Node current = head;
    while(current != null && index > 0){
        current =current.next;

        index --;
    }return current;


}}


