public class Node {

     /* INSTRUCTIONS
     Fields -
          :Node next,prev
          :Integer data
     Methods -
          :Node next()
          :Node prev()
          :void setNext(Node other)
          :void setPrev(Node other)
          :Integer getData()
          :Integer setData(Integer i)
          :String toString()
     */

     public static void main(String[] args) {
          Node test1 = new Node(70, null, null);
          Node test2 = new Node(60, null, test1);
          test1.setNext(test2);
          System.out.println(test1);
          System.out.println(test2);
          System.out.println(test2.prev());
     }


     private Integer data;
     private Node next;
     private Node prev;

     public Node(Integer val, Node n, Node p) {
          data = val;
          next = n;
          prev = p;
     }

     public Node next() {
          return next;
     }

     public Node prev() {
          return prev;
     }

     public void setNext(Node other) {
          next = other;
     }

     public void setPrev(Node other) {
          prev = other;
     }

     public Integer setData(Integer i) {
          Integer temp = data;
          data = i;
          return temp;
     }

     public Integer getData() {
          return data;
     }

     public String toString() {
          return "" + data;
     }

}
