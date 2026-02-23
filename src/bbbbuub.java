public class bbbbuub {
    public int price;
    public String uhhyyhh;
    public Toys toys;
    public int size;

    public bbbbuub(int size) {
        this.size = size;
    }

    public bbbbuub(int price, String uhhyyhh, Toys toys) {
        this.price = price;
        this.uhhyyhh = uhhyyhh;
        this.toys = toys;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUhhyyhh() {
        return uhhyyhh;
    }

    public void setUhhyyhh(String uhhyyhh) {
        this.uhhyyhh = uhhyyhh;
    }

    public Toys getToys() {
        return toys;
    }

    public void setToys(Toys toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "bbbbuub{" +
                "price=" + price +
                ", uhhyyhh='" + uhhyyhh + '\'' +
                ", toys=" + toys +
                '}';
    }
}
