package com.proftelran.org.homework_23;

//В данном классе должно быть получено только поле number
//префикс QA
@StudentPrefix("QA")
public class StudentQA extends AbstractStudent {

    private final String name;

    private final String surname;
    @FieldPrefix("Number")
    private String number;

    public StudentQA() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
        number = NameUtil.getRandomNumber();
    }
}