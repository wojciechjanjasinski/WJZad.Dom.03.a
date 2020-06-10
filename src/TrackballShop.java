class TrackballShop {
    public static void main(String[] args) {
        Trackball trackball1 = new Trackball();

        trackball1.name = "Trackball Explorer";
        trackball1.producer = "Microsoft";
        trackball1.type = "finger-operated";
        trackball1.preferedHand = "right hand";
        trackball1.productionYear = 2001;
        trackball1.ballSize = 38;
        trackball1.wireless = false;
        trackball1.buttonNumber = 5;
        trackball1.scrollWhell = true;
        trackball1.inProduction = false;

        Trackball trackball2 = new Trackball();
        trackball2.name = "Trackman Marble";
        trackball2.producer = "Logitech";
        trackball2.type = "finger-operated";
        trackball2.preferedHand = "ambidexious";
        trackball2.productionYear = 2004;
        trackball2.ballSize = 40;
        trackball2.wireless = false;
        trackball2.buttonNumber = 4;
        trackball2.scrollWhell = false;
        trackball2.inProduction = true;

        System.out.println(trackball1.producer + " " + trackball1.name + " " + trackball1.type + " " + trackball1.preferedHand + " " + trackball1.productionYear + " " + trackball1.ballSize + " mm ball " + "wireless: " + trackball1.wireless + " " + trackball1.buttonNumber + " buttons " + "Scroll Wheel: " +  trackball1.scrollWhell + " still in production: " + trackball1.inProduction);
        System.out.println(trackball2.producer + " " + trackball2.name + " " + trackball2.type + " " + trackball2.preferedHand + " " + trackball2.productionYear + " " + trackball2.ballSize + " mm ball " + "wireless: " + trackball2.wireless + " " + trackball2.buttonNumber + " buttons " + "Scroll Wheel: " +  trackball2.scrollWhell + " still in production: " + trackball2.inProduction);

    }
}
