class StringCalculator {
	int add(String numbers){
		
		if(numbers==""){
			return 0
		}
		else{
			def number=numbers.toInteger()
			return number
		}
	}
}