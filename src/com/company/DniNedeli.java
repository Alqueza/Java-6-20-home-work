package com.company;

public enum DniNedeli {
    Monday("Дуйшомбу","Дуйшомбу куну Техникалык сабак отот."), //Duyshombu
    Tuesday("Шейшемби","Шейшемби куну Java окуйм."), //Sheyshembi
    Wednesday("Шаршемби","Шаршемби куну Софт скиллс сабагын окуйм."), //Sharshembi
    Thursday("Бейшемби","Бейшемби куну Англис тили сабагы болот."), //Beyshembi
    Friday("Жума","Жума куну Онлайн сабагы болот."), //Juma
    Saturday("Ишемби","Ишемби куну кошумча сабак болот."), //Ishembi
    Sunday("Жекшемби","Жекшемби куну сабак болбойт."); //jekshebi

    private String Day;
    private String learningLesson;

    DniNedeli() {
    }

    DniNedeli(String Day, String learningLesson) {
        this.Day = Day;
        this.learningLesson = learningLesson;

    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getLearningLesson() {
        return learningLesson;
    }

    public void setLearningLesson(String learningLesson) {
        this.learningLesson = learningLesson;
    }

    @Override
    public String toString() {
        return "\nDay: " + Day +
                "\nLearning Lesson: " + learningLesson;
    }
}