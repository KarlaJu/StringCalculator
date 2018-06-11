class StringCalculator {
	int add(String getnumbers){
		if(!getnumbers) 0
		else{
      if(getnumbers.size()){ 
        def oneLineNumbers=getnumbers.replaceAll("\n",",")
        oneLineNumbers.split(",").collect{it as Integer}.sum()
      }
      else {
        getnumbers.toInteger()
      }
    }
  }

}
