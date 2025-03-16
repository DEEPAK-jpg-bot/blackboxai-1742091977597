package com.example.wifiscanner;

public class WifiNetwork {
    private String ssid;
    private String bssid;
    private String ipAddress;
    private String manufacturer;
    private int signalStrength;
    private int frequency;

    public WifiNetwork(String ssid, String bssid, String ipAddress, String manufacturer, 
                      int signalStrength, int frequency) {
        this.ssid = ssid;
        this.bssid = bssid;
        this.ipAddress = ipAddress;
        this.manufacturer = manufacturer;
        this.signalStrength = signalStrength;
        this.frequency = frequency;
    }

    public String getSsid() {
        return ssid.isEmpty() ? "<Hidden Network>" : ssid;
    }

    public String getBssid() {
        return bssid;
    }

    public String getIpAddress() {
        return ipAddress != null ? ipAddress : "N/A";
    }

    public String getManufacturer() {
        return manufacturer != null ? manufacturer : "Unknown";
    }

    public int getSignalStrength() {
        return signalStrength;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getSignalStrengthLevel() {
        if (signalStrength >= -50) return "Excellent";
        if (signalStrength >= -60) return "Good";
        if (signalStrength >= -70) return "Fair";
        return "Poor";
    }

    public String getFrequencyBand() {
        return frequency >= 5000 ? "5 GHz" : "2.4 GHz";
    }
}
