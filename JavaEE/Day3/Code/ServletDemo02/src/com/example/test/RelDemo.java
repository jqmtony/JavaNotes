package com.example.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RelDemo {
	
	public static void main(String[] args) {
		
		try {
			Class<?> cls = Class.forName("com.example.test.Student");
			//-- 1.cls获取类中的所有构造方法
			Constructor<?>[] cons = cls.getConstructors();
			//-- 2.遍历构造方法
			for (Constructor<?> c : cons) {
				System.out.println(c);
			}
			//-- 3.获取指定的构造方法
			Constructor<?> con = cls.getConstructor();
			//-- 4.利用构造方法生成对象
			Object obj = con.newInstance();
			//-- 5.验证对象是否是学生类型
			System.out.println(obj instanceof Student);
			if (obj instanceof Student) {
				//-- 类型转换
				Student stu = (Student) obj;
			}
			//-- 获取带有参数的构造方法
			Constructor<?> con1 = cls.getConstructor(int.class,String.class);
			//-- 构建对象
			Object obj1 = con1.newInstance(1,"张三");
			System.out.println(obj1 instanceof Student);
			if (obj1 instanceof Student) {
				Student stu = (Student) obj1;
				System.out.println(stu);
			}
			
			//-- 反射方法
			Method[] methods = cls.getMethods();
			//-- 遍历所有的方法
			for (Method m : methods) {
				System.out.println(m);
			}
			//-- 反射获取指定的方法
			//name the name of the method
			//parameterTypes the list of parameters
			Method method = cls.getMethod("getStuId");
			System.out.println(method.getName());
			System.out.println("调用方法:\t"+method.invoke(obj1));
			
			//-- 获取注解
			Annotation[] anns = cls.getAnnotations();
			//-- 遍历注解
			System.out.println("注解长度:\t"+anns.length);
			for (Annotation a : anns) {
				System.out.println(a);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
