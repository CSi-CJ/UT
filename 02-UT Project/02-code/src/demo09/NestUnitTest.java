package demo09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
class NestUnitTest {
	@BeforeAll
    static void setUpClass() {
        System.out.println("@BeforeAll method");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("@AfterAll method");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach method");
    }
    
	@Test
	void test() {
		 System.out.println("��������ִ�в���");		
	}
 
    @Nested
    @DisplayName("��һ����Ƕ������")
    class FirstNestTest {
        @Test
        void test() {
            System.out.println("��һ����Ƕ������ִ�в���");
        }
    }
 
    @Nested
    @DisplayName("�ڶ�����Ƕ������")
    class SecondNestTest {
        @Test
        void test() {
            System.out.println("�ڶ�����Ƕ������ִ�в���");
        }
    }
}
