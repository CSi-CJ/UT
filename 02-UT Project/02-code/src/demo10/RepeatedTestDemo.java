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


	
	@DisplayName("�ظ�����")
	@RepeatedTest(value = 3)
	public void i_am_a_repeated_test() {
	    System.out.println("ִ�в���");
	}
	
	@DisplayName("�Զ��������ظ�����")
	@RepeatedTest(value = 3, name = "{displayName} �� {currentRepetition} ��")
	public void i_am_a_repeated_test_2() {
	    System.out.println("ִ�в���");
	}
}
