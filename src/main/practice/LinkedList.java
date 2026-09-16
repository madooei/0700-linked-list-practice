package practice;

import java.util.Objects;

/**
 * The chapter's LinkedList rebuilt with two sentinel nodes.
 *
 * @param <T> Element type.
 */
public class LinkedList<T> {

  private Node<T> head;   // front sentinel
  private Node<T> tail;   // back sentinel
  private int size;       // number of real nodes

  public LinkedList() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public void add(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public T get(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public void set(int index, T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public int size() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public boolean contains(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns -1 if value is not found.
  public int indexOf(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public T remove(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns false if value is not found.
  public boolean remove(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Insert a new node holding value between two existing nodes.
  private Node<T> insertBetween(T value, Node<T> before, Node<T> after) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes index is in bounds.
  private void validateIndex(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Unlink a node. With sentinels, target always has both a prev and a next,
  // so there are no boundary branches.
  private void unlink(Node<T> target) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Traverse to the node at a given index, from whichever end is nearer.
  private Node<T> node(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the first node with the given value, or null if not found.
  private Node<T> node(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  private static class Node<T> {
    T value;
    Node<T> next;
    Node<T> prev;

    Node(T value) {
      this.value = value;
    }
  }
}
