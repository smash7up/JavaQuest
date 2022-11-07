import java.util.Arrays;

public class Movies {
    public static void main(String[] args) {
        String[] moviesTitle = {"Indiana Jones et le royaume du crâne de cristal", "Indiana Jones et la dernière croisade", "Indiana Jones et le temple maudit"};
        String[] actor1 = {"Joe", "Jack", "John"};
        String[] actor2 = {"Alex", "Amel", "Ary"};
        String[] actor3 = {"Bob", "Bruce", "Bat"};

        String[][] actors = {
                actor1,
                actor2,
                actor3
        };

        for (int i = 0; i < moviesTitle.length; i++) {
            System.out.print("Dans le film " + moviesTitle[i] + "les acteurs principaux sont");
            for (String actor: actors[i]) {
                System.out.print(" " + actor);
            }
            System.out.println(" ");
        }

    }
}
