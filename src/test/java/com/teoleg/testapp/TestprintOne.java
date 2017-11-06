package com.teoleg.testapp;

import junit.framework.Assert;
import org.junit.Test;

public class TestprintOne {

	@Test
	public void testPrintHelloWorld() {
		
		testapp App = new testapp();

		Assert.assertEquals(App.printOne(), "0");

	}

}

