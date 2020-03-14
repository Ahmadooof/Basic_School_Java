import java.util.List;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private List<Subject> subjectList;

    /**
     * Instantiates a new Person regardless if Student or Teacher, they have almost same attributes.
     *
     * @param id          the id
     * @param firstName   the first name
     * @param lastName    the last name
     * @param phoneNumber the phone number
     * @param subjectList the subject list
     */
    public Person(int id, String firstName, String lastName, String phoneNumber, List<Subject> subjectList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.subjectList = subjectList;
    }

    /**
     * Instantiates a new Person Student or Teacher with less details for testing.
     *
     * @param id        the id
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * this method excutes from the Teacher side.
     *
     * @return Teacher details.
     */
    @Override
    public String toString() {
        return "\nName : '" + firstName + '\'' +
                " Teaching subjects : " + subjectList;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    protected List<Subject> getSubjectList() {
        return subjectList;
    }

    /**
     * this method add new subject for student to learn or for teacher to teach.
     *
     * @param newSubject the new subject
     */
    public void addSubjectToPerson(Subject newSubject) {
        this.subjectList.add(newSubject);
    }

}
