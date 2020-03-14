public class Subject {

    private int id;
    private String title;

    /**
     * Instantiates a new Subject.
     *
     * @param id    the id
     * @param title the title
     */
    public Subject(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
