package in.nexogen.comparatorExamples;


import java.util.Comparator;

/**
 * Created by dv on 4/8/17.
 */

// Comparable object is capable of comparing itself with another object
// A class itself must implements the java.lang.Comparable interface to compare its instance
public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Movie(String name, double rating, int year) {
        setRating(rating);
        setName(name);
        setYear(year);
    }

    @Override
    public String toString() {
        return getName() + " " + getRating() + " " + getYear();
    }

    @Override
    public int compareTo(Movie movie) {
        return this.getYear() - movie.getYear();
    }
}

class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
            if (m1.getRating() < m2.getRating())
                return -1;
            if (m1.getRating() > m2.getRating())
                return 1;
            else
                return 0;
        }
}

class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
