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
  
  private String replaceOtherDelimiterForCommas(String numbers){
  	String delimiter="\\"+numbers.charAt(2).toString()
		numbers.substring(4).replaceAll(delimiter,",")
  }

  private String verifyIfTheStringHasOtherDelimither(String numbers){
    numbers.contains("/") ? replaceOtherDelimiterForCommas(numbers) : stringWithoutBreakLines(numbers)
  }
  
  private Integer doTheStringCalculator(String numbers){
    verifyIfTheStringHasOtherDelimither(numbers).split(",")*.toInteger().sum()
  }
}
