package demo05;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.Test;

//Assume�ṩ����֤���������� assumeTrue/assumeFalse��
//assumeNotNull�� assumeThat�� 
//assumeNoException �����庬�嶼�Ƚϼ򵥡�
public class AssumptionsDemo1 {
	 @Test
	    void testAssumTrue() {
	        System.out.println("testAssumTrue  ******** ");
	        //assumeTrue����䲢����Ӱ����ǰ������ִ��
	        //���Խ�3>5�ĳ�3<5���в��Գɹ���Ч��
	        assumeTrue(3>5);
	        //�÷������������еĴ����Ϊ��������������������ִ��
	        // ����������費������������ִ�и�������Ĵ��룬������
	        System.out.println(" void testAssumTrue()  assume is true!");
	    }

	    @Test
	    void testAssumTrueMessage() {
	        assumeTrue(3>5,
	                //�ڶ�������Ϊ����һ������������ʱ��������Զ��������Ϣ
	                () -> "Aborting test: not on developer workstation");
	        //����Ĵ����Ϊ��������������������ִ��
	        System.out.println(" testAssumTrueMessage()  assume is true!");
	    }
	    
	    @Test
	    void testAssumeTrueLambda(){
	        //��������ĵ�һ������Ϊ����ʽ�ӿڣ�ͨ������Դ����Է����޲���������ֵΪboolean
	        assumeTrue(()->{
	            System.out.println(" testAssumeTrueLambda() in assumeTrue");
//	            boolean flag = true;
	            boolean flag = false;
	            return flag;
	        });
	        System.out.println("testAssumeTrueLambda()  out assumeTrue");
	    }

	    @Test
	    void testAssumFalse(){
	        //ͬassumTrueЧ���෴
	        assumeFalse(3>5);
	        System.out.println("testAssumFalse()  assume is true!");
	    }

	    @Test
	    void testAssumFalseMessage(){
	        //ͬassumTrueЧ���෴
	        assumeFalse(3<5,
	                () -> "Aborting test: not on developer workstation");
	        System.out.println("testAssumFalseMessage()  assume is true!");
	    }

	    @Test
	    void testAssumThat() {
	        assumingThat(3>5,
	                () -> {
	                    //������������ͬ���ǣ�����ǰ��������ʱ���Ż�ִ�����������䣡������
	                    // ��ֻ��Ӱ�쵽��lambda���ʽ�еĴ���
	                    assertEquals(2, 2);
	                });
	        //�˴��Ķ��Բ�������assumingThat���ƣ�����������¶���ִ��
	        System.out.println("testAssumThat()   no effect");
	        assertEquals("a string", "a string");
	    }
}
