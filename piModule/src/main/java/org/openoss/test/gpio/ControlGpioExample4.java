package org.openoss.test.gpio;

// START SNIPPET: control-gpio-snippet

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Java Examples
 * FILENAME      :  ControlGpioExample.java  
 * 
 * This file is part of the Pi4J project. More information about 
 * this project can be found here:  http://www.pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2016 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 * This example code demonstrates how to perform simple state control of a GPIO
 * pin on the Raspberry Pi.
 * 
 * @author Robert Savage
 */
public class ControlGpioExample4 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("<--Pi4J--> GPIO Control Example ... started.");

		// create gpio controller
		final GpioController gpio = GpioFactory.getInstance();

		GpioPinDigitalOutput[] pins = new GpioPinDigitalOutput[30];

		final GpioPinDigitalOutput pin00 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_00, "MyLED00", PinState.LOW);
		pins[0] = pin00;

		final GpioPinDigitalOutput pin01 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_01, "MyLED01", PinState.LOW);
		pins[1] = pin01;

		final GpioPinDigitalOutput pin02 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_02, "MyLED02", PinState.LOW);
		pins[2] = pin02;

		final GpioPinDigitalOutput pin03 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_03, "MyLED03", PinState.LOW);
		pins[3] = pin03;

		final GpioPinDigitalOutput pin04 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_04, "MyLED04", PinState.LOW);
		pins[4] = pin04;

		final GpioPinDigitalOutput pin05 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_05, "MyLED05", PinState.LOW);
		pins[5] = pin05;

		final GpioPinDigitalOutput pin06 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_06, "MyLED06", PinState.LOW);
		pins[6] = pin06;

		final GpioPinDigitalOutput pin07 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_07, "MyLED07", PinState.LOW);
		pins[7] = pin07;

		final GpioPinDigitalOutput pin08 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_08, "MyLED08", PinState.LOW);
		pins[8] = pin08;

		final GpioPinDigitalOutput pin09 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_09, "MyLED09", PinState.LOW);
		pins[9] = pin09;

		final GpioPinDigitalOutput pin10 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_10, "MyLED10", PinState.LOW);
		pins[10] = pin10;

		final GpioPinDigitalOutput pin11 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_11, "MyLED11", PinState.LOW);
		pins[11] = pin11;

		final GpioPinDigitalOutput pin12 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_12, "MyLED12", PinState.LOW);
		pins[12] = pin12;

		final GpioPinDigitalOutput pin13 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_13, "MyLED13", PinState.LOW);
		pins[13] = pin13;

		final GpioPinDigitalOutput pin14 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_14, "MyLED14", PinState.LOW);
		pins[14] = pin14;

		final GpioPinDigitalOutput pin15 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_15, "MyLED15", PinState.LOW);
		pins[15] = pin15;

		final GpioPinDigitalOutput pin16 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_16, "MyLED16", PinState.LOW);
		pins[16] = pin16;

		final GpioPinDigitalOutput pin17 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_17, "MyLED17", PinState.LOW);
		pins[17] = pin17;

		final GpioPinDigitalOutput pin18 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_18, "MyLED18", PinState.LOW);
		pins[18] = pin18;

		final GpioPinDigitalOutput pin19 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_19, "MyLED19", PinState.LOW);
		pins[19] = pin19;

		final GpioPinDigitalOutput pin20 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_20, "MyLED20", PinState.LOW);
		pins[20] = pin20;

		final GpioPinDigitalOutput pin21 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_21, "MyLED21", PinState.LOW);
		pins[21] = pin21;

		final GpioPinDigitalOutput pin22 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_22, "MyLED22", PinState.LOW);
		pins[22] = pin22;

		final GpioPinDigitalOutput pin23 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_23, "MyLED23", PinState.LOW);
		pins[23] = pin23;

		final GpioPinDigitalOutput pin24 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_24, "MyLED24", PinState.LOW);
		pins[24] = pin24;

		final GpioPinDigitalOutput pin25 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_25, "MyLED25", PinState.LOW);
		pins[25] = pin25;

		final GpioPinDigitalOutput pin26 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_26, "MyLED26", PinState.LOW);
		pins[26] = pin26;

		final GpioPinDigitalOutput pin27 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_27, "MyLED27", PinState.LOW);
		pins[27] = pin27;

		final GpioPinDigitalOutput pin28 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_28, "MyLED28", PinState.LOW);
		pins[28] = pin28;

		final GpioPinDigitalOutput pin29 = gpio.provisionDigitalOutputPin(
				RaspiPin.GPIO_29, "MyLED29", PinState.LOW);
		pins[29] = pin29;
		
		for (int pinno = 0; pinno == 29; pinno++) {
			// set shutdown state for this pin
			pins[pinno].setShutdownOptions(true, PinState.LOW);
		}


		for (int pinno = 0; pinno == 29; pinno++) {
			System.out
					.println("--> GPIO state pin " + pinno + " should be: ON");
			pins[pinno].high();
			Thread.sleep(5000);
			pins[pinno].low();
			System.out.println("--> GPIO state pin " + pinno
					+ " should be: OFF");
		}

		// stop all GPIO activity/threads by shutting down the GPIO controller
		// (this method will forcefully shutdown all GPIO monitoring threads and
		// scheduled tasks)
		gpio.shutdown();
	}
}
// END SNIPPET: control-gpio-snippet
