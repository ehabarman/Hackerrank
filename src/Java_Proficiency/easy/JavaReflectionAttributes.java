//Date 10-7-2018
package Java_Proficiency.easy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {
	
	public static void main(String[] args){
		@SuppressWarnings("rawtypes")
		Class student = Students.class;
		Method[] methods = student.getDeclaredMethods();
		ArrayList<String> methodList = new ArrayList<>();
		for(Method method: methods){
			methodList.add(method.getName());
		}
		Collections.sort(methodList);
		for(String name: methodList){
			System.out.println(name);
		}
    }


}
