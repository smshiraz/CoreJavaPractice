package com.syed.corejava.SinglyLinkedList;

public class LinkedListCycle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // No cycle in an empty list or a list with one node
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();

        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Link nodes to form a list: 1 -> 2 -> 3 -> 4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Test with no cycle
        System.out.println("List has cycle (should be false): " + list.hasCycle(node1));

        // Create a cycle: 4 -> 2
        node4.next = node2;

        // Test with a cycle
        System.out.println("List has cycle (should be true): " + list.hasCycle(node1));
    }
}