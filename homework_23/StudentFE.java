package com.proftelran.org.homework_23;

//В данном классе должно быть получено только поле surname
//префикс FE
@StudentPrefix("FE")
public class StudentFE extends AbstractStudent {
    @FieldPrefix("Name")
    private final String name;
    @FieldPrefix("SurName")
    private final String surname;

    public StudentFE() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
    }
}