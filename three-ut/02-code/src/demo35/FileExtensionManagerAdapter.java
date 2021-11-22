package demo35;

public class FileExtensionManagerAdapter implements IExtensionManager {

	FileExtensionManager fileManage=new FileExtensionManager(); 
	
	@Override  
	public boolean IsSupportedExtension(String fileName) {		 		
		return fileManage.IsSupportedExtension(fileName);
	}    
}
 