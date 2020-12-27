public class Person {
    private String name;
    private String birthDay;
    private String peopleId;

    public Person(String name, String birthDay, String peopleId) {
        this.name = name;
        this.birthDay = birthDay;
        this.peopleId = peopleId;
    }

    public String getPeopleId() {
        return peopleId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", peopleId='" + peopleId + '\'' +
                '}';
    }
}
