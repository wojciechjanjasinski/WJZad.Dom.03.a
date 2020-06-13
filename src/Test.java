class Test {
    public static void main(String[] args) {
        Product product1 = new Product("Kasztanki", "Wawel2", 4.99, "cudowna słodycz dla podniebienia", true);
        Category category = new Category("Słodkości dla wszystkich", "Słodkie");
        Product product2 = new Product("Michałki", "Wawel2", 3.99,"pyszne smakołyki", true);
        Product product3 = new Product("Chleb biały", "Piekarnia Radosna", 2.99, "smak wiejskiego chleba o poranku", true);

        System.out.println(product1.name + " " + product1.producer + " " + product1.price + " PLN \n " + product1.description + " " + product1.availability + " " + category.name25 + " " + category.description2);
        System.out.println(product2.name + " " + product2.producer + " " + product2.price + " PLN \n " + product2.description + " " + product2.availability + " " + category.name25 + " " + category.description2);
        System.out.println(product3.name + " " + product3.producer + " " + product3.price + " PLN \n " + product3.description + " " + product3.availability);

    }
}
