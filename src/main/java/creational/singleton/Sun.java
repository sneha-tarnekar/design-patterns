package creational.singleton;

public class Sun {

    // Lazy way of creating singleton object
    private static Sun sun;

    private Sun() {
    }

    public static Sun getSun() {
        if(sun == null) {
            sun = new Sun();
        }
        return sun;
    }

}
