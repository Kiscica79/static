public class Main {
    public static void main(String[] args) {

        // példányosísd 3x a persont
        Person ember = new Person();
        Person masikEmber = new Person();
        Person harmadikEmber = new Person();


        // kérd le a statikus fieldet
        System.out.println(Person.getPopular());

        // példányosísd még 1 szer
        Person negyedikEmber = new Person();

        // kérd le a statikus fieldet
        System.out.println(Person.getPopular());

        // hívd meg a katasztrofa metódust
        System.out.println(Person.catastrophe());

    }
}