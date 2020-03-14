import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GroupTest {

    // all groups include small and big school classes.
    Group allGroups;

    @BeforeEach
    void init() {
        List<Subject> subjectList_For_Students = Arrays.asList(
                new Subject(1, "Math"),
                new Subject(1, "Science"),
                new Subject(1, "English"),
                new Subject(1, "Physics")
        );

        List<Student> students_1 = Arrays.asList(
                new Student(1, "Student_1", "aaa", "072",
                        subjectList_For_Students, false),
                new Student(2, "Student_2", "bbb", "072",
                        subjectList_For_Students, false),
                new Student(3, "Student_3", "ccc", "072",
                        subjectList_For_Students, false),
                new Student(4, "Student_4", "ddd", "072",
                        subjectList_For_Students, false)
        );
        List<Student> students_2 = Arrays.asList(
                new Student(5, "Student_5", "eee",
                        "072", subjectList_For_Students, false),
                new Student(6, "Student_6", "fff",
                        "072", subjectList_For_Students, false),
                new Student(7, "Student_7", "ggg",
                        "072", subjectList_For_Students, false),
                new Student(8, "Student_8", "hhh",
                        "072", subjectList_For_Students, false)
        );

        List<Student> students_3 = Arrays.asList(
                new Student(1, "student1", "aaa",
                        "072", subjectList_For_Students, false),
                new Student(2, "student2", "bbb",
                        "072", subjectList_For_Students, false),
                new Student(3, "student3", "ccc",
                        "072", subjectList_For_Students, false),
                new Student(4, "student4", "ddd",
                        "072", subjectList_For_Students, false)
        );

        List<Class> classListForBigSchools = Arrays.asList(
                new Class(1, "1A", 7, students_1),
                new Class(2, "1B", 7, students_2)
        );

        List<Integer> gradeLevelList_ForSmallSchool_1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> gradeLevelList_ForSmallSchool_2 = Arrays.asList(1, 2);

        List<Class> classListForSmallSchools = Arrays.asList(
                new Class(1, "1A", gradeLevelList_ForSmallSchool_1, students_1),
                new Class(2, "1B", gradeLevelList_ForSmallSchool_2, students_3)
        );

        List<Subject> subjectList_1 = Arrays.asList(
                new Subject(1, "Math"),
                new Subject(1, "Science")
        );

        List<Subject> subjectList_2 = Arrays.asList(
                new Subject(1, "English"),
                new Subject(1, "Physics")
        );

        List<Teacher> teacherList_1 = Arrays.asList(
                new Teacher(1, "Teacher1", "Lo", "072", subjectList_1),
                new Teacher(2, "Teacher2", "Li", "072", subjectList_2)
        );

        List<Teacher> teacherList_2 = Arrays.asList(
                new Teacher(3, "Teacher3", "Le", "072", subjectList_1)
        );

        List<Group> groupList = Arrays.asList(
                new Group(1, teacherList_1, classListForBigSchools, false),
                new Group(2, teacherList_2, classListForBigSchools, false),
                new Group(1, teacherList_1, classListForSmallSchools, false)
        );
        allGroups = new Group(groupList);
    }

    @Test
    public void printExistingGroups() {
        allGroups.printExistingGroups();
    }

}