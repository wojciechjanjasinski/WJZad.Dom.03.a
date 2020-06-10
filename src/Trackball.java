class Trackball {
    String name;
    String producer;
    String type;
    String preferedHand;
    int productionYear;
    int ballSize;
    boolean wireless; // true = bezprzewodowy false = kablowy
    int buttonNumber;
    boolean scrollWhell;
    boolean inProduction;

    Trackball(String n, String p, String t, String pH, int prY, int bS, boolean w, int bN, boolean sW, boolean iP) {
        name = n;
        producer = p;
        preferedHand = pH;
        ballSize = 0;
        wireless = false;
        buttonNumber = 3;
        scrollWhell = true;
        inProduction = true;

    }

}
