package demo33;

import java.util.Random;
  
public class FileExtensionManager implements IExtensionManager {
 
	@Override     
	public boolean IsSupportedExtension(String fileName)
    {
		try {
			//read some file here and determine if it is valid.
	        //ʵ�ֶ�I/O����Ƿ�֧��
			Thread.sleep(1000*5);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		//�������� ��Ϊ�����ⲿ��Դ�����¿�����ʱ��������
		Random Random=new Random();	
		if(Random.nextBoolean())
			return true;
		else
			return false;
    }
}