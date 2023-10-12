public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kitty", 5, 55  );
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("KitKat", 8, 23.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
