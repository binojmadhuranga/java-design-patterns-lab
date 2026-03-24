class UniversityCourse {
    private ReadingMaterial reading;
    private Assessment assessment;
    private Lecture lecture;
    // Just pass the desired factory
    public UniversityCourse(CourseMaterialFactory factory) {
        reading = factory.createReadingMaterial();
        assessment = factory.createAssessment();
        lecture = factory.createLecture();
    }
    public void startCourseSession() {
        System.out.println("=== Course session starting! ===");
        reading.read();
        lecture.attend();
        assessment.submit();
        System.out.println("Session complete. Great learning! \n");
    }
}