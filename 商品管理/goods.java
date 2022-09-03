package productManager;

import java.util.*;
public class goods {
	//產品名
	String productName;
	// 價格
	float price;
	// 廠商
	String manufacturer;
	public goods(String productName,float price,String manufacturer) {
		this.productName = productName;
		this.price = price;
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return productName;
	}
	public float getprice(){
		return price;
	}
	
	public void show() {
		System.out.println(productName+"\t"+price);
	}

public static void main(String[] args) {
	String productName,manufacturer;
	float price;
	ArrayList<goods> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("----商品管理系統----");
	System.out.println("********************");
	System.out.println("---1:登入商品訊息---");
	System.out.println("---2:搜尋商品訊息---");
	System.out.println("---3:進入結帳系統---");
	System.out.println("---4:退出結帳系統---");
	while(true) {
		System.out.println("----請選擇序號:----");
		int num = sc.nextInt();
		if(num == 1) {
				System.out.println("請輸入商品名稱");
				productName = sc.next();
				System.out.println("請輸入商品價格(NTD)");
				price = sc.nextFloat();
				System.out.println("請輸入商品廠商");
				manufacturer = sc.next();
				goods goods = new goods(productName,price,manufacturer);
				list.add(goods);
				System.out.println(list);
		}else if(num ==2) {
				System.out.println("請輸入預搜尋商品名稱");
				String serachName = sc.next();
				boolean type = true;
				for(int i=0;i<list.size();i++) {
					goods g = list.get(i);
					if (serachName.equals(g.getName())) {
						System.out.println("欲查詢商品存在");
						g.show();
					}else {
						type = false;
					}
				}
		}else if (num ==3) {
			float total[] = new float[list.size()];
			float Total=0;
			System.out.println("商品:\t名稱'\t售價:價格");
			for(int i =0;i<list.size();i++) {
				goods g = list.get(i);
				g.show();
				total[i] =g.getprice();
				Total +=total[i]; 
			}
			System.out.println("總價格:"+Total);
		}else if (num ==4) {
			System.out.println("退出系統成功");
			break;
		}				
	  }
	}
}


