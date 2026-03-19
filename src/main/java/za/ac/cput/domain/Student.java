package za.ac.cput.domain;

public class Student extends User {
    private String studentNumber;
    private String faculty;
    private String department;
    private int yearOfStudy;
    //TODO: add booking attribute once booking class exists
    public Student(Builder builder){
        super(builder);
        this.studentNumber = builder.studentNumber;
        this.faculty = builder.faculty;
        this.department = builder.department;
        this.yearOfStudy = builder.yearOfStudy;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userId='" + getUserId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", department='" + department + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", role=" + getRole() +
                '}';
    }

    public static class Builder extends User.Builder<Builder>{
        private String studentNumber;
        private String faculty;
        private String department;
        private int yearOfStudy;

        public Builder setStudentNumber(String studentNumber){
            this.studentNumber = studentNumber;
            return this;
        }
        public Builder setFaculty(String faculty){
            this.faculty = faculty;
            return this;
        }
        public Builder setDepartment(String department){
            this.department = department;
            return this;
        }
        public Builder yearOfStudy(int yearOfStudy){
            this.yearOfStudy = yearOfStudy;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Student build() {
            this.setRole(RoleEnum.STUDENT);
            return new Student(this);
        }
    }
}
