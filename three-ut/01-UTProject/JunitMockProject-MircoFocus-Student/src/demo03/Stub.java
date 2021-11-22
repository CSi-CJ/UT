package demo03;

public class Stub implements IExtensionManager {
	private boolean isBoolean;

	public Stub(boolean isBoolean) {
		this.isBoolean = isBoolean;
	}

	@Override
	public boolean IsSupportedExtension(String fileName) {
		return isBoolean;
	}
}
