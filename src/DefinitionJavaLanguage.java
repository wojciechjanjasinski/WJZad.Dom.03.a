class DefinitionJavaLanguage {
    public static void main(String[] args) {
        System.out.print("Treść zadania\n" +
                "Klasa to podstawowy element w programowaniu w języku Java, na który może składać się szereg zmiennych o określonym typie.\n" +
                "Obiekt to konkretny egzemlarz klasy składający się z charakterystycznych przypisanych mu zmiennych.\n" +
                "Zmienna to informacja dla kompilatora Javy o konkretnym czytelnym dla niego zaprogramowanym typie m. in. o konkretnym typie liczbowym w obrębie określonego zakresu liczb, informacji typu prawda lub fałsz, znaku, napisu, który można wyświetlić.\n" +
                "Każda zmienna musi mieć określony typ, np. int, albo String.\n" +
                "Jeżeli deklarację zmiennej poprzedzimy słowem final, to wówczas definitywnie określamy jej wartość. Takiej zmiennej nie mozemy nadać nowej wartości poniżej miejsca, w którym występuje ona z takim sformułowaniem.\n" +
                "W klasie mogą się znajdować obiekty, zmienne i konstruktory.\n" +
                "Konstruktory domyślne są wywoływane przez operator new lub po przez wykorzystanie nawiasów klamrowych i służą do tworzenia nowych obiektów.\n" +
                "Jeśli w klasie zdefiniowano chociaż jeden operator to kompilator nie wygeneruje dla nas konstruktora domyślnego.\n" +
                "Zakładając, że istnieje klasa Car, to przy zapisie:\n" +
                "Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);\n" +
                "Car car2 = car1;\u200B\n" +
                "car1 i car2 to dwie referencje wskazujące na ten sam obiekt.");
    }
}
