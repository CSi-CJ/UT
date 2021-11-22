package demo09;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.jupiter.api.*;

@DisplayName("Nested tests for HashMap")
public class MapNestedTest {
 Map<String, Object> map;
 
 @Nested
 @DisplayName("when a new")
 class WhenNew {
    @BeforeEach
    void create() {
       map = new HashMap<>();
    }
 
    @Test
    @DisplayName("is empty")
    void isEmpty() {
       assertTrue(map.isEmpty());
    }
 
    @Nested
    @DisplayName("after adding a new entry")
    class AfterAdd {
       String key = "key";
       Object value = "value";
 
       @BeforeEach
       void add() {
          map.put(key, value);
       }
 
       @Test
       @DisplayName("is not empty")
       void isNotEmpty() {
          assertFalse(map.isEmpty());
       }
 
       @Test
       @DisplayName("returns value when getting by key")
       void returnValueWhenGettingByKey() {
          assertEquals(value, map.get(key));
       }
 
       @Nested
       @DisplayName("after removing the entry")
       class AfterRemove {
          @BeforeEach
          void remove() {
             map.remove(key);
          }
 
          @Test
          @DisplayName("is empty now")
          void isEmpty() {
             assertTrue(map.isEmpty());
          }
 
          @Test
          @DisplayName("returns null when getting by key")
          void returnNullForKey() {
             assertNull(map.get(key));
          }
       }
    }
 }
}