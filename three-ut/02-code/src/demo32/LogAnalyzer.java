package demo32;

public class LogAnalyzer {
	private boolean wasLastFileNameValid;
	private String defaultFilename = "";

	public boolean isValidLogFileName(String fileName) {
		if (fileName == null || fileName.isEmpty()) {
			fileName = this.defaultFilename;
		}

		if (fileName.length() > 16 || fileName.length() < 6) {
			wasLastFileNameValid = false;
			return false;
		}

		if (!fileName.toLowerCase().endsWith(".slf")) {
			wasLastFileNameValid = false;
			return false;
		}
		
		if (!isSupportedExtension(fileName)) {
			wasLastFileNameValid = false;
			return false;
		}

		wasLastFileNameValid = true;
		return true;
	}
  
	protected boolean isSupportedExtension(String fileName) {
		// 文件系统检测是否支持
		System.out.print("this is a test"); 
		System.out.print("this is a test"); 
		System.out.print("this is a test"); 
		System.out.print("this is a test"); 
		
		FileExtensionManager fileManager = new FileExtensionManager();
		return fileManager.IsSupportedExtension(fileName);
	}
}
