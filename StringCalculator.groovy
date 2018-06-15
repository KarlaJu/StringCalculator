class StringCalculator {
	int add(String numbers){
		if(verifyTheStringIsEmpty(numbers)) 0
		else {
      verifyIfTheStringHasNegativeNumbers(numbers)
      doTheStringCalculator(numbers)
    }

  }
  
  private Boolean verifyTheStringIsEmpty(String numbers){
    numbers=="" || numbers == null
  }

  private void verifyIfTheStringHasNegativeNumbers(String numbers){
    if(numbers.contains("-"))
      throw new RuntimeException("negatives not allowed ${findNegativeNumbers(numbers).join(' ')}")
  }

  private List findNegativeNumbers(String numbers){
    numbers.split(",")*.toInteger().findAll{i->  i<0 }
  }

  private def devuelve(String numbers){
    String delimiter="\\"+numbers.substring(2, numbers.indexOf("\n"))
    quitBreakLines(numbers).substring(4).replaceAll("#",",").split(",")*.toInteger().sum()
  }
  
  private String quitBreakLines(String numbers){
    numbers.replaceAll("\n",",")
  }
  
  private Integer doTheStringCalculator(String numbers){
    ArrayList numberList=[]
    String delimiter="\\"+numbers.substring(2, numbers.indexOf("\n"))
    quitBreakLines(numbers).each{it.isInteger() ? numberList<<it.toInteger() : 0}
    numberList.sum()
  }
}