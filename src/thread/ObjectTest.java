package thread;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item xueping=new Item();
		xueping.name="Ѫƿ";
		xueping.price=30;
		
		System.out.println("����:"+xueping.name+"���۸�"+xueping.price);
	}

}
 class Item{
	String name;
	int price;
}