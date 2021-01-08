package thread;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item xueping=new Item();
		xueping.name="ÑªÆ¿";
		xueping.price=30;
		
		System.out.println("Ãû×Ö:"+xueping.name+"£¬¼Û¸ñ£º"+xueping.price);
	}

}
 class Item{
	String name;
	int price;
}