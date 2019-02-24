package com.example.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RelDemo {
	
	public static void main(String[] args) {
		
		try {
			Class<?> cls = Class.forName("com.example.test.Student");
			//-- 1.cls��ȡ���е����й��췽��
			Constructor<?>[] cons = cls.getConstructors();
			//-- 2.�������췽��
			for (Constructor<?> c : cons) {
				System.out.println(c);
			}
			//-- 3.��ȡָ���Ĺ��췽��
			Constructor<?> con = cls.getConstructor();
			//-- 4.���ù��췽�����ɶ���
			Object obj = con.newInstance();
			//-- 5.��֤�����Ƿ���ѧ������
			System.out.println(obj instanceof Student);
			if (obj instanceof Student) {
				//-- ����ת��
				Student stu = (Student) obj;
			}
			//-- ��ȡ���в����Ĺ��췽��
			Constructor<?> con1 = cls.getConstructor(int.class,String.class);
			//-- ��������
			Object obj1 = con1.newInstance(1,"����");
			System.out.println(obj1 instanceof Student);
			if (obj1 instanceof Student) {
				Student stu = (Student) obj1;
				System.out.println(stu);
			}
			
			//-- ���䷽��
			Method[] methods = cls.getMethods();
			//-- �������еķ���
			for (Method m : methods) {
				System.out.println(m);
			}
			//-- �����ȡָ���ķ���
			//name the name of the method
			//parameterTypes the list of parameters
			Method method = cls.getMethod("getStuId");
			System.out.println(method.getName());
			System.out.println("���÷���:\t"+method.invoke(obj1));
			
			//-- ��ȡע��
			Annotation[] anns = cls.getAnnotations();
			//-- ����ע��
			System.out.println("ע�ⳤ��:\t"+anns.length);
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
