public class Course {
    // Declare instance variables for unit code and unit title
    String unitCode;
    String unitTitle;

    // Constructor to initialize unit code and unit title
    public Course(String unitCode, String unitTitle) {
        // Initialize variables using setters (encouraged for validation or future flexibility)
        setUnitcode(unitCode);  // Uses the setter method for unit code
        setUnitTitle(unitTitle);  // Uses the setter method for unit title
    }

    // Setter for unitCode
    public void setUnitcode(String newUnitCode) {
        this.unitCode = newUnitCode;
    }

    // Setter for unitTitle
    public void setUnitTitle(String newUnitTitle) {
        this.unitTitle = newUnitTitle;
    }

    // Getter for unitCode
    public String getUnitcode() {
        return this.unitCode;
    }

    // Getter for unitTitle
    public String getUnitTitle() {
        return this.unitTitle;
    }

    // toString method to print unit details
    public String toString() {
        return "UNIT CODE: " + unitCode + "\nUNIT TITLE: " + unitTitle;
    }
}
