package com.example.wifiscanner;

import java.util.HashMap;
import java.util.Map;

public class MacLookup {
    private static final Map<String, String> manufacturerMap = new HashMap<>();

    static {
        // Initialize with some common manufacturer MAC prefixes
        manufacturerMap.put("00:0C:29", "VMware");
        manufacturerMap.put("00:50:56", "VMware");
        manufacturerMap.put("00:1A:11", "Google");
        manufacturerMap.put("00:1B:63", "Apple");
        manufacturerMap.put("00:23:AB", "Apple");
        manufacturerMap.put("00:25:00", "Apple");
        manufacturerMap.put("00:26:BB", "Apple");
        manufacturerMap.put("00:03:93", "Apple");
        manufacturerMap.put("00:0D:93", "Apple");
        manufacturerMap.put("00:11:24", "Apple");
        manufacturerMap.put("00:14:51", "Apple");
        manufacturerMap.put("00:16:CB", "Apple");
        manufacturerMap.put("00:17:F2", "Apple");
        manufacturerMap.put("00:19:E3", "Apple");
        manufacturerMap.put("00:1C:B3", "Apple");
        manufacturerMap.put("00:1E:52", "Apple");
        manufacturerMap.put("00:1F:5B", "Apple");
        manufacturerMap.put("00:21:E9", "Apple");
        manufacturerMap.put("00:22:41", "Apple");
        manufacturerMap.put("00:23:12", "Apple");
        manufacturerMap.put("00:23:32", "Apple");
        manufacturerMap.put("00:24:36", "Apple");
        manufacturerMap.put("00:25:BC", "Apple");
        manufacturerMap.put("00:26:08", "Apple");
        manufacturerMap.put("00:26:B0", "Apple");
        manufacturerMap.put("00:26:BB", "Apple");
        manufacturerMap.put("00:30:65", "Apple");
        manufacturerMap.put("00:3E:E1", "Apple");
        manufacturerMap.put("00:0E:8F", "Cisco");
        manufacturerMap.put("00:0F:23", "Cisco");
        manufacturerMap.put("00:13:19", "Cisco");
        manufacturerMap.put("00:13:5F", "Cisco");
        manufacturerMap.put("00:14:69", "Cisco");
        manufacturerMap.put("00:14:A9", "Cisco");
        manufacturerMap.put("00:18:B9", "Cisco");
        manufacturerMap.put("00:1A:2F", "Cisco");
        manufacturerMap.put("00:1B:53", "Cisco");
        manufacturerMap.put("00:1B:8F", "Cisco");
        manufacturerMap.put("00:1C:0F", "Cisco");
        manufacturerMap.put("00:1C:58", "Cisco");
        manufacturerMap.put("00:1C:B0", "Cisco");
        manufacturerMap.put("00:1C:F6", "Cisco");
        manufacturerMap.put("00:1D:45", "Cisco");
        manufacturerMap.put("00:1D:A1", "Cisco");
        manufacturerMap.put("00:1E:13", "Cisco");
        manufacturerMap.put("00:1E:F7", "Cisco");
        manufacturerMap.put("00:21:1B", "Cisco");
        manufacturerMap.put("00:21:55", "Cisco");
        manufacturerMap.put("00:21:A0", "Cisco");
        manufacturerMap.put("00:22:55", "Cisco");
        manufacturerMap.put("00:22:90", "Cisco");
        manufacturerMap.put("00:23:04", "Cisco");
        manufacturerMap.put("00:23:33", "Cisco");
        manufacturerMap.put("00:23:5D", "Cisco");
        manufacturerMap.put("00:23:AB", "Cisco");
        manufacturerMap.put("00:24:14", "Cisco");
        manufacturerMap.put("00:24:97", "Cisco");
        manufacturerMap.put("00:24:C4", "Cisco");
        manufacturerMap.put("00:25:45", "Cisco");
        manufacturerMap.put("00:26:0B", "Cisco");
        manufacturerMap.put("00:26:98", "Cisco");
        manufacturerMap.put("00:50:F2", "Microsoft");
        manufacturerMap.put("00:15:5D", "Microsoft");
        manufacturerMap.put("00:17:FA", "Microsoft");
        manufacturerMap.put("00:1D:D8", "Microsoft");
        manufacturerMap.put("00:22:48", "Microsoft");
        manufacturerMap.put("00:25:AE", "Microsoft");
        manufacturerMap.put("00:03:7F", "Atheros");
        manufacturerMap.put("00:13:74", "Atheros");
        manufacturerMap.put("00:24:2B", "Hon Hai");
        manufacturerMap.put("00:23:4D", "Hon Hai");
        manufacturerMap.put("00:23:4E", "Hon Hai");
        manufacturerMap.put("00:22:69", "Hon Hai");
        manufacturerMap.put("00:1C:25", "Hon Hai");
        manufacturerMap.put("00:1D:D9", "Hon Hai");
    }

    public static String getManufacturer(String macAddress) {
        if (macAddress == null || macAddress.length() < 8) {
            return "Unknown";
        }

        // Convert MAC address to uppercase and get first 8 characters (XX:XX:XX)
        String prefix = macAddress.toUpperCase().substring(0, 8);

        // Look up manufacturer in the map
        for (Map.Entry<String, String> entry : manufacturerMap.entrySet()) {
            if (prefix.startsWith(entry.getKey())) {
                return entry.getValue();
            }
        }

        return "Unknown";
    }
}
