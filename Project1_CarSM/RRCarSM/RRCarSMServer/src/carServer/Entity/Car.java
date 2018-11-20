package carServer.Entity;

import java.io.Serializable;

public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4171634123367820406L;
	//汽车编号，唯一，自增
		private Integer id;
		//汽车名称
		private String name;
		//汽车备注
		private String detail;
		//汽车品牌
		private String brand;
		//汽车类型
		private String type;
		//汽车一天租赁价格
		private double price;
		//汽车总价格
		private double totalprice;
		//汽车状态，0表示未租出去，1表示已租出去
		private int state;
		//是否上架,0表示下架(默认),1表示上架
		private int shelf;
		
		
		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDetail() {
			return detail;
		}


		public void setDetail(String detail) {
			this.detail = detail;
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public double getTotalprice() {
			return totalprice;
		}


		public void setTotalprice(double totalprice) {
			this.totalprice = totalprice;
		}


		public int getState() {
			return state;
		}


		public void setState(int state) {
			this.state = state;
		}


		public int getShelf() {
			return shelf;
		}


		public void setShelf(int shelf) {
			this.shelf = shelf;
		}


		public Car(){
			
		}


		public Car(Integer id, String name, String detail, String brand, String type, double price, double totalprice,
				int state, int shelf) {
			super();
			this.id = id;
			this.name = name;
			this.detail = detail;
			this.brand = brand;
			this.type = type;
			this.price = price;
			this.totalprice = totalprice;
			this.state = state;
			this.shelf = shelf;
		}
		public Car( String name, String detail, String brand, String type, double price, double totalprice,
				int state, int shelf) {
			super();
			
			this.name = name;
			this.detail = detail;
			this.brand = brand;
			this.type = type;
			this.price = price;
			this.totalprice = totalprice;
			this.state = state;
			this.shelf = shelf;
		}
		
		
		

}
