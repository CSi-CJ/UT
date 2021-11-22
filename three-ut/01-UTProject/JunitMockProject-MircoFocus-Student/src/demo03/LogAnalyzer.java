package demo03;

public class LogAnalyzer {
	private boolean wasLastFileNameValid;
	private String defaultFilename="";
	private IExtensionManager manager;

  public void setManager(IExtensionManager manager) {
    this.manager = manager;
  }
  public LogAnalyzer(){
    this.manager = new FileExtensionManager();
  }

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
        //文件系统检测是否支持
//        FileExtensionManager fileManager=new FileExtensionManager();
      
        if(isSupportedExtension(fileName)){
        	 wasLastFileNameValid=false;
             return false;
        }        
        wasLastFileNameValid = true;
        return true;
    }
    protected boolean isSupportedExtension(String fileName){
       return manager.IsSupportedExtension(fileName);
    }
}
