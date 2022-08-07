package devices;

public enum Devices {

    ANDROID_OREO("src\\tes\\resources\\capabilities\\android-oreo.json");

    public String path;
    Devices(String path){
        this.path = path;
    }
}
