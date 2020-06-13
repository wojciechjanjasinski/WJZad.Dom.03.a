import java.util.Date;

class SpecialOfferPromotion {
    public static void main(String[] args) {
        Product specialOfferPromotion = new Product("Krówki", "Wawel2", 6.99, "Łakoć doskonała od jednego z najbarrdzej cenionych producentów w Polsce", true);
        Category category = new Category("Słodkości dla wszystkich", "Nasza najlepsza łakoć przez duże Ł");


        System.out.println(specialOfferPromotion.name + " " + specialOfferPromotion.producer + " Stara cena: " + specialOfferPromotion.price + " \n " + specialOfferPromotion.description + " \n " + specialOfferPromotion.availability + " \n " + category.name25  + " \n " + category.description2);
        Date otherDateFrom = new Date(1597212000000L);
        System.out.println("Tylko teraz od:");
        System.out.println(otherDateFrom);
        Date otherDateTill = new Date(1597773600000L);
        System.out.println("Jedynie do");
        System.out.println(otherDateTill);


        SpecialOffer20 specialOffer20 = new SpecialOffer20();

        System.out.println(specialOfferPromotion.name + " " + specialOfferPromotion.producer + " w specjalnej promocyjnej cenie - 20%" + " " + specialOffer20.percent3(75, 6.99) + " oferta ograniczona czasowo! Pośpiesz się!");

    }
}
