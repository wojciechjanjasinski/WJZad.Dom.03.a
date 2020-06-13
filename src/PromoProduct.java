class PromoProduct {
    public static void main(String[] args) {
        Product promoProduct = new Product("Masło", "Masłopol", 2.99, "cudowne masło we wspaniałej cenie", true);
        Category category = new Category("Nabiał", "Nabiał, mleko, sery");
        System.out.println(promoProduct.name + " " + promoProduct.producer + " Stara cena: " + promoProduct.price + " \n " + promoProduct.description + " \n " + promoProduct.availability + " \n " + category.name25 + " \n " + category.description2);
        SpecialOffer20 specialOffer20 = new SpecialOffer20();

        System.out.println(promoProduct.name + " " + promoProduct.producer + " w specjalnej promocyjnej cenie - 20%" + " " + specialOffer20.percent3(80, 2.99) + " oferta ograniczona czasowo! Pośwpiesz się!");

    }
}
