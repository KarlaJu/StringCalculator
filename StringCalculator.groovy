class StringCalculator {
	int add(String getnumbers){
		if(!getnumbers){
			return 0
		}
		else{
      if(getnumbers.size()>1){ 
        def oneLineNumbers=getnumbers.replaceAll("\n",",")
        def numbersWithoutCommas=oneLineNumbers.split(",").collect{it as Integer}
        numbersWithoutCommas.sum()
      }
      else {
        def number=getnumbers.toInteger()
        number
      }
    }
  }

}
