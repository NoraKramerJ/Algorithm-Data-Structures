package hashtable;

public class HashTable {
    private int size=7;
    private Node[] dataMap;
    public HashTable(){
        dataMap=new Node[size];
    }


    public class Node {

        private int value;
        private String key;
        private Node next;//null

        public Node(int value, String key) {
            this.key = key;
            this.value = value;

        }
    }
    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if (dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }}
}



