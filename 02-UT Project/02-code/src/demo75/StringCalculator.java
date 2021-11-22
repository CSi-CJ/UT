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
				throw new IllegalArgumentException("�������ܺ��зǷ�����!  �Ƿ�������"+number);			
			}	  	
			if(num<=0)
				throw new IllegalArgumentException("��������Ϊ����!  ������"+num);			
			if(num>1000)
				num=0; 
			sum+=num;			
		}
		return sum;		
	} 
	
}
