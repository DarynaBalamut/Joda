package MobilePhoneTask;

public class MobilePhoneTester {
    public static void main(String[] args) {
    MobilePhone samsung = new MobilePhone("Samsung", "Galaxy", 1000, 500);
    samsung.installApplication("Google maps", 100);
    samsung.installApplication("Tinder", 200);
    samsung.installApplication("Pokemon G" , 250);
    samsung.use("YouTube", 5);
    samsung.use("FaceBook" , 6);
    samsung.use("Angry Birds", 2);
    samsung.charge();
    samsung.use("Angry Birds", 2);
    samsung.installApplication("Test of max capacity", 550);
    samsung.use("Ololo", 10);
    samsung.charge();
    samsung.use("Ololo", 10);
    samsung.charge();
    samsung.use("zoom", 0);
    samsung.use("zoom", 3);
    }
}
