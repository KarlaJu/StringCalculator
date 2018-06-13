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

  void testAnyNumbers(){
    StringCalculator stringCalculator = new StringCalculator()
    int result = stringCalculator.add("1,2,3")
    assert result == 6
    result = stringCalculator.add("3,4,5,6,7,8")
    assert result == 33
    result = stringCalculator.add("1,1,1,1,1,1,1,1,1,1,1,1,1,1")
    assert result == 14
  }

  void testAnyNumbersWithNewLinesBetweenThem(){
    StringCalculator stringCalculator = new StringCalculator()
    int result = stringCalculator.add("1,2\n3")
    assert result == 6
    result = stringCalculator.add("3\n4,5\n6,7\n8")
    assert result == 33
    result = stringCalculator.add("1\n1\n1\n1\n1,1,1,1,1,1\n1,1\n1,1")
    assert result == 14
  }


  void testAnyNumbersWithOtherDelimiters(){
    StringCalculator stringCalculator = new StringCalculator()
    int result = stringCalculator.add("//;\n1;2;3")
    assert result == 6
    result = stringCalculator.add("//#\n3#4#5#6#7#8")
    assert result == 33
    result = stringCalculator.add("//|\n1|1|1|1|1|1|1|1|1|1|1|1|1|1")
    assert result == 14
  }

  void testNegativeNumbersInString(){
    StringCalculator stringCalculator = new StringCalculator()
    String message = shouldFail {
      stringCalculator.add("1,2,3,-4,5,6")  
    }
    assert message == "negatives not allowed -4"

    message = shouldFail {
      stringCalculator.add("1,-2,3,-4,5,-6")  
    }
    assert message == "negatives not allowed -2 -4 -6"
  }

}
