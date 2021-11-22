package demo05;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.Test;

//Assume提供的验证方法包括： assumeTrue/assumeFalse、
//assumeNotNull、 assumeThat、 
//assumeNoException 。具体含义都比较简单。
public class AssumptionsDemo1 {
	 @Test
	    void testAssumTrue() {
	        System.out.println("testAssumTrue  ******** ");
	        //assumeTrue该语句并不会影响其前面的语句执行
	        //可以将3>5改成3<5自行测试成功的效果
	        assumeTrue(3>5);
	        //该方法中下面所有的代码变为在上面假设的条件成立后执行
	        // 如果上述假设不成立，则会忽略执行该行下面的代码，并报错
	        System.out.println(" void testAssumTrue()  assume is true!");
	    }

	    @Test
	    void testAssumTrueMessage() {
	        assumeTrue(3>5,
	                //第二个参数为当第一个参数不成立时，输出的自定义错误信息
	                () -> "Aborting test: not on developer workstation");
	        //下面的代码变为在上面假设的条件成立后执行
	        System.out.println(" testAssumTrueMessage()  assume is true!");
	    }
	    
	    @Test
	    void testAssumeTrueLambda(){
	        //这个方法的第一个参数为函数式接口，通过看起源码可以发现无参数，返回值为boolean
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
	        //同assumTrue效果相反
	        assumeFalse(3>5);
	        System.out.println("testAssumFalse()  assume is true!");
	    }

	    @Test
	    void testAssumFalseMessage(){
	        //同assumTrue效果相反
	        assumeFalse(3<5,
	                () -> "Aborting test: not on developer workstation");
	        System.out.println("testAssumFalseMessage()  assume is true!");
	    }

	    @Test
	    void testAssumThat() {
	        assumingThat(3>5,
	                () -> {
	                    //与上述方法不同的是，仅当前面假设成立时，才会执行这里面的语句！！！！
	                    // 且只会影响到该lambda表达式中的代码
	                    assertEquals(2, 2);
	                });
	        //此处的断言不受上述assumingThat限制，在所有情况下都会执行
	        System.out.println("testAssumThat()   no effect");
	        assertEquals("a string", "a string");
	    }
}
