// Cian Byrne
// 10/30/26


package pkg; 
public class Movie{
    private String movie;
    private double rating;
    private int ratingnum;
    private int revenue;


    public Movie(){
        movie = "Avengers";
        rating = 8.0;
        ratingnum = 33;
        revenue = 623357910;
    }

    public Movie(String a, double b, int c, int d){
        movie = a;
        rating = b;
        ratingnum = c;
        revenue = d;
    }

    public void movieToString(){
        System.out.println("Movie: " + movie);
        System.out.println("Rating: " + rating);
        System.out.println("Number of ratings: " + ratingnum);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
    
    }

    public String getMovieName(){
        return movie;
    }


    public int getRevenue(){
        return revenue;
    }
    public double addRating(double a){
        ratingnum = ratingnum + 1;
        rating = (((ratingnum * rating)+a)/ratingnum);
        return rating;
    }

    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie a){
        if (rating>a.getRating()){
            return true;
        }
        else return false;
    }

}