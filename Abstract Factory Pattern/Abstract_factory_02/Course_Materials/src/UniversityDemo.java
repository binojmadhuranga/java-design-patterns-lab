public class UniversityDemo {
    public static void main(String[] args) {
        // Instructor chose Modern style
        CourseMaterialFactory modernFactory = new ModernDigitalFactory();
        UniversityCourse modernCourse = new UniversityCourse(modernFactory);
        modernCourse.startCourseSession();
        // Instructor chose Traditional style
        CourseMaterialFactory traditionalFactory = new TraditionalPrintFactory();
        UniversityCourse traditionalCourse = new UniversityCourse(traditionalFactory);
        traditionalCourse.startCourseSession();
    }
}