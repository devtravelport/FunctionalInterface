package com.lambda.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class optionalBasics {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("baledung");
		opt.ifPresent(name -> System.out.println(name));
		optionalBasics optBasics = new optionalBasics();
		optBasics.whenOrElseGetAndOrElseDiffer_thenCorrect();

	}
	
	public  String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}

	public  void whenOrElseGetAndOrElseDiffer_thenCorrect() {
	    String text = "Text present";
	 
	    System.out.println("Using orElseGet:");
	    String defaultText 
	      = Optional.ofNullable(text).orElseGet(this::getMyDefault);
	   System.out.println(defaultText);
	 
	    System.out.println("Using orElse:");
	    /**
	     * In this case even though text has value orElse is going inside 
	     * getMyDefault() method and running it when its not required
	     * In case getMyDefault is some database operation or some other
	     * microservice call this is expensive
	     */
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    System.out.println("defaultText now is" + defaultText);
	    
	}
	
	public boolean priceIsInRange2(Modem modem2) {
	     return Optional.ofNullable(modem2)
	       .map(Modem::getPrice) //double : operator - notice that; map transforms getPrice 
	       .filter(p -> p >= 10)
	       .filter(p -> p <= 15)
	       .isPresent();
	 }
	
	public void givenOptional_whenMapWorks_thenCorrect() {
	    List<String> companyNames = Arrays.asList(
	      "paypal", "oracle", "", "microsoft", "", "apple");
	    Optional<List<String>> listOptional = Optional.of(companyNames);
	 
	    int size = listOptional
	      .map(List::size) //transforms this to size of list than checks on it
	      .orElse(0);
	    
	}
	
	Map<String, Integer> nameMap = new HashMap<>();
	/**
	 * If the specified key is not already associated with a value 
	 * (or is mappedto null), attempts to compute 
	 * its value using the given mappingfunction and enters it into this map unless null. 

		If the function returns null no mapping is recorded. 
		Ifthe function itself throws an (unchecked) exception, 
		theexception is rethrown, and no mapping is recorded. 
		The mostcommon usage is to construct a new object serving 
		as an initialmapped value or memoized result, as in: 

	 */
	//Integer value = nameMap.computeIfAbsent(key, mappingFunction) //mappingFunction is to calculte value of given key
	Integer value = nameMap.computeIfAbsent("John", s -> s.length());

	//OR
	//
	//Integer value = nameMap.computeIfAbsent("John", String::length); notice we replaced lambda with double operator
}
