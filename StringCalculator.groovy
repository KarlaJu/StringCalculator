class StringCalculator {
	int add(String numbers){
		if(verifyTheStringIsEmpty(numbers)) 0
		else doTheStringCalculator(numbers)
  }

  private verifyTheStringIsEmpty(String numbers){
    numbers=="" || numbers == null
  }

  private String stringWithoutBreakLines(String numbers){
    numbers.replaceAll("\n",",")
  }

  private Integer doTheStringCalculator(String numbers){
    stringWithoutBreakLines(numbers).split(",")*.toInteger().sum()
  }
}