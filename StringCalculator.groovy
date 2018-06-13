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
  
  private String quitBreakLines(String numbers){
    numbers.replaceAll("\n",",")
  }
  
  private Integer doTheStringCalculator(String numbers){
    ArrayList numberList=[]
    quitBreakLines(numbers).each{it.isInteger() ? numberList<<it.toInteger() : 0}
    numberList.sum()
  }
}