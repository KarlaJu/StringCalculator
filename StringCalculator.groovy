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

  private String verifyIfTheStringHasOtherDelimither(String numbers){
    if(stringWithoutBreakLines(numbers).contains("/")){
      String delimiter=numbers.charAt(2)
      numbers.replaceAll("$delimiter",",")
    }
    else stringWithoutBreakLines(numbers)
  }

  private Integer doTheStringCalculator(String numbers){
    stringWithoutBreakLines(numbers).split(",")*.toInteger().sum()
  }
}