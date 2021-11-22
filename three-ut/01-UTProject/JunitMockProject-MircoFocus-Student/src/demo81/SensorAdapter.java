package demo81;

public class SensorAdapter implements ISensor {
	
	Sensor sensor = new Sensor();

	public double popNextPressurePsiValue() {
		return sensor.popNextPressurePsiValue();
	}
}
