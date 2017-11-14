package pojo;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 14:25 2017/11/14
 * @Modified By:
 */
public class Items {
    private String name;
    private String price;
    private String detail;

    public Items(String name, String price, String detail) {
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
