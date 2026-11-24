# Linked List — Practice: Rebuild with Sentinels

The chapter's `LinkedList` rebuilt with front and back sentinel nodes, so every real node always has a neighbor on both sides and `add`/`remove` have no boundary-case branches.

## Prerequisites

- JDK 17+

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  src/
    main/
      practice/
        LinkedList.java     # the sentinel-based list rebuilt from the chapter's LinkedList
      demo/
        LinkedListDemo.java
  scripts/
    run.sh                  # compile everything and run one demo
```

## How to compile and run

- `scripts/run.sh demo.LinkedListDemo` — compiles everything and runs that one demo. Every class you implement has its own demo, `<Class>Demo`.

There is no build tool and no test suite: testing is introduced later in the course. The script above is all you need.

## Contents

- `practice.LinkedList<T>` — the chapter's list rebuilt with two sentinel nodes. `head` and `tail` always point to sentinels; the first real node is `head.next`, the last is `tail.prev`, and the list is empty exactly when `head.next == tail`. Because every real node always has both a `prev` and a `next`, `add` (via `insertBetween`) and `remove` (via `unlink`) have no boundary-case branches. The public operations are identical to the chapter's.
- `demo.LinkedListDemo` — the demo of `LinkedList`; it exercises the sentinel list, including removing at the head and the tail, which here needs no special case.
