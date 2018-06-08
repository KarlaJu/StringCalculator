class StringCalculator {
	int add(String numbers){	
		if(numbers==""){
			return 0
		}
		else{
      int number1=0, number2=0, sum=0
			if(numbers.size()>1){
				def twonumbers=numbers.split(",").collect{it as Integer}
				twonumbers.sum()
			}
			else {
				def number=numbers.toInteger()
				number
			}
		}
	}
}