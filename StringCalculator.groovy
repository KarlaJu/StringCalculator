class StringCalculator {
	int add(String getnumbers){
		if(!getnumbers){
			return 0
		}
		else{
      if(getnumbers.size()){ 
        def oneLineNumbers=getnumbers.replaceAll("\n",",")
        def numbersWithoutCommas=oneLineNumbers.split(",").collect{it as Integer}
        numbersWithoutCommas.sum()
      }
      else {
        getnumbers.toInteger()
      }
    }
  }

}
