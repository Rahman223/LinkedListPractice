package LinkedListPractice;
public class LLpractice{

    public static void main (String []args){

        LLaddFromWhereEver <Integer> list = new LLaddFromWhereEver<>();
        list.addFront(15);
        list.addFront(10);
        list.addFront(5);
        list.addFront(5);
        
        
       /* System.out.println(list.numOfElem+ "\n");
        list.displayList(list.head);
        list.addAtIndex(3, 20);
        list.displayList(list.head);
        System.out.println(list.numOfElem);
        list.delAtIndex(0);
        System.out.println();*/
       // list.displayList(list.head);
       // System.out.println(list.numOfElem);
       // list.displayList(list.reverseList());
        
       // System.out.println(list.searchForElem(5).getData());
       list.displayList(list.head);
       list.delByElem(5);
       list.displayList(list.head);
    }
}