package demo03;

public class Stub implements IExtensionManager {

	@Override
	public boolean IsSupportedExtension(String fileName) {
		return false;
	}
}
