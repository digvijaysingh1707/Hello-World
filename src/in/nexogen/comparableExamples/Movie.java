package in.nexogen.comparableExamples;

/**
 * Created by dv on 4/8/17.
 */
public class Movie implements Comparable<Movie> {
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
