
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        int[] elements = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int element : elements) {
            list.add(element);
        }
        
        list.binarySearch(9); 
    }
}
