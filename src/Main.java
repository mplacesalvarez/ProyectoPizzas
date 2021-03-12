public class Main {

    public static void main(String[] args) {
        Pizza baseBuilder = new BuilderPizzas()
                .setMasa("pan")
                .setRelleno(true)
                .build();

        Pizza rellenita = new BuilderPizzas()
                .setRelleno(true)
                .build();

        Pizza base = new BuilderPizzas().build();

        System.out.println(baseBuilder);
    }
}