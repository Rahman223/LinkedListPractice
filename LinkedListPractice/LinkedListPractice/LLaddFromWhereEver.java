package LinkedListPractice;
import LinkedListPractice.LL;
public class LLaddFromWhereEver <E> extends LL <E>{
    int numOfElem =0;

public void addFront (E data){
    if (this.head==null){
        this.head= new Node <E> (data);
        this.numOfElem++;
    } else {
    Node <E> new_node = new Node <>(data);
    Node <E> temp = this.head;
    this.head = new_node; 
    this.head.next=temp;
    this.numOfElem++;
    }
}

public void removeFront (){
    if (this.head==null){
        System.out.println("List is empty");
    }else {
        this.head = this.head.next; 
        numOfElem --;
    }
}

public void addAtIndex (int index, E data){
    int runningIndex = 0; 
    if (index<0){
        System.out.println("invalid index");
    }
    else if (index==0){
      this.addFront(data);
    } else if(index>0) {
    Node<E> current = this.head; 
    while (current.next!=null){
        runningIndex++;
        Node<E> tempPrev = current;
        current= current.next;
        while (runningIndex==index){
            Node<E> new_Node = new Node<>(data);
            tempPrev.next = new_Node;
            new_Node.next= current;
            this.numOfElem++;
            break;
        }
    }
 }else if (index == numOfElem){
     Node <E> newNode = new Node<>(data);
     Node <E> current = this.head;
     while (current.next!=null){
         current = current.next;
         while (current.next == null){
             current.next = newNode; 
             this.numOfElem++;
         }
     }
 }
}

public void delAtIndex (int index){
    int runningIndex = 0; 
    if(index<0){
        System.out.println("invalid index");
    }else if (index==0){
        this.removeFront();
    } else if(index>0){
        Node <E> current = this.head;
        Node <E> tempPrev ; 
        while (current.next!=null){
            runningIndex++;
            tempPrev = current;
            current=current.next;
            while (runningIndex==index){
                tempPrev.next= current.next;
                current.next= null;
                numOfElem--;
                break;
            }
        }
    }
}

public Node <E> reverseList (){
    Node <E> prev = null; 
    Node <E> current = this.head;
    Node <E> next = null;
    while (current != null){
        next = current.next;
        current.next= prev;
        prev = current; 
        current =next;

    }
    return prev;
}
public Node <E> searchForElem (E data){
    if (head==null){
        System.out.println("list is empty: Null node is returned");
        return head;
    } else {
        Node <E> current = this.head;
        while (current.next != null){
            if (current.getData().equals(data)) {
                break;
            }else {
            current= current.next;
        }
        }
        return current; 
    } 
}

public void delByElem (E data){
    if (head==null){
        System.out.println("list is null");
    }else {
        Node <E> current = head;
        Node <E> prev; 
        while (current.next != null){
            prev = current;
            current = current.next;
            if (current.getData().equals(data)){
                prev.next = prev.next.next;
            }
        }
    }
}

}