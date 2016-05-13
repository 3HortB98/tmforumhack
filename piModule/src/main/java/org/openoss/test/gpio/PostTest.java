package org.openoss.test.gpio;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostTest {

	String dataString=" ";
	
	@Test
	public void test() {
		PosterClass  posterClass = new PosterClass();
		posterClass.postData(dataString);
		
	}

}
