class StringCalculator {
	int add(String numbers){
		if(verifyTheStringIsEmpty(numbers)) 0
		else 
      verifyIfTheStringHasNegativeNumbers(numbers) ? 0 : doTheStringCalculator(numbers)
  }

  private verifyTheStringIsEmpty(String numbers){
    numbers=="" || numbers == null
  }

  private verifyIfTheStringHasNegativeNumbers(String numbers){
    if(numbers.contains("-"))
    {
      def negativeNumbers=""
      def numberList=numbers.split(",")*.toInteger()
      numberList.each{i->  i<0 ? negativeNumbers=negativeNumbers+" "+i : 0}
      throw new RuntimeException("negatives not allowed"+negativeNumbers)
    }
  }
  
  private String replaceOtherDelimiterForCommas(String numbers){
  	String delimiter="\\"+numbers[2].toString()
		numbers.substring(4).replaceAll(delimiter,",")
  }

  private String identifyDelimither(String numbers){
    numbers.contains("/") ? replaceOtherDelimiterForCommas(numbers) : numbers.replaceAll("\n",",")
  }
  
  private Integer doTheStringCalculator(String numbers){
    identifyDelimither(numbers).split(",")*.toInteger().sum()
  }
}