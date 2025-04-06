package DoublyLinkedList_IMplementations;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int count = 0;

    public void add(Object ele) {
        if (head == null) {
            addfirst(ele);
            return;
        }
        Node n = new Node(tail, ele, null);
        tail.next = n;
        tail = n;
        count++;
    }

    public void addfirst(Object ele) {
        Node n = new Node(null, ele, head);
        if (head != null) head.prev = n;
        head = n;
        if (tail == null) tail = n;
        count++;
    }

    public void addpos(Object ele, int index) {
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addfirst(ele);
            return;
        }
        if (index == size()) {
            add(ele);
            return;
        }

        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        Node n = new Node(curr, ele, curr.next);
        curr.next.prev = n;
        curr.next = n;
        count++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();

        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            count--;
            return;
        }

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.prev.next = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev;
        else tail = curr.prev;

        count--;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }

    public void reverseDisplay() {
        Node curr = tail;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.prev;
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean contains(Object ele) {
        Node curr = head;
        while (curr != null) {
            if (curr.ele.equals(ele)) return true;
            curr = curr.next;
        }
        return false;
    }

    public void reverse() {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) head = temp.prev;

        // Fix tail
        tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    public boolean isCircular() {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
}
