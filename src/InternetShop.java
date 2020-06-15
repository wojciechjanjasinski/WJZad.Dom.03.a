class InternetShop {

    public static void main(String[] args) {
        Product product1 = new Product("Kasztanki", "Wawel2", 4.99, "cudowna słodycz dla podniebienia", true, new Category("Słodkie", "Łakocie dla wszystkich"));
        Product product2 = new Product("Michałki", "Wawel2", 3.99, "pyszne smakołyki", true, new Category("Słodkie", "Łakocie dla wszystkich"));
        Product product3 = new Product("Chleb biały", "Piekarnia Radosna", 2.99, "smak wiejskiego chleba o poranku", true, new Category("bez kategorii", "bez opisu"));
        Product product4 = new Product("Masło", "Masłopol", 2.99, "cudowne masło we wspaniałej cenie", true, new Category("Nabiał", "Nabiał, mleko, sery"));
        SpecialOffer specialOffer = new SpecialOffer(new Product("Krówki", "Wawel2", 6.99, "Łakoć doskonała", true, new Category("Słodkie", "Łakocie dla wszystkich")), 5.59, "1 sierpnia 2020", "7 sierpnia 2020");
        Product noCategory = new Product("Chałwa", "Tureckie specjały", 9.99, "przepyszna turecka przyjemność", true);

        System.out.println(product1.name + " " + product1.producer + " " + product1.price + " PLN \n" + product1.description + " " + product1.availability + " \nkategoria produktu: " + product1.category.name + " " + product1.category.description);
        System.out.println(product2.name + " " + product2.producer + " " + product2.price + " PLN \n" + product2.description + " " + product2.availability + " \nkategoria produktu: " + product2.category.name + " " + product2.category.description);
        System.out.println(product3.name + " " + product3.producer + " " + product3.price + " PLN \n" + product3.description + " " + product3.availability + " \nkategoria produktu: " + product3.category.name + " " + product3.category.description);
        System.out.println(product4.name + " " + product4.producer + " " + product4.price + " PLN \n" + product4.description + " " + product4.availability + " \nkategoria produktu: " + product4.category.name + " " + product4.category.description);
        System.out.println(specialOffer.product.name + " " + specialOffer.product.producer + " " + specialOffer.product.price + " PLN \n" + specialOffer.product.description + " " + specialOffer.product.availability + " tylko teraz specjalna cena -20%: " + specialOffer.discount + "  PLN " + specialOffer.from+ " " + specialOffer.till + " \nkategoria produktu: " + specialOffer.product.category.name + " " + specialOffer.product.category.description);
        System.out.println(noCategory.name + " " + noCategory.producer + " " + noCategory.price + " PLN \n" + noCategory.description + " " + noCategory.availability);
    }
}
