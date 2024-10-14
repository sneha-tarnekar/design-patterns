package creational.singleton;

public class Test {

    public static void main(String[] args) {

        Sun sun1 = Sun.getSun();
        System.out.println(sun1.hashCode());

        Sun sun2 = Sun.getSun();
        System.out.println(sun2.hashCode());

        System.out.println();

        Moon moon1 = Moon.getMoon();
        System.out.println(moon1.hashCode());

        Moon moon2 = Moon.getMoon();
        System.out.println(moon2.hashCode());

    }

}
