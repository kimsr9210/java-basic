package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] review = new MovieReview[2];

        MovieReview movie = new MovieReview();
        movie.title = "서울에봄";
        movie.review = "이럴수가";
        review[0] = movie;

        MovieReview movie2 = new MovieReview();
        movie2.title = "아바타2";
        movie2.review = "경이로움";
        review[1] = movie2;

        for(MovieReview r : review){
            System.out.println("영화제목 : "+ r.title + ", 리뷰 : " + r.review );
        }
    }
}
