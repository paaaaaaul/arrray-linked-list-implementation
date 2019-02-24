package ArrListLinkedList;

public class TestingTheLists {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrL = new ArrayList<>();

        arrL.add(10);
        arrL.add(14);
        arrL.add(8);
        arrL.add(2);
        arrL.add(10000);

        System.out.println(arrL);

        arrL.remove(3);



        System.out.println(arrL.get(2));
        System.out.println("***********************************************************");
        /*------------------------------------------*/
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(10);
        linkedList.add(2);
        linkedList.add(6);

        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList);
    }

}
