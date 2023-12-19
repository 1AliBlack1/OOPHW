package HW;

public class MyLinkedList {
    public class MylinkdList <T> {
        private Node<T> head;
        private int size;

        public MylinkdList() {
            this.head = null;
            this.size = 0;
        }

        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public void addToFront(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // Метод для вставки элемента в конец списка
        public void addToEnd(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        // Метод для получения размера списка
        public int getSize() {
            return size;
        }

        // Метод для получения элемента по индексу
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }
   
}
