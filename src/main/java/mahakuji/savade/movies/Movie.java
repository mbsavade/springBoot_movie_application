package mahakuji.savade.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") // tells framework that this class contains all the document of movies collection
@Data //creates and handle all the getter setters
@AllArgsConstructor // creates a constructor that takes all the below-mentioned members as argument
@NoArgsConstructor // creates a default constructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //this will cause database to store only the id of reviews and reviews will be in other collections
    private List<Review> reviewIds;
}
