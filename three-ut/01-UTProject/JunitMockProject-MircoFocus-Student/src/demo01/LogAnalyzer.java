package demo01;

public class LogAnalyzer {
	private boolean wasLastFileNameValid;
	private String defaultFilename="";
	
	public boolean  isValidLogFileName(String fileName)
    {
		if(fileName==null || fileName.isEmpty()){
			fileName=this.defaultFilename;
		}
		
		if(fileName.length()>16 || fileName.length()<6){
			 wasLastFileNameValid=false;
	         return false;
		}
		
        if (!fileName.toLowerCase().endsWith(".slf"))  {
            wasLastFileNameValid=false;
            return false;
        }
        //�ļ�ϵͳ����Ƿ�֧��
//        FileExtensionManager fileManager=new FileExtensionManager();
      
//        if(!fileManager.IsSupportedExtension(fileName)){
        if(isSupportedExtension(fileName)){
        	 wasLastFileNameValid=false;
             return false;
        }        
        wasLastFileNameValid = true;
        return true;
    }

    protected boolean isSupportedExtension(String fileName){
      FileExtensionManager fileManager=new FileExtensionManager();
      return fileManager.IsSupportedExtension(fileName);
    }
}
