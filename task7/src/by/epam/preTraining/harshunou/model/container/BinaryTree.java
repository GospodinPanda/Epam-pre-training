package by.epam.preTraining.harshunou.model.container;

import by.epam.preTraining.harshunou.exceptions.CustomTreeIsEmptyException;

public class BinaryTree<T extends Comparable> {
    private Node head;
    private int nodeCount;

    public void add(T value) {
        if (head == null) {
            head = new Node(value);
        } else {
            addRecursive(head, value);
        }
        nodeCount++;
    }

    private void addRecursive(Node node, T value) {
        if (value.compareTo(node.value) < 0) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                addRecursive(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                addRecursive(node.right, value);
            }
        }
    }

    public boolean contains(T value) {
        return findCurrentRecursive(head, value) != null;
    }


    private Node findCurrentRecursive(Node current, T value) {
        if (current == null) {
            return null;
        }
        int result = value.compareTo(current.value);
        if (result == 0) {
            return current;
        }
        return result < 0 ? findCurrentRecursive(current.left, value) : findCurrentRecursive(current.right, value);
    }

    public void remove(T value) throws CustomTreeIsEmptyException {
        if (head == null) {
            throw new CustomTreeIsEmptyException("There are no elements in tree");
        }
        removeRecursive(head, value);
        nodeCount--;
    }

    private Node removeRecursive(Node current, T value) {
        if (current == null) {
            return null;
        }
        if (value.compareTo(current.value) == 0) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            T smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.value) < 0) {
            current.left = removeRecursive(current.left, value);
            return current;
        }
        current.right = removeRecursive(current.right, value);
        return current;
    }

    private T findSmallestValue(Node node) {
        return node.left == null ? (T) node.value : findSmallestValue(node.left);
    }

    public void clear() {
        head = null;
        nodeCount = 0;
    }

    public int size() {
        return nodeCount;
    }

    public Node getHead() {
        return head;
    }

    public StringBuilder preOrder() throws CustomTreeIsEmptyException {
        if (head == null) {
            throw new CustomTreeIsEmptyException("There is nothing to show");
        }
        return preOrderRecursive(head, new StringBuilder());
    }

    private StringBuilder preOrderRecursive(Node node, StringBuilder stringBuilder) {
        if (node != null) {
            stringBuilder.append(node.value + " ");
            preOrderRecursive(node.left, stringBuilder);
            preOrderRecursive(node.right, stringBuilder);
        }
        return stringBuilder;
    }


    public StringBuilder postOrder() throws CustomTreeIsEmptyException {
        if (head == null) {
            throw new CustomTreeIsEmptyException("There is nothing to show");
        }
        return postOrderRecursion(head, new StringBuilder());
    }

    private StringBuilder postOrderRecursion(Node node, StringBuilder stringBuilder) {
        if (node != null) {
            postOrderRecursion(node.left, stringBuilder);
            postOrderRecursion(node.right, stringBuilder);
            stringBuilder.append(node.value + " ");
        }
        return stringBuilder;
    }


    public StringBuilder inOrder() throws CustomTreeIsEmptyException {
        if (head == null) {
            throw new CustomTreeIsEmptyException("There is nothing to show");
        }
        return inOrderRecursion(head, new StringBuilder());
    }

    private StringBuilder inOrderRecursion(Node node, StringBuilder stringBuilder) {
        if (node != null) {
            inOrderRecursion(node.left, stringBuilder);
            stringBuilder.append(node.value + " ");
            inOrderRecursion(node.right, stringBuilder);
        }
        return stringBuilder;
    }

    public class Node<T extends Comparable> {
        Node right;
        Node left;
        T value;

        public Node(T value) {
            this.right = null;
            this.left = null;
            this.value = value;
        }

        public int compareTo(Object o) {
            return value.compareTo(o);
        }
    }
}

