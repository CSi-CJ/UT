package demo50;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class MyTestCase {
	@Test
	public void testStub()  {
	        //  create mock
	        MyInterface stub =new MyStub();

	         // use mock in test....
	        assertEquals(stub.getUniqueId(), 43);
	}
	@Test
	public void testMockitoStub()  {
	        //  create mock
	        MyInterface stub = Mockito.mock(MyInterface.class);

	        // define return value for method getUniqueId()
	        when(stub.getUniqueId()).thenReturn(43);

	        // use mock in test....
	        assertEquals(stub.getUniqueId(), 43);
	}
}
