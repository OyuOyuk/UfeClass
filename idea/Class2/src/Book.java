public class Book {

    private String Author;
    private String Title;
    private String PublishedDate;
    private String Genre;
    public Book( String Author, String Title, String PublishedDate, String Genre) {
        this.Author = Author;
        this.Title = Title;
        this.PublishedDate = PublishedDate;
        this.Genre = Genre;

    }
    public String getAuthor() {
        return Author;
    }
    public String getTitle() {
        return Title;
    }
}
