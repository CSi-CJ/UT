package demo20;

public class LogAnalyzer {
	
	public boolean isValidLogFileName(String fileName){
		if(fileName==null ){
			throw  new IllegalArgumentException("�ļ�������Ϊnull ��");
		}     
	        
		if(fileName.trim().length()==0){ 
			throw  new IllegalArgumentException("�ļ�������Ϊ�ո�");
		}
		if(!fileName.toLowerCase().endsWith("log")){
			return false;   
		}     
		//�ļ����Ƴ��Ȳ���С��6, .log��β
		if(fileName.length()<10){
			return false;
		}
		if(fileName.length()>=24){
			return false;
		}		  
		return true;		  
	}	
}