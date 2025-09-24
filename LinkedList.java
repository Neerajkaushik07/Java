public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int Size;

    public void addFirst(int data) {
        // Step 1 = Create new node
        Node newNode = new Node(data);
        Size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 = newNode next = head
        newNode.next = head;// link
        // Step 3 = head = newNode
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        Size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (Size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (Size == 1) {
            int value = head.data;
            head = tail = null;
            Size = 0;
            return value;
        }

        int value = head.data;
        head = head.next;
        Size--;
        return value;
    }

    public int removeLast(){
        if(Size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(Size == 1){
            int value = head.data;//head or tail ka data same rhegaa
            head = tail = null;
            Size = 0;
            return value;
        }
        Node prev = head;
        for(int i=0; i<Size-2; i++){
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        Size--;
        return value;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i= 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.add(0, 00);
        // ll.print();
        // System.out.println(ll.Size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.Size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.Size);
        // System.out.println(ll.itrSearch(3));
        System.out.println(ll.recSearch(3));
        // System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(10));
    }
}