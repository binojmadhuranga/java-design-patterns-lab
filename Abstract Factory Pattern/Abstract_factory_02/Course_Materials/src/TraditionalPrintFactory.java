class TraditionalPrintFactory implements CourseMaterialFactory {
    public ReadingMaterial createReadingMaterial() {
        return new PrintedTextbook();
    }
    public Assessment createAssessment() {
        return new WrittenEssay();
    }
    public Lecture createLecture() {
        return new ClassroomLecture();
    }
}