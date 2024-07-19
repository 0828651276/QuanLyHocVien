import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLysinhVien {
    public static void main(String[] args) {
        List<HocsinhGioi> students = new ArrayList<>();
        students.add(new HocsinhGioi("1", "Alice", 17, "A1", "alice@example.com", 9.0, 8.5, 9.5));
        students.add(new HocsinhGioi("2", "Bob", 18, "A2", "bob@example.com", 8.0, 7.5, 8.5));
        students.add(new HocsinhGioi("3", "Charlie", 17, "A3", "charlie@example.com", 8.5, 9.0, 9.0));

        Collections.sort(students);

        System.out.println("Danh sách học sinh giỏi giảm dần:");
        for (HocsinhGioi student : students) {
            System.out.println(student);
        }

        System.out.println("\nHọc sinh giỏi có tổng điểm cao nhất:");
        System.out.println(students.get(0));
    }
}