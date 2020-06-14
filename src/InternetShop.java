class InternetShop {
    public static void main(String[] args) {
        Test test = new Test();
        PromoProduct promoProduct = new PromoProduct();
        SpecialOfferPromotion specialOfferPromotion = new SpecialOfferPromotion();

        System.out.println(test.product1.name + " " + test.product1.producer + " " + test.product1.price + " PLN \n" + test.product1.description + " " + test.product1.availability + " \nkategoria produktu: " + test.product1.category.name + " " + test.product1.category.description);
        System.out.println(test.product2.name + " " + test.product2.producer + " " + test.product2.price + " PLN \n" + test.product2.description + " " + test.product2.availability + " \nkategoria produktu: " + test.product2.category.name + " " + test.product2.category.description);
        System.out.println(test.product3.name + " " + test.product3.producer + " " + test.product3.price + " PLN \n" + test.product3.description + " " + test.product3.availability + " \nkategoria produktu: " + test.product3.category.name + " " + test.product3.category.description);
        System.out.println(promoProduct.promoProduct.name + " " + promoProduct.promoProduct.producer + " " + promoProduct.promoProduct.price + " PLN \n" + promoProduct.promoProduct.description + " " + promoProduct.promoProduct.availability + " \nkategoria produktu: " + promoProduct.promoProduct.category.name + " " + promoProduct.promoProduct.category.description);
        System.out.println(specialOfferPromotion.specialOfferPromotion.name + " " + specialOfferPromotion.specialOfferPromotion.producer + " " + specialOfferPromotion.specialOfferPromotion.price + " PLN \n" + specialOfferPromotion.specialOfferPromotion.description + " " + specialOfferPromotion.specialOfferPromotion.availability + " tylko teraz specjalna cena: " + specialOfferPromotion.specialOfferPromotion.specialPrice + "  PLN \nkategoria produktu: " + specialOfferPromotion.specialOfferPromotion.category.name + " " + specialOfferPromotion.specialOfferPromotion.description);
    }
}
