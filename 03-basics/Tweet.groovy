import java.time.LocalDate

/**
* Tweet class
*/
@groovy.transform.ToString
class Tweet {

    String username // @therealdanvega
    String text
    Integer retweets
    Integer favorites
    Integer zero
    LocalDate createdOn

    Tweet(String user, String tweet) {
        zero = 0
        username = user
        text = tweet
        retweets = zero
        favorites = zero
        createdOn = LocalDate.now()
    }

    void addToRetweets() {
        retweets += 1
    }
    void addToFavorites() {
        favorites += 1
    }

}
