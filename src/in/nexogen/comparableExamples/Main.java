package in.nexogen.comparableExamples;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dv on 4/8/17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> arrayList = new ArrayList<Movie>();
        arrayList.add(new Movie("Force Awakens", 8.3, 2015));
        arrayList.add(new Movie("Star Wars", 8.7, 1977));
        arrayList.add(new Movie("Empire Strikes Back", 8.8, 1980));
        arrayList.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Movies before sorting : ");
        System.out.println();

        for (Movie movie:arrayList) {
            System.out.println(movie.toString());
        }

        Collections.sort(arrayList);

        System.out.println();
        System.out.println("Movies after sorting according to year : ");
        System.out.println();

        for (Movie movie:arrayList) {
            System.out.println(movie.toString());
        }
    }
}
