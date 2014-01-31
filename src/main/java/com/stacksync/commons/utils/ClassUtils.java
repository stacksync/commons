package com.stacksync.commons.utils;

import java.lang.reflect.Field;

public class ClassUtils {

	public static String classToString(Object object){
		StringBuilder result = new StringBuilder();

		result.append(object.getClass().getName());
		result.append(" {");

		// determine fields declared in this class only (no fields of
		// superclass)
		Field[] fields = object.getClass().getDeclaredFields();

		// print field names paired with their values
		for (Field field : fields) {
			result.append("  ");
			try {
				result.append(field.getName());
				result.append(": ");
				// requires access to private field:
				result.append(field.get(object));
			} catch (IllegalAccessException ex) {
				System.out.println(ex);
			}
		}
		result.append("}");

		return result.toString();
	}
}
