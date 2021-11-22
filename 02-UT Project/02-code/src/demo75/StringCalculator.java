package demo75;

public class StringCalculator {
	public static int add(String numbers){
		int sum=0;
		if(numbers==null){  
			return 0;
		} 		    
		if(numbers.trim().equals("")){ 
			return 0;	
		}             		        
		String splitNumbers[]=numbers.split(",");
		for(String number:splitNumbers){
			int num=0;				
			try { 
				num = Integer.parseInt(number);
			} catch (Exception e) {
				throw new IllegalArgumentException("参数不能含有非法数字!  非法数字是"+number);			
			}	  	
			if(num<=0)
				throw new IllegalArgumentException("参数不能为负数!  负数是"+num);			
			if(num>1000)
				num=0; 
			sum+=num;			
		}
		return sum;		
	} 
	
}
