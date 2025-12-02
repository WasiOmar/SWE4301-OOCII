public class LibraryManagementSystem {
    public static void main(String[] args) throws Exception {
        Library library = new Library();

        Book book1 = new Book("Brave New World", "Aldous Huxley", "1111111111", 8.50);
        Book book2 = new Book("Clean Code", "Robert C. Martin", "2222222222", 29.99);

        library.addBook(book1);
        library.addBook(book2);

        Student student = new Student("Wasui", "wasui@example.com");
        Faculty faculty = new Faculty("Dr. Rahman", "rahman@iut-dhaka.edu");

        library.addMember(student);
        library.addMember(faculty);

        student.borrowBook(book2);
        faculty.borrowBook(book1);

        library.printPersonDetails(student);
        library.printPersonDetails(faculty);
    }
}