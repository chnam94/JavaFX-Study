package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class PeopleDataModel {
    // Property
    // : Generic interface that defines the methods common to all (writable) properties independent of their type.
    // int, string 은 각자 다른 자료형이기 때문에 property라는 추상 객체를 상속받아 공통적으로 접근 가능하게 함

    private IntegerProperty id;
    private StringProperty name;
    private StringProperty school;

    public PeopleDataModel(
            IntegerProperty id,
            StringProperty name,
            StringProperty school
    )
    {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public IntegerProperty getId()
    {
        return this.id;
    }

    public StringProperty getName()
    {
        return this.name;
    }

    public StringProperty getSchool()
    {
        return this.school;
    }

}
