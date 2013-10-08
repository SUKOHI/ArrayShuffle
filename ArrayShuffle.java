package com.sukohi.lib;

/*  Dependency: RandomNumber.java  */

public class ArrayShuffle {

	public static <T> void shuffle(T[] array) {
		
		int arrayLength = array.length;
		
		for(int i = 0; i < arrayLength; i++) {
			
			int randomNumber = RandomNumber.getRandom(0, (arrayLength-1));
			T temporaryValue = array[randomNumber];
			array[randomNumber] = array[i];
			array[i] = temporaryValue;
			
		}
	
	}

}

/***Sample

	ArrayShuffle.shuffle(array);

***/