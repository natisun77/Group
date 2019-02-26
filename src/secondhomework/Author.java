package secondhomework;

import java.util.ArrayList;
import java.util.List;
//2.4
final class Author {
    final int pages;
    final String name;
    final List<Story> stories;

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public List<Story> getStories() {
        return new ArrayList<Story>(stories);
    }

    private Author(int pages, String name, ArrayList<Story> stories) {
        this.pages = pages;
        this.name = name;
        this.stories = new ArrayList<Story>(stories);
    }

    final static class Story {
        final private String name;
        final private int year;

        private Story(String name, int year) {
            this.name = name;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("Globe", 1994));

        Author ivanov = new Author(10, "Abc", stories);
        ivanov.getStories().add(new Story("iii", 3000));
        System.out.println(ivanov.getStories().size());

    }

}
