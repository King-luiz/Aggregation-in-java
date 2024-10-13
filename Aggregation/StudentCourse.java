public class StudentCourse {
    // Declare instance variables for registration number, full names, and a Course object
    String regNo;
    String fullNames;
    Course course;  // Aggregation: Course object as part of StudentCourse

    // Constructor to initialize registration number, full names, and course
    public StudentCourse(String regNo, String fullNames, Course course) {
        this.regNo = regNo;
        this.fullNames = fullNames;
        this.course = course;  // Assign the Course object
    }

    // Setter for regNo
    public void setRegNo(String newReg) {
        this.regNo = newReg;
    }

    // Getter for regNo
    public String getRegNo() {
        return this.regNo;
    }

    // Setter for fullNames
    public void setName(String newName) {
        this.fullNames = newName;
    }

    // Getter for fullNames
    public String getName() {
        return this.fullNames;
    }

    // Setter for course (object of type Course)
    public void setCourse(Course obj) {
        this.course = obj;
    }

    // Getter for course (returns object of type Course)
    public Course getCourse() {
        return this.course;
    }

    // Method to print student details and their course information
    public String printD() {
        return "Full Name: " + fullNames + "\n" + getCourse().toString();  // Uses Course's toString method
    }
}
