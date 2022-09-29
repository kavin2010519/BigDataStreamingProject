package com.stream.generate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomDataGenUtility {
	public static double randomBetween(int min, int max) {
		return Math.random() * (max - min) + min;
	}

	public static int randomIntBetween(int min, int max) {
		return (int)(Math.random() * (max - min) + min);
	}
}
