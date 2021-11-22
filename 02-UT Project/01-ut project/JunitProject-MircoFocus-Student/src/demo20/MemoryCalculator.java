package demo20;

public class MemoryCalculator {
	 private int sum=0;

     public void add(int number)
     {
       // 没有返回值，保存状态
         sum+=number;  
     }  
           
     public int sum()
     {
         int temp = sum;
         sum = 0;
         return temp;
     }  
    
     public void subtraction(int number){
    	 sum-=number;
 	}	
     
     
 	public void multiply2(){
 		sum=2*sum;
 	}
     
}
