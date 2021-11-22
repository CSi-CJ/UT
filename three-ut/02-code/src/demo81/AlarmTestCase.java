package demo81;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import demo81.Alarm;
import demo81.ISensor;
import demo81.SensorStub;

public class AlarmTestCase {
	SensorStub sensorstub = null;
	
	@Before
	public void setUp(){
		sensorstub = new SensorStub();
	}
	
	@Test
	public final void a_normal_pressure_value_should_not_raise_the_alarm() {
		  sensorstub.fakeValue = Alarm.LowPressureThreshold + 1;
		  Alarm target = new Alarm(sensorstub);
		  
          target.check();
          assertFalse(target.isAlarmOn());          
	}

	@Test
	public final void a_pressure_value_out_of_range_should_raise_the_alarm() {
		sensorstub.fakeValue = Alarm.LowPressureThreshold - 1;
		
		Alarm target = new Alarm(sensorstub);
		
        target.check();
        assertTrue(target.isAlarmOn());
	}

	@Test
	public final void a_normal_pressure_value_after_an_out_of_range_pressure_value_should_keep_the_alarm_on() {
		sensorstub.fakeValue = Alarm.HighPressureThreshold + 1;
		
		Alarm target = new Alarm(sensorstub);
		
        target.check();
        assertTrue(target.isAlarmOn());
	}
	
}
