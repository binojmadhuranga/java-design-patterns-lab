class ModernDigitalFactory implements CourseMaterialFactory {
    public ReadingMaterial createReadingMaterial() {
        return new EBook();
    }
    public Assessment createAssessment() {
        return new OnlineQuiz();
    }
    public Lecture createLecture() {
        return new VideoLecture();
    }
}