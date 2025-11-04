package org.example;

class Smartphone implements GPS, Cellular {
    private double lat;
    private double lon;

    public Smartphone(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public double[] getCoordinates() {
        return new double[] { lat, lon };
    }

    @Override
    public void makeCall() {
        System.out.println("Dialing...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Incoming call...");
    }
}
