class Test {
    Product product1 = new Product("Kasztanki", "Wawel2", 4.99, "cudowna słodycz dla podniebienia", true, new Category("Słodkie", "Łakocie dla wszystkich"));
    Product product2 = new Product("Michałki", "Wawel2", 3.99, "pyszne smakołyki", true, new Category("Słodkie", "Łakocie dla wszystkich"));
    Product product3 = new Product("Chleb biały", "Piekarnia Radosna", 2.99, "smak wiejskiego chleba o poranku", true, new Category("bez kategorii", "bez opisu"));
    Product product4 = new Product("Masło", "Masłopol", 2.99, "cudowne masło we wspaniałej cenie", true, new Category("Nabiał", "Nabiał, mleko, sery"));
    Product product5 = new Product("Krówki", "Wawel2", 6.99, "Łakoć doskonała od jednego z najbarrdzej cenionych producentów w Polsce", true, 5.59, new Category("Słodkie", "Łakocie dla wszystkich"), "od 1 sierpnia 2020", "do 7 sierpnia 2020");
}
class InternetShop {

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.product1.name + " " + test.product1.producer + " " + test.product1.price + " PLN \n" + test.product1.description + " " + test.product1.availability + " \nkategoria produktu: " + test.product1.category.name + " " + test.product1.category.description);
        System.out.println(test.product2.name + " " + test.product2.producer + " " + test.product2.price + " PLN \n" + test.product2.description + " " + test.product2.availability + " \nkategoria produktu: " + test.product2.category.name + " " + test.product2.category.description);
        System.out.println(test.product3.name + " " + test.product3.producer + " " + test.product3.price + " PLN \n" + test.product3.description + " " + test.product3.availability + " \nkategoria produktu: " + test.product3.category.name + " " + test.product3.category.description);
        System.out.println(test.product4.name + " " + test.product4.producer + " " + test.product4.price + " PLN \n" + test.product4.description + " " + test.product4.availability + " \nkategoria produktu: " + test.product4.category.name + " " + test.product4.category.description);
        System.out.println(test.product5.name + " " + test.product5.producer + " " + test.product5.price + " PLN \n" + test.product5.description + " " + test.product5.availability + " tylko teraz specjalna cena -20%: " + test.product5.discount + "  PLN " + test.product5.from + " " + test.product5.till + " \nkategoria produktu: " + test.product5.category.name + " " + test.product5.description);
    }
}
