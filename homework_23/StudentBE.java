package com.proftelran.org.homework_23;

//В данном классе должно быть получено только поле name
//префикс BE
@StudentPrefix("BE")
public class StudentBE extends AbstractStudent {
@FieldPrefix("Name")
    private final String name;
@FieldPrefix("Surname")
    private final String surname;

    public StudentBE() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
    }
}