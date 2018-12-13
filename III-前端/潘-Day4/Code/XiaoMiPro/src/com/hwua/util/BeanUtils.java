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
 *' 把ResultSet 转变成JavaBean
 * @author Administrator
 *
 */
public class BeanUtils {
	/**
	 * '获取指定对象
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
		//-- 目的:从ResultSet中读取数据封装到cls所代表的对象中.
		//-- 1.利用Class对象来构建对象.
		Class<? extends Object> cls = t.getClass();
		Object instance = cls.newInstance();
		//-- 2.验证对象		
		if (instance.getClass() == t.getClass()) {
			//-- 强转
			t = (T) instance;
		}
		
		//-- 获取所有的字段
		Field[] fields = cls.getDeclaredFields();
		System.out.println("字段个数:\t" +fields.length);
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			//-- 遍历结果集
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
	 * ' 获取对象集合
	 * @param rSet
	 * @param cls
	 * @return
	 */
	public static <T>T GetBeanList(ResultSet rSet,Class<?> cls){
		//-- 1.加载Class
		
		return null;
		
	}
	

}
