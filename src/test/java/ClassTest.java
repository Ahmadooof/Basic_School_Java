import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClassTest {

    List<Class> classList;

    @BeforeEach
    void init() {
        List<Student> listOfStudent_1 = new ArrayList<>();
        listOfStudent_1.add(new Student(1, "Student_1", "SFC", false));
        listOfStudent_1.add(new Student(2, "Student_1", "SFC", false));
        listOfStudent_1.add(new Student(3, "Student_1", "SFC", false));
        listOfStudent_1.add(new Student(4, "Student_1", "SFC", false));

        List<Student> listOfStudent_2 = new ArrayList<>();
        listOfStudent_2.add(new Student(5, "Student_1", "SFC", false));
        listOfStudent_2.add(new Student(6, "Student_1", "SFC", false));
        listOfStudent_2.add(new Student(7, "Student_1", "SFC", false));
        listOfStudent_2.add(new Student(8, "Student_1", "SFC", false));

        List<Student> listOfStudent_3 = Arrays.asList(
                new Student(9, "Student_1", "fwef", false),
                new Student(10, "Student_2", "gwe", false),
                new Student(11, "Student_3", "berb", false),
                new Student(12, "Student_4", "ger", false)
        );

        this.classList = new ArrayList<>();
        classList.add(new Class(1, "1A", 7, listOfStudent_1));
        classList.add(new Class(2, "1B", 7, listOfStudent_2));
        classList.add(new Class(3, "1C", 7, listOfStudent_3));
    }

    @Test
    void getStudentListWithRightIDNumber() {
        List<Student> expected = this.classList.get(0).getStudentListById(this.classList, 2);
        List<Student> actual = this.classList.get(1).getStudentList();
        Assertions.assertEquals(expected, actual, "This should return list of students by ID");
    }

    @Test
    void getStudentListWithWrongIDNumber() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> this.classList.get(0).getStudentListById(this.classList, 5));
    }

    /**
     * this method test the previous size of array list of students which were 4
     * after adding new student we expected that the size of the list will be 5
     */
    @Test
    void addStudentToClass() {
        Student a_New_Student = new Student(15, "Student_15", "LastName_1", false);
        this.classList.get(0).addStudentToClass(a_New_Student);
        int sizeListExpected = this.classList.get(0).getStudentList().size();
        Assertions.assertEquals(sizeListExpected, 5);
    }

    /**
     * this method test the previous size of array list of students which were 4
     * after deleting student we expected that the size of the list will be 3
     */
    @Test
    void removeStudentFromClassById() {
        this.classList.get(1).removeStudentFromClassById(6);
        int sizeListExpected = this.classList.get(1).getStudentList().size();
        Assertions.assertEquals(sizeListExpected, 3);
    }

}