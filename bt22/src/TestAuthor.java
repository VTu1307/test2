public class TestAuthor {
    public static void main(String[] args) {
        Author Vtu = new Author("Vtu", "tutv.24ite@vku.udn.vn", 'm');
        System.out.println(Vtu);  // Test toString()
        Vtu.setEmail("tutv.24ite@vku.udn.vn");  // Test setter
        System.out.println("Name is: " + Vtu.getName());     // Test getter
        System.out.println("Email is: " + Vtu.getEmail());   // Test getter
        System.out.println("Gender is: " + Vtu.getGender()); // Test getter
    }
}