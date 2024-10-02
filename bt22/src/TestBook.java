public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Van Tu", "tranvantu13072006@gmail.com", 'm');
        authors[1] = new Author("Tutv", "tutv.24ite@vuk.udn.vn", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy.getAuthName());  // toString()
    }
}