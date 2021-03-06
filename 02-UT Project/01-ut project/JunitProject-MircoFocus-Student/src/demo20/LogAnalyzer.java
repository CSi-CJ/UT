package demo20;

public class LogAnalyzer {
	
	public boolean isValidLogFileName(String fileName){
		if(fileName==null ){
			throw  new IllegalArgumentException("文件名不能为null ！");
		}     
	        
		if(fileName.trim().length()==0){ 
			throw  new IllegalArgumentException("文件名不能为空格！");
		}
		if(!fileName.toLowerCase().endsWith("log")){
			return false;   
		}     
		//文件名称长度不能小于6, .log结尾
		if(fileName.length()<10){
			return false;
		}
		if(fileName.length()>=24){
			return false;
		}		  
		return true;		  
	}	
}