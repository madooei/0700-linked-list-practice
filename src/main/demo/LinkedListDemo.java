package demo;

import practice.LinkedList;

/** A demo of the sentinel-based LinkedList. */
public final class LinkedListDemo {

  private LinkedListDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    // A new list holds only its two sentinels. Expect size 0 and [].
    LinkedList<String> names = new LinkedList<>();
    System.out.println("empty: size = " + names.size() + " -> " + toString(names));

    // Expect [Ada, Linus, Grace] and Grace at index 2.
    names.add("Ada");
    names.add("Linus");
    names.add("Grace");
    System.out.println("after three adds: " + toString(names));
    System.out.println("get(2) = " + names.get(2));

    // Expect [Alan, Linus, Grace].
    names.set(0, "Alan");
    System.out.println("after set(0, \"Alan\"): " + toString(names));

    // Expect 2 and true.
    System.out.println("indexOf(\"Grace\") = " + names.indexOf("Grace"));
    System.out.println("contains(\"Linus\")? " + names.contains("Linus"));

    // Removing at the head and the tail needs no boundary branch.
    // remove(0) returns Alan. Expect [Linus, Grace].
    System.out.println("remove(0) returned " + names.remove(0) + " -> " + toString(names));
    // remove(size - 1) returns Grace. Expect [Linus].
    System.out.println("remove(size - 1) returned "
        + names.remove(names.size() - 1) + " -> " + toString(names));

    // Expect [] and size 0.
    names.remove("Linus");
    System.out.println("after remove(\"Linus\"): " + toString(names));
    System.out.println("now empty? size = " + names.size());
  }

  // Builds "[a, b, c]" by reading the list through its public get and size.
  private static <T> String toString(LinkedList<T> list) {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < list.size(); i++) {
      str.append(list.get(i));
      if (i < list.size() - 1) {
        str.append(", ");
      }
    }
    str.append("]");
    return str.toString();
  }
}
