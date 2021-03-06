package demo25;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;



public class QueryStringTestCase {
	@Test
	public void testOneNameValuePair() {
		QueryString query = new QueryString("name=value");
		assertEquals(1, query.count());
		assertEquals ("value",query.valueFor("name"));
	}
	@Test
	public void testMultipleNameValuePairs(){
		QueryString query =new QueryString("name1=value1&name2=value2&name3=value3");
		assertEquals(3, query.count());
		assertEquals ("value1",   query.valueFor( "name1"));
		assertEquals ("value2",   query.valueFor( "name2"));
		assertEquals ("value3",   query.valueFor( "name3"));

	}
	
	@Test
	public void testNoNameValuePairs() {
		QueryString query = new QueryString("");
		assertEquals(0, query.count());
	}
	
	@Test(expected = RuntimeException.class) 
	public void testNoNameForException() {
		QueryString query = new QueryString("name=value");		
		assertEquals ("value",query.valueFor("name2"));
	}
	
	@Test
	public void testNull() {
		try {
			QueryString query = new QueryString(null);
			fail("Should throw exception");
		}catch (NullPointerException e) {

		}
	}
}
