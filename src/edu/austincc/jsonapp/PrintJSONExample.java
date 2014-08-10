package edu.austincc.jsonapp;

import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PrintJSONExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("hello", "world");
		obj.put("count", 42);
		
		JSONArray numbers = new JSONArray();
		numbers.addAll(Arrays.asList(1,2,3));
		obj.put("digits", numbers);
		
		System.out.println(obj.toJSONString());
		
		

		
	}
}
