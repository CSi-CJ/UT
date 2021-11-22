package demo81;

public class SensorStub implements ISensor {
	
	public double fakeValue = 10;
	
	@Override
	public double popNextPressurePsiValue() {
		return fakeValue;
	}

}
