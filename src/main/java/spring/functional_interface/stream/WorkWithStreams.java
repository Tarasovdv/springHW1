package spring.functional_interface.stream;

import spring.functional_interface.stream.model.Faculty;
import spring.functional_interface.stream.model.Student;
import spring.functional_interface.stream.utils.NewApproach;

import java.util.List;

public class WorkWithStreams {
    public static void main(String[] args) {
        Student harryPotter = new Student("Harry Potter",2, Faculty.GRYFFINDOR);
        Student jennyWeasley = new Student("Jenny Weasley",1, Faculty.GRYFFINDOR);
        Student drakoMalfoy = new Student("Drako Malfoy",2, Faculty.SLYTHERIN);
        Student cedricDigory = new Student("Cedric Diggory",3, Faculty.HUFFLEPUFF);

//        List<Student> hogwardsStudents = OldApproach.generate(harryPotter,jennyWeasley,drakoMalfoy,cedricDigory);
        List<Student> hogwardsStudents = NewApproach.generate(harryPotter,jennyWeasley,drakoMalfoy,cedricDigory);

//        System.out.println(OldApproach.getGryffindorStudents(hogwardsStudents));
        System.out.println(NewApproach.getGryffindorStudents(hogwardsStudents));

        System.out.println(NewApproach.getCoursesGryffindorsStudents(hogwardsStudents));

    }
}
