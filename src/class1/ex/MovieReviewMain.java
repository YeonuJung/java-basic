package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview 인셉션 = new MovieReview();
        인셉션.title = "인셉션";
        인셉션.review = "인생은 무한 루프";
        MovieReview 어바웃타임 = new MovieReview();
        어바웃타임.title = "어바웃 타임";
        어바웃타임.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {인셉션, 어바웃타임};
        for(MovieReview mr : movieReviews){
            System.out.println("영화 제목: " + mr.title + ", 리뷰: " + mr.review);
        }
    }
}
