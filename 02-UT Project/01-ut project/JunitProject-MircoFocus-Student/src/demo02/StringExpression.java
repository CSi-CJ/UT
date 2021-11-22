package demo02;

public class StringExpression {

  public int evaluate(String expression) {
    try {
      if (verifySpace(expression)) return 0;
      if (verifyIsNull(expression)) return 0;
    } catch (NullPointerException e) {
      return 0;
    }

    int sum = 0;
    String[] strings = getSplitStrings(expression);
    sum = getSum(sum, strings);
    return sum;
  }

  private boolean verifyIsNull(String expression) {
    if (expression.equals(null)) {
      throw new NullPointerException("ÄúµÄÊäÈëÎªnull");
    }
    return false;
  }

  private boolean verifySpace(String expression) {
    if (expression.isEmpty()) {
      return true;
    }
    return false;
  }

  private int getSum(int sum, String[] strings) {
    for (String string : strings) {
      Integer value;
      try {
        value = Integer.valueOf(string);
        value = revertOfOdd(value);
      } catch (NumberFormatException e) {
        return 0;
      }
      sum += value;
    }
    return sum;
  }

  private Integer revertOfOdd(Integer value) {
    if (value % 2 !=0){
      value = 0;
    }
    return value;
  }

  private String[] getSplitStrings(String expression) {
    return expression.split("\\+");
  }
	/*
	 * 	for (String summand : expression.split("\\+"))
			sum-= Integer.valueOf(summand);
	 */
}
