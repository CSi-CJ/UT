package demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayAPITest {

  @Test
  public void testEmptyCollection() {
    List collection = new ArrayList();

    assertTrue(collection.isEmpty());

    collection.add("A");
    assertFalse(collection.isEmpty());

    collection.remove("A");
    assertTrue(collection.isEmpty());
  }

  @Test
  public void testCollectionSize() {
    List collection = new ArrayList();
    assertEquals(0, collection.size());

    collection.add("A");
    assertFalse(collection.size() == 0);

    collection.remove("A");
    assertTrue(collection.size() == 0);


  }

  @Test
  public void testCollectionOrdering() {
    List collection = new ArrayList();

    collection.add("A");
    collection.add("B");
    collection.add("C");


//	       collection.get(0)

    assertEquals("A", collection.get(0));
    assertEquals("B", collection.get(1));
    assertEquals("C", collection.get(2));

    String[] array = {"A", "B", "C"};
    assertArrayEquals(array,collection.toArray());

  }

  @Test
  public void testCollectionSame() {
    List collection = new ArrayList();

    String a = "A";
    String b = "B";
    collection.add("A");
    collection.add("B");

    assertEquals(a.hashCode(), collection.get(0).hashCode());
    assertEquals(b.hashCode(), collection.get(1).hashCode());

  }

  @Test
  public void testCollectionContains() {


  }

  @Test
  public void testCollectionNew() {


  }
}
