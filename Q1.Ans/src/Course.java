public class Course {
    private String maker;
    private int price;

    public Course() {
    }

    public Course(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getCode(){
        return maker + ", " + price;
    }
}
