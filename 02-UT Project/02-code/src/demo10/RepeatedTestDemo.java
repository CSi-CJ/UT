package demo10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestReporter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestReporter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedTestDemo {


	
	@DisplayName("重复测试")
	@RepeatedTest(value = 3)
	public void i_am_a_repeated_test() {
	    System.out.println("执行测试");
	}
	
	@DisplayName("自定义名称重复测试")
	@RepeatedTest(value = 3, name = "{displayName} 第 {currentRepetition} 次")
	public void i_am_a_repeated_test_2() {
	    System.out.println("执行测试");
	}
}
