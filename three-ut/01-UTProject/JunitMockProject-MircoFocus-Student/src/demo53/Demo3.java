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
        // mock creation ����mock���� 
        List mockedList = mock(List.class);

        //using mock object ʹ��mock���� 
       mockedList.add("one");
        mockedList.clear(); 

       //verification ��֤ 
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

    	 // �����������֤����Ч��һ��,��ΪverifyĬ����֤�ľ���times(1)
    	 verify(mockedList).add("once");
    	 verify(mockedList, times(1)).add("once");

    	 // ��֤�����ִ�д���
    	 verify(mockedList, times(2)).add("twice");
    	 verify(mockedList, times(3)).add("three times");

    	 // ʹ��never()������֤,never�൱��times(0)
    	 verify(mockedList, never()).add("never happened");

    	 // ʹ��atLeast()/atMost()
    	 verify(mockedList, atLeastOnce()).add("three times");
    	 verify(mockedList, atLeast(2)).add("five times");
    	 verify(mockedList, atMost(5)).add("three times");
    }  
    
}
