class Node {
    int list;
    Node next;

    public Node(int list) {
        this.list = list;
        next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { // LinkedList kosong
            head = newNode;
        } else if (head.list > data) { // Menambahkan sebagai elemen pertama
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.list < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printSebelum() {
        Node current = head;
        System.out.print("Sebelum diurutkan: ");
        while (current != null ) {
            System.out.print(current.list + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printList() {
        Node current = head;
        System.out.print("Setelah diurutkan: ");
        while (current != null) {
            System.out.print(current.list + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class kegiatan2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);
        list.printSebelum();
        list.printList();
    }
}
