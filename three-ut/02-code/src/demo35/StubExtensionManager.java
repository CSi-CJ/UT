package demo35;

public class StubExtensionManager implements IExtensionManager {

	public boolean shouldExtensionBeValid=true;
	  
	@Override  
	public boolean IsSupportedExtension(String fileName) {
		 		 
		return shouldExtensionBeValid;
	}
    
}
 