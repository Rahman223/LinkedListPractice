package LinkedListPractice;
public class LL <E> {
    Node <E> head = null;
    Node <E> tail = null;
    LL (){}
    public static class Node <E> {
        private E data;
        Node <E> next;
        public Node (E data){
            this.data= data;
            this.next = null;
        }
        public E getData (){
            return this.data;
        }
        
        }
        public void displayList (Node <E> head){
            if (head==null){
                System.out.println("null");
            } else {
                Node <E> current = this.head;
                while (current.next!= null){
                    System.out.println(current.data);
                    current= current.next;
                    while (current.next==null){
                        System.out.println(current.data);
                        break;
                    }
                }
            }
        }
    
        public void addFront (E data){
             if (this.head==null){
                 this.head= new Node <E> (data);
             }
             Node <E> new_node = new Node <>(data);
             Node <E> temp = this.head;
             this.head = new_node; 
             this.head.next=temp;
    
        }
        public void removeFront (){
            if (this.head==null){
                System.out.println("List is empty");
            }else {
                this.head = this.head.next; 
            }
        }
        public void listSize (Node <E> head){
            int count = 0;
            if (head==null){
                System.out.println("List is empty");
            }else {
                Node <E> current = head;
                while (current.next!=null){
                    current = current.next;
                    count++;
                }
            }
            System.out.println("List size:" + count);
        }
    
    
    }