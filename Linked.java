class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked {

    Node head;

    // Add node at beginning
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Print Linked List
    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Find middle node
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge two sorted linked lists
    private Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // Merge Sort
    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }
    public void zigZag(){
        //find mid
  Node slow=head;
  Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    
     //reverse 2md half
  Node curr=mid.next;
  mid.next=null;
  Node prev=null;
  Node  next;
  while(curr!=null){
    next =curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
  }
  Node left=head;
  Node right=prev;
  Node nextL,nextR;


        //alt mefge-zigzag merge
        while(left!=null&& right !=null){
            nextL=left.next;
            left.next=right;
             nextR=right.next;
             right.next=nextL;

             left=nextL;
             right=nextR;
        }
    }

    public static void main(String[] args) {

        Linked ll = new Linked();

       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);

        // System.out.println("Original Linked List:");
        // ll.print();

        // ll.head = ll.mergeSort(ll.head);

        // System.out.println("Sorted Linked List:");
        ll.print();
        ll.zigZag();
          ll.print();
    }
}