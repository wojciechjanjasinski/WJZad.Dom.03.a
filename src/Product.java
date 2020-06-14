class Product {
    String name;
    String producer;
    double price;
    String description;
    boolean availability;
    Category category;
    double discount;
    String from;
    String till;

    Product(String n, String pro, double pri, String d, boolean a, Category c) {
        name = n;
        producer = pro;
        price = pri;
        description = d;
        availability = a;
        category = c;

    }

    Product(String n, String pro, double pri, String d, boolean a, double di, Category c, String f, String ti) {
        name = n;
        producer = pro;
        price = pri;
        description = d;
        availability = a;
        category = c;
        discount = di;
        from = f;
        till = ti;
    }
}