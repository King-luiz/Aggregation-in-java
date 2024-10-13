public class StudentRegMain {
    public static void main(String[] args) {
        // Example using new Course objects directly
        System.out.println("\n========= Using New Course Instances ==========");
        StudentCourse dan = new StudentCourse("G127/001/2023", "Daniel Nzioki", new Course("SCI220", "Programming in Python"));  // Pass new Course object
        StudentCourse kip = new StudentCourse("G127/2234/2023", "Kipkirui Jang", new Course("SCI303", "Web Programming"));  // Pass new Course object
        
        System.out.println("\n___________________________");
        System.out.println(dan.printD());  // Print details for 'dan'
        System.out.println("_____________________________");
        System.out.println(kip.printD());  // Print details for 'kip'

        System.out.println("\n================================");

        // Example creating Course objects first, then passing them to StudentCourse
        System.out.println("===== Create Course Objects First =====");
        Course courseA = new Course("SCI220", "Programming in Python");
        Course courseB = new Course("SCI303", "Web Programming");

        StudentCourse dann = new StudentCourse("G127/001/2023", "Daniel Nzioki", courseA);  // Pass pre-created Course object
        System.out.println(dann.printD());
        System.out.println("_____________________________");

        StudentCourse kipp = new StudentCourse("G127/2234/2023", "Kipkirui Jang", courseB);  // Pass pre-created Course object
        System.out.println(kipp.printD());
        System.out.println("================================");
    }
}
