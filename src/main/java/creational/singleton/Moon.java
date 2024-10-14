package creational.singleton;

public class Moon {

    private static Moon moon = new Moon();

    private Moon(){

    }

    public static Moon getMoon() {
        return moon;
    }

}
