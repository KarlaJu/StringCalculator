class StringCalculator {
	int add(String getnumbers){
		if(!getnumbers) 0
		else{
      if(getnumbers.size()){ 
        getnumbers.replaceAll("\n",",").split(",").collect{it as Integer}.sum()
      }
      else {
        getnumbers.toInteger()
      }
    }
  }
}
