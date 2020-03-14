import java.util.List;

public class Student extends Person {

    private boolean placedInGroup;

    /**
     * Instantiates a new Student with more details.
     *
     * @param id          the id
     * @param firstName   the first name
     * @param lastName    the last name
     * @param phoneNumber the phone number
     * @param subjectList the subject list
     * @param hasGroup    if has group
     */
    public Student(int id, String firstName, String lastName, String phoneNumber, List<Subject> subjectList, boolean hasGroup) {
        super(id, firstName, lastName, phoneNumber, subjectList);
        this.placedInGroup = hasGroup;
    }

    /**
     * Instantiates a new Student with little details.
     *
     * @param id        the id
     * @param firstName the first name
     * @param lastName  the last name
     * @param hasGroup  the place in group
     */
    public Student(int id, String firstName, String lastName, boolean hasGroup) {
        super(id, firstName, lastName);
        this.placedInGroup = hasGroup;
    }

    public void setPlacedInGroup(boolean placedInGroup) {
        this.placedInGroup = placedInGroup;
    }

    @Override
    public String toString() {
        return "\nName : '" + this.getFirstName() + '\'' + ", Subjects suppose to read" + getSubjectList() + ", Placed in group : " + placedInGroup;
    }
}
