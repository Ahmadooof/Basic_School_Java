import java.util.List;

public class Teacher extends Person {

    /**
     * Instantiates a new Teacher.
     *
     * @param id          the id
     * @param firstName   the first name
     * @param lastName    the last name
     * @param phoneNumber the phone number
     * @param subjectList the subject list
     */
    public Teacher(int id, String firstName, String lastName, String phoneNumber, List<Subject> subjectList) {
        super(id, firstName, lastName, phoneNumber, subjectList);
    }

}
