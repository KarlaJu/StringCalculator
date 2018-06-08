class StringCalculatorTest extends GroovyTestCase {

	void testEmptyString(){
    StringCalculator stringCalculator = new StringCalculator()
		int result = stringCalculator.add("")
    assert result == 0
	}

  void testOneNumber(){
    StringCalculator stringCalculator = new StringCalculator()
    int result = stringCalculator.add("1")
    assert result == 1 
    result = stringCalculator.add("3")
    assert result == 3
    result = stringCalculator.add("7")
    assert result == 7
  }

  void testTwoNumbers(){
    StringCalculator stringCalculator = new StringCalculator()
    int result = stringCalculator.add("1,2")
    assert result == 3
    result = stringCalculator.add("3,4")
    assert result == 7
    result = stringCalculator.add("7,8")
    assert result == 15
  }
}