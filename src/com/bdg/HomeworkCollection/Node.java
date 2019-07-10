package com.bdg.HomeworkCollection;

public class Node {

 
      int val;
      Node next;
      Node head = null;
      Node tail = null;
      public Node(int val){
          this.val = val;

      }
    
        




        public void addValue(int val){
            if(head==null){
               Node temp = new Node (val);
                head = temp;
                tail = temp;
            }else{
                tail.next = new Node (val);
                tail = tail.next;
            }
        }

        public void removeValue(int val){
          Node temp = head;
           tail.next = null;
           tail = temp;

        }

        public void AddValueFromStart(int val){
            if(head == null){
                Node temp = new Node (val);
                head = temp;
                tail = temp;
            }else{
               Node  temp = new Node (val);
                temp = head;
                tail = temp;
            }

        }



}
