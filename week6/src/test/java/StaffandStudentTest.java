import org.junit.Test;
public class StaffandStudentTest {
    @Test
    public void TestString() {
        Person newP = new Person("An", "Cau Giay");
        Student newS = new Student("Binh", "hhhhh", "IT", 1999, 12.96);
        Staff newSf = new Staff("Chien", "llllll", "oxx", 789.321);
        System.out.println(newP.toString());
        System.out.println(newS.toString());
        System.out.println(newSf.toString());
    }
}
