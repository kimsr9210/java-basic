package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview movie = new MovieReview();
        movie.title = "서울에봄";
        movie.review = "이럴수가";

        System.out.println("영화제목 : "+ movie.title + ", 리뷰 : " + movie.review );
    }
}
