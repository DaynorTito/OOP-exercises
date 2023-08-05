import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import university.functions.Sortable;
import university.functions.Unique;
import university.objects.Student;

/**
 * UniArrayListTest.
 */
public class UniArrayListTest {
    @Test
    public void encapsulation() {
        var ints = new Integer[] {1, 2, 3};
        List<Integer> list = new UniArrayList<>(ints);
        ints[1] = 1;
        assertEquals("[1, 2, 3]", list.toString());
    }

    @Test
    public void addAt() {
        var ints = new Integer[] {1, 2, 3};
        List<Integer> list = new UniArrayList<>(ints);
        list.add(0, 4);
        assertEquals("[4, 1, 2, 3]", list.toString());
        list.add(4, 5);
        assertEquals("[4, 1, 2, 3, 5]", list.toString());
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void adding() {
        List<String> list = new UniArrayList<>();
        var size = 1_000_000;
        assertEquals(0, list.size());
        for (int i = 0; i < size; i++) {
            list.add(Integer.toString(i));
        }
        assertEquals(size, list.size());
        assertEquals("999999", list.get(size - 1));
    }

    @Test
    public void removing() {
        var chars = new Character[] {'a', 'b', 'c'};
        List<Character> list = new UniArrayList<>(chars);
        list.remove(Character.valueOf('b'));
        assertEquals("[a, c]", list.toString());
        list.add('b');
        assertEquals("[a, c, b]", list.toString());
        list.remove(Character.valueOf('a'));
        assertEquals("[c, b]", list.toString());
    }

    @Test
    public void removingAt() {
        var ints = new Integer[] {1, 2, 3};
        List<Integer> list = new UniArrayList<>(ints);
        Integer removed = list.remove(1);
        assertEquals(Integer.valueOf(2), removed);
        assertEquals("[1, 3]", list.toString());
        list.remove(Integer.valueOf(3));
        assertEquals("[1]", list.toString());
    }

    @Test
    void iterating() {
        var ints = new Integer[] {1, 2, 3};
        List<Integer> list = new UniArrayList<>(ints);
        int count = 1;
        for (Integer i : list) {
            assertEquals(count++, i);
        }
    }

    @Test
    void sorting() {
        var arrayStudents = new Student[] {
                new Student("S2", 100),
                new Student("S1", 51),
                new Student("S3", 50)
        };
        Sortable<Student> students = new UniArrayList<>(arrayStudents);

        assertEquals("[{S2,100}, {S1,51}, {S3,50}]", students.toString());

        students.sort();
        assertEquals("[{S1,51}, {S2,100}, {S3,50}]", students.toString());

        students.sortBy(Student.byGrade());
        assertEquals("[{S3,50}, {S1,51}, {S2,100}]", students.toString());

    }

    @Test
    void unique() {
        var arrayStudents = new Student[] {
                new Student("S2", 51),
                new Student("S2", 50),
                new Student("S2", 51),
                new Student("S2", 50)
        };
        Unique<Student> students = new UniArrayList<>(arrayStudents);
        students.unique();
        assertEquals("[{S2,51}, {S2,50}]", students.toString());
    }
}
