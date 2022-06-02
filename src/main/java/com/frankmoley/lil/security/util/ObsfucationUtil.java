package com.frankmoley.lil.security.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;


public class ObsfucationUtil {
	
	public static String obsfucateData(String data) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedhash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
			return new String(Hex.encodeHex(encodedhash));
		}
		
		catch (Exception e) {
			return "";
		}
	}
	
	public static void main (String [] args) {
		String dev = "BennyIko";
		String dev2 = "Benny Iko";
		System.out.println(obsfucateData(dev));
		System.out.println(obsfucateData(dev));
		System.out.println(obsfucateData(dev2));
		System.out.println(obsfucateData(dev2));
	}
}
