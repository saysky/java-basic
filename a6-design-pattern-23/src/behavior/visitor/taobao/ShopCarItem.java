package behavior.visitor.taobao;


public class ShopCarItem {
    public String shopid;
    public String title;
    public int number;
    public Float price;
    public Float sum;

    public void accept(InfVisitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getShopInfo() {

        return title + price + "(元) X" + number + "(个) = ";
    }

}
