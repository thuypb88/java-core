import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentForm {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        int age = 0;
        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                age = Integer.parseInt(sc.nextLine());
                if (age > 0 && age <= 100) {
                    break;
                } else {
                    System.out.println("Tuổi phải nằm trong khoảng từ 1 đến 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ.");
            }
        }
        System.out.print("Nhập môn học: ");
        String subject = sc.nextLine();

        String email = "";
        while (true) {
            try{
                System.out.print("Nhập email: ");
                email = sc.nextLine();
                String regex = "^(.+)@(.+)$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    break;
                } else {
                    System.out.println("Email chưa hợp lệ. Email phải chứa ký tự '@' và '.'. Phải có ít nhất một ký tự trước và sau '@'");
                }
            } catch (NumberFormatException e){
                System.out.println("Vui lòng email có chứa @ hợp lệ.");
            }
        }

        System.out.println("\nDữ liệu sinh viên đã nhập:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Môn học: " + subject);
        System.out.println("Email: " + email);

        sc.close();
    }
}

