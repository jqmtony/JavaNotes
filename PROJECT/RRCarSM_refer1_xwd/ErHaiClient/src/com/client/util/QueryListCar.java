package com.client.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.client.bean.CarBrandCategory;
/**
 * ɸѡ�ӷ���˻�õ��������󣬷�����Ҫ�Ķ����б�
 * @author Administrator
 *
 */
public class QueryListCar {
	
	/**
	 * ����id����
	 * @param list
	 * @return
	 */
	public static List<CarBrandCategory> List (List<CarBrandCategory> list){
		
		Collections.sort(list, new Comparator<CarBrandCategory>() {

			@Override
			public int compare(CarBrandCategory c1 , CarBrandCategory c2) {
				return c1.getCarId().compareToIgnoreCase(c2.getCarId());
			}
			
		});
		return list;
		}
	/**
	 * ���ռ۸�����
	 * @param list
	 * @return
	 */
	public static List<CarBrandCategory> ListASC (List<CarBrandCategory> list){
		
		Collections.sort(list, new Comparator<CarBrandCategory>() {

			@Override
			public int compare(CarBrandCategory c1 , CarBrandCategory c2) {
				return (int)c1.getRent() - (int)c2.getRent();
			}
			
		});
		return list;
		}
	/**
	 * ���ռ۸���
	 * @param list
	 * @return
	 */
	public static List<CarBrandCategory> ListDESC (List<CarBrandCategory> list){
		
		Collections.sort(list, new Comparator<CarBrandCategory>() {

			@Override
			public int compare(CarBrandCategory c1 , CarBrandCategory c2) {
				return (int)c2.getRent() - (int)c1.getRent();
			}
			
		});
		return list;
		}
	
	/**
	 * ������������
	 * @param list
	 * @return
	 */
	public static List<CarBrandCategory> ListCategory (List<CarBrandCategory> list ,String category){
		List<CarBrandCategory> arrayList = new ArrayList<>();
		for (CarBrandCategory carBrandCategory : list) {
			if (carBrandCategory.getCategory().getName().equals(category)) {
				arrayList.add(carBrandCategory);
			}
		}
		return arrayList;
		}
	
	/**
	 * ����Ʒ������
	 * @param list
	 * @return
	 */
	public static List<CarBrandCategory> ListBrand (List<CarBrandCategory> list ,String brand){
		List<CarBrandCategory> arrayList = new ArrayList<>();
		for (CarBrandCategory carBrandCategory : list) {
			if (carBrandCategory.getCategory().getName().equals(brand)) {
				arrayList.add(carBrandCategory);
			}
		}
		return arrayList;
		}
	
	
}
