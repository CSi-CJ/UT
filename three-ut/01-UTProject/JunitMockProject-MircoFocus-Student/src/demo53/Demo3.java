package demo53;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class Demo3 {
	@Mock  
    private List mockedList;  
	
	public Demo3(){  
        MockitoAnnotations.initMocks(this);  
    }  
  
    @Test  
    public void shorthand(){  
        // mock creation 创建mock对象 
        List mockedList = mock(List.class);

        //using mock object 使用mock对象 
       mockedList.add("one");
        mockedList.clear(); 

       //verification 验证 
       verify(mockedList).add("one"); 
       verify(mockedList).clear();

    }  
    
    @Test  
    public void testVerify(){  
    	 mockedList.add("once");
    	 mockedList.add("twice");
    	 mockedList.add("twice");
    	 mockedList.add("three times");
    	 mockedList.add("three times");
    	 mockedList.add("three times");

    	 // 下面的两个验证函数效果一样,因为verify默认验证的就是times(1)
    	 verify(mockedList).add("once");
    	 verify(mockedList, times(1)).add("once");

    	 // 验证具体的执行次数
    	 verify(mockedList, times(2)).add("twice");
    	 verify(mockedList, times(3)).add("three times");

    	 // 使用never()进行验证,never相当于times(0)
    	 verify(mockedList, never()).add("never happened");

    	 // 使用atLeast()/atMost()
    	 verify(mockedList, atLeastOnce()).add("three times");
    	 verify(mockedList, atLeast(2)).add("five times");
    	 verify(mockedList, atMost(5)).add("three times");
    }  
    
}
