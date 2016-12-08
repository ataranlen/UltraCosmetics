package be.isach.ultracosmetics.util;

/**
 * Created by Sacha on 6/03/16.
 */
public enum ServerVersion {

    v1_11_R1("1.11"), 
    v1_9_R1("1.9"), 
    v1_8_R3("1.8.8");

    String name;

    ServerVersion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
