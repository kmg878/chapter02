package chapter02;

public class Goods {
	public static int countOfGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public void setName(String n){
		this.name = n ; //인스턴스 자신을 가르키는 
	}
	public int getPrice() {
		return price;
	}
	public Goods(){
		
	}
	public Goods(String name,int price,int countStock,int countSold){
		this.name = name;
		this.price=price;
		this.countStock=countStock;
		this.countSold=countSold;
	}
	
	public void setPrice(int price) {
		if( price < 0){
			price=0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public String getName(){
		return name ;
	}
	
	public void showInfo(){
		System.out.println("[name ="+name+","+"price="+price+","+"countStock="+countStock+","+"countSold="+countSold+"]");
	}
	public int calcDiscountPrice(int percentage){
		return price*percentage/100;
	}
}
