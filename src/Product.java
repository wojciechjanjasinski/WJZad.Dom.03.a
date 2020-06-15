class Product {
    String name;
    String producer;
    double price;
    String description;
    boolean availability;
    Category category;
    SpecialOffer specialOffer;

    Product(String n, String pro, double pri, String d, boolean a, Category c) {
        name = n;
        producer = pro;
        price = pri;
        description = d;
        availability = a;
        category = c;

    }

    Product(String n, String pro, double pri, String d, boolean a, Category c, SpecialOffer sO) {
        name = n;
        producer = pro;
        price = pri;
        description = d;
        availability = a;
        category = c;
        specialOffer = sO;

    }

    Product(String n, String pro, double pri, String d, boolean a) {
        name = n;
        producer = pro;
        price = pri;
        description = d;
        availability = a;
    }
}