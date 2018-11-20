package carServer.Entity;

import java.io.Serializable;

public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4171634123367820406L;
	//������ţ�Ψһ������
		private Integer id;
		//��������
		private String name;
		//������ע
		private String detail;
		//����Ʒ��
		private String brand;
		//��������
		private String type;
		//����һ�����޼۸�
		private double price;
		//�����ܼ۸�
		private double totalprice;
		//����״̬��0��ʾδ���ȥ��1��ʾ�����ȥ
		private int state;
		//�Ƿ��ϼ�,0��ʾ�¼�(Ĭ��),1��ʾ�ϼ�
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
