class StringCalculator {
	int add(String getnumbers){
		if(!getnumbers) 0
		else{
      if(getnumbers.size()){ 
        getnumbers.replaceAll("\n",",").split(",")*.toInteger().sum()
      }
      else {
        getnumbers.toInteger()
      }
    }
  }
}
