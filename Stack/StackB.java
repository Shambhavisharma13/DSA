import java.util.*;
public class StackB{
  //push at the bottom
public static void pushAtBottom(Stack<Integer> s,int data){
  
  if(s.isEmpty()){
    s.push(data);
    return;
  }
  int top=s.pop();
  pushAtBottom(s,data);
  s.push(top);
}
public static void reverseStack(Stack<Integer>s){
  if(s.isEmpty()){
    return;
  }
  int top=s.pop();
  reverseStack(s);
  pushAtBottom(s,top);

}
public static void printStack(Stack<Integer> s){
  while(!s.isEmpty()){
    System.out.println(s.pop());
  }
}
//reverse the string in astack
// public static String  reverseString(String str){
//   Stack<Character> s=new Stack<>();
//   int idx=0;
//   //push all  character into stack
//   while(idx<str.length()){
//     s.push(str.charAt(idx));
//     idx++;
//   }
//   //create empty result
//   StringBuilder result=new StringBuilder("");
//   //pop characters and append
//   while(!s.isEmpty()){
//     char curr=s.pop();
//     result.append(curr);
//   }
  
     
//    return result.toString();
// }

    // static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static class Stack {
    //     static Node head = null;

    //     // Check if stack is empty
    //     public static boolean isEmpty() {
    //         return head == null;
    //     }

    //     // Push operation
    //     public static void push(int data) {
    //         Node newNode = new Node(data);

    //         if (isEmpty()) {
    //             head = newNode;
    //             return;
    //         }

    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     // Pop operation
    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }

    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     // Peek operation
    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }

    //         return head.data;
    //     }
    // }

   
          // static ArrayList<Integer>list=new ArrayList<>();
          // public static boolean isEmpty(){
          //   return list.size()==0;
          // }
          // //push
          // public static void push(int data){
          //   list.add(data);
          // }
          // //pop
          // public static int pop(){
          //   if(isEmpty()){
          //       return -1;
          //   }
          //   int top=list.get(list.size()-1);
          //   list.remove(list.size()-1);
          //   return top;
          // }
          // //peek
          // public static int peek(){
          //  return list.get(list.size()-1);

            
          // }
      public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        printStack(s);
        reverseStack(s);
        printStack(s);


        // Stack s = new Stack();

    // Stack<Integer> s=new Stack<>();
    //    s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     pushAtBottom(s,4);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
      //  while(!s.isEmpty()){
      //   System.out.println(s.pop());
      //  }
    //   String str="HELLOWORLD";
    //   String result=reverseString(str);
    //   System.out.println(result);
    // }
  }
}
