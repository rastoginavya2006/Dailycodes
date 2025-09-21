import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == key) {
            head = head.next;
            System.out.println("Deleted " + key);
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value " + key + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted " + key);
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete a Node");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val1 = sc.nextInt();
                    list.insertAtBeginning(val1);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    int val2 = sc.nextInt();
                    list.insertAtEnd(val2);
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int key = sc.nextInt();
                    list.deleteNode(key);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
