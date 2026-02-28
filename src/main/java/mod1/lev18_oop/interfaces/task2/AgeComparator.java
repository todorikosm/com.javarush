package mod1.lev18_oop.interfaces.task2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        int i = 0;
        if (student1.getAge() > student2.getAge()) {
            i = -1;
        } else if (student1.getAge() < student2.getAge()) {
            i = 1;
        } else if (student1.getAge() == student2.getAge()) {
            i = 0;
        }
        return i;
    }
}
