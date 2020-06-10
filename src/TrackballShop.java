class TrackballShop {
    public static void main(String[] args) {
        Trackball trackball1 = new Trackball("Trackball Explorer", "Microsoft", "finger-operated", "right hand", 2001, 38, false, 5, true, false);
        Trackball trackball2 = new Trackball("Trackman Marble", "Logitech", "finger-operated", "ambidexious", 2004, 40, false, 4, false, true);

        System.out.println(trackball1.producer + " " + trackball1.name + " " + trackball1.type + " " + trackball1.preferedHand + " " + trackball1.productionYear + " " + trackball1.ballSize + " mm ball " + "wireless: " + trackball1.wireless + " " + trackball1.buttonNumber + " buttons " + "Scroll Wheel: " + trackball1.scrollWhell + " still in production: " + trackball1.inProduction);
        System.out.println(trackball2.producer + " " + trackball2.name + " " + trackball2.type + " " + trackball2.preferedHand + " " + trackball2.productionYear + " " + trackball2.ballSize + " mm ball " + "wireless: " + trackball2.wireless + " " + trackball2.buttonNumber + " buttons " + "Scroll Wheel: " + trackball2.scrollWhell + " still in production: " + trackball2.inProduction);

    }
}
