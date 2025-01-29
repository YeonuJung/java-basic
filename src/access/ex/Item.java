package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // name을 메서드에서 제공하는 방식으로 멤버변수에 직접 접근 제한
    public String getName(){
        return name;
    }
    // price * quantity를 메서드에서 제공하는 방식으로 멤버변수에 직접 접근 제한
    public int getTotalPrice(){
        return price * quantity;
    }
}
