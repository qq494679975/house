package com.softxm.hs.Utils;

public class PrimaryKey {
	private static long key = System.currentTimeMillis();

	private PrimaryKey() {
	}

	public synchronized static long getKey() {
		return key++;
	}
}