package demo23;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListTest02 {
  public static List list;

  @Before
  public void before() {
    list = new List();
  }

  @After
  public void after() {
    list = null;
  }

  @Test
  public void testAdd_QualifiedObj_returnObj() {
    list.add("AAA");
    assertEquals(1, list.getSize());
    assertEquals("AAA", list.get(0));
  }


  @Test
  public void testAdd_AddNull_returnNull() {
    list.add(null);
    assertEquals(1, list.getSize());
    assertEquals(null, list.get(0));
  }

  @Test
  public void testAdd_doNothing_returnsEmpty() {
    assertTrue(list.isEmpty());
  }

  @Test
  public void testAdd_moreThanSize_xxx() {
    for (int i = 0; i < 10; i++) {
      list.add("CCC"+i);
    }
    assertEquals(10,list.getSize());
    assertEquals("CCC9",list.get(9));
  }

  @Test
  public void testAdd_moreThanSize_xx2() {
    for (int i = 0; i < 16; i++) {
      list.add("CCC"+i);
    }
    assertEquals(16,list.getSize());
    assertEquals("CCC9",list.get(9));
  }

  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void testAdd_moreThanSize_ArrayIndexOutOfBoundsException() {
    for (int i = 0; i < 16; i++) {
      list.add("CCC"+i);
    }
    assertEquals("数组索引越界", list.get(20));
  }

}
