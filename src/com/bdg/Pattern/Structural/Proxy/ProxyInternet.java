package com.bdg.Pattern.Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites =new ArrayList<String>();
        bannedSites.add("aaa.com");
        bannedSites.add("bbb.com");
        bannedSites.add("ccc.com");
        bannedSites.add("ddd.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())){
            throw new Exception("Access denied");
        }
        internet.connectTo(serverHost);
    }
}
