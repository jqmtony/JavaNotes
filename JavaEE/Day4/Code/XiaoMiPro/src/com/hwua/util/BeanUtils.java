package com.hwua.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.env.IUpdatableModule;

import com.hwua.bean.User;



/**
 *' ��ResultSet ת���JavaBean
 * @author Administrator
 *
 */
public class BeanUtils {
	/**
	 * '��ȡָ������
	 * @param rSet
	 * @param cls
	 * @return
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static <T>T GetBean(ResultSet rSet,T t) throws InstantiationException, IllegalAccessException, SQLException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		//-- Ŀ��:��ResultSet�ж�ȡ���ݷ�װ��cls������Ķ�����.
		//-- 1.����Class��������������.
		Class<? extends Object> cls = t.getClass();
		Object instance = cls.newInstance();
		//-- 2.��֤����		
		if (instance.getClass() == t.getClass()) {
			//-- ǿת
			t = (T) instance;
		}
		
		//-- ��ȡ���е��ֶ�
		Field[] fields = cls.getDeclaredFields();
		System.out.println("�ֶθ���:\t" +fields.length);
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			//-- ���������
			String temp = "";
			if (rSet.next()) {
				temp = rSet.getString(field.getName());
				System.out.println("temp:\t" + temp);
			}
			field.set(t, temp);
		}
		
		System.out.println("t:\t" + t.toString());
		
		
		return null;
		
	}
	
	/**
	 * ' ��ȡ���󼯺�
	 * @param rSet
	 * @param cls
	 * @return
	 */
	public static <T>T GetBeanList(ResultSet rSet,Class<?> cls){
		//-- 1.����Class
		
		return null;
		
	}
	

}
