package homework.second;
//2.4
import java.util.ArrayList;

public class AuthorMain {
    public static void main(String[] args) {
        ArrayList<Author.Story> stories = new ArrayList<>();
        stories.add(new Author.Story("Globe", 1994));

        Author ivanov = new Author(10, "Abc", stories);
        ivanov.getStories().add(new Author.Story("iii", 3000));
        System.out.println(ivanov.getStories().size());

    }
}
