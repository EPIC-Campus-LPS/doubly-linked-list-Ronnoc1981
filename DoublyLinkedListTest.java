
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    DoublyLinkedList list = new DoublyLinkedList();
    @Test
    void add() {
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    void testAdd() {
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3,5);
        assertEquals(5,list.get(3).getVal());
    }

    @Test
    void remove() {
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3,list.remove());
    }

    @Test
    void testRemove() {
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1,list.remove(1));
    }


    @Test
    void set() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(2,4);
        list.set(0, 2);
        assertEquals(2,list.get(0).getVal());
        assertEquals(4,list.get(2).getVal());
    }

    @Test
    void get() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(2,list.get(1).getVal());
    }

    @Test
    void size() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }
}