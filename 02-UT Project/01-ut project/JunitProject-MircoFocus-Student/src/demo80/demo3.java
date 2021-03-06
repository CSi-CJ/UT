package demo80;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class demo3 {
	@Test
	void testString() {
		// 字符串断言
		assertThat("test")
				.as("字符串断言描述")
		        .isNotBlank() // 是否为" "字符串		
				.isSubstringOf("test1") // 是否为test1的一部分
				.isSameAs("test") // 对象内元素是否相等
				.isNotEmpty() // 是否为空字符串
				.isEqualTo("test") // 是否相等
				.isEqualToIgnoringCase("Test") // 是否相等（忽略大小写）
				.isExactlyInstanceOf(String.class) // 是否是实例
				.isIn(Arrays.asList("test", "hello")) // 是否在列表中
				.isIn("test", "hello") // 是否在参数列表中
				.isInstanceOfAny(String.class, Integer.class) // 是否是实例中任何一个
				.isNotNull() // 是否不为空
				.contains("es") // 是否包含es子串
				.startsWith("te") // te开始
				.endsWith("st") // st结束
				.matches(".e.t"); // 是否匹配 .e.t 格式
		assertThat("").isNullOrEmpty();
	}

	@Test
	void testInt() {
		// 数字断言
		assertThat(new Integer(100))
				.as("数字断言描述")
				.isEqualTo(100) // 是否相等
				.isBetween(0, 300) // 是否在0，300之间
				.isNotNull() // 是否非空
				.isNotZero() // 是否不等于0
				.isGreaterThanOrEqualTo(80) // 是否大约等于80
				.isLessThan(200) // 是否小于200
				.isPositive() // 是否是正数
				.isNotNegative() // 是否是非负数
				.isIn(Arrays.asList(100, 200)) // 是否在列表中
				.isInstanceOf(Integer.class); // 是否是Integer类型
	}

	@Test
	void testDate() {
		// 日期断言
		assertThat(new Date())
				.as("日期断言描述")
				.isAfter("2018-08-01")
				.isAfterYear(2017)
				.isBetween("2018-01-01", "2018-08-31")
				.isEqualToIgnoringHours(new Date().toLocaleString())
				.isExactlyInstanceOf(Date.class)
				.isInSameHourAs(new Date())
				.isInThePast()
				.isToday();
	}

	@Test
	void testList() {
		// 列表断言
		assertThat(Arrays.asList("world", "hello"))
			.as("列表断言描述")
			.isNotEmpty()
			.isNotNull()
			.isInstanceOf(List.class)
			.isSubsetOf("hello", "world")
			.contains("hello")
			.containsOnlyOnce("world")
			.startsWith("world")
			.endsWith("hello");
	}
	@Test
	void testMap() {
		// 字典断言
				Map foo = new HashMap();
				foo.put("A", 1);
				foo.put("B", 2);
				foo.put("C", 3);
				
				assertThat(foo)
						.as("字典断言描述")
						.isNotNull() // 是否不为空
						.isNotEmpty() // 是否size为0
						.hasSize(3) // size是否为3
						.containsKeys("A") // 是否包含key
						.containsValue(1); // 是否包含value
	}
	@Test
	void testObject() {
		// 对象断言
				User user1 = new User();
				user1.setName("Tom");
				user1.setAge(12);
				
				User user2 = new User();
				user2.setName("Tom");
				user2.setAge(12);
				
				User user3 = user1;
					
				assertThat(user1)
						.as("对象断言描述")
						.isEqualToComparingFieldByField(user2) //user1的每个字段是否与user2相同
						.isExactlyInstanceOf(User.class) //user1是否是User类的对象
						.isSameAs(user3) //是否是同一个对象
						.isNotNull() //是否非空
						.hasFieldOrProperty("name") //是否含有name字段
						.hasFieldOrPropertyWithValue("age", 12); //是否含有age字段，且值为12
	}
}
