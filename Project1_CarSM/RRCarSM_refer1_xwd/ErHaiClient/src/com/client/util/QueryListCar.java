package com.client.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.client.bean.CarBrandCategory;
/**
 * 筛选从服务端获得的汽车对象，返回需要的对象列表
 * @author Administrator
 *
 */
public class QueryListCar {
	
	/**
	 * 按照id升序
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
	 * 按照价格升序
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
	 * 按照价格降序
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
	 * 按照类型搜索
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
	 * 按照品牌搜索
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
