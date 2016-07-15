package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Goods.getCountOfGoods());
		Goods camera =new Goods();

		camera.setName("nikon");
		camera.setPrice(50000);
		camera.setCountSold(10);
		camera.setCountStock(50);
		System.out.println(Goods.getCountOfGoods()); //static 붙은 변수

//		String str= camera.toString();//객체정보를 String으로 바꿔주는 메소드
		
		System.out.println(camera.getName());
		camera.showInfo();
		System.out.println(camera);
		
		int discountPrice =camera.calcDiscountPrice(50);
		System.out.println(discountPrice);
		
		Goods goods1 = new Goods("cannon",300000,0,100);
		System.out.println(goods1);
		System.out.println(Goods.getCountOfGoods());
		
	}

}
