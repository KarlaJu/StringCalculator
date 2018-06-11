class StringCalculator {
	int add(String getnumbers){
		if(!getnumbers) 0
		else{
      getnumbers.size()? getnumbers.replaceAll("\n",",").split(",")*.toInteger().sum() : getnumbers.toInteger()
    }
  }
}
