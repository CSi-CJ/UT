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
		 assertEquals(0,collection.size());
		
		 
    }	
	
	@Test
	   public void testCollectionOrdering() {
	       List collection = new ArrayList();

	       collection.add("A");
	       collection.add("B");
	       collection.add("C");
	       
	     
	       //collection.get(0)
	       
	}
	@Test
    public void testCollectionSame() {
		List collection = new ArrayList();

		  String a="A";
		  String b="B";
	       collection.add("A");
	       collection.add("B");
	       
    }	
	
	@Test
    public void testCollectionContains() {
		
		
    }
	@Test
    public void testCollectionNew() {
    
		
    }
}
