package com.nirmal.standaloneprograms.threadprograms;

public class Test {

    
    
    public static String adoptPriceFromDMS(String price) {
	    String result = Float.toString(Float.parseFloat(price) / 100);
	    return result;
	  }
    
    
    public static String adoptPriceFromUI(String price) {
	    String result = Integer.toString(Math.round((Float.parseFloat(price) * 100)));
	    return result;
	  }
    
    public static void main(String[] args) {
	System.out.println(Test.adoptPriceFromDMS("5555"));
	System.out.println(Test.adoptPriceFromUI("16.59"));

    }

}
