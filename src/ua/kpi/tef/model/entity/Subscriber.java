package ua.kpi.tef.model.entity;

public class Subscriber {
    private String surname;
    private String name;
    private String patronymic;
    private String nickName;
    private String fullName;

    public Subscriber(String surname, String name, String patronymic, String nickName) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.nickName = nickName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFullName() {
        return surname + " " + name.substring(0,1) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriber that = (Subscriber) o;

        if (!surname.equals(that.surname)) return false;
        if (!name.equals(that.name)) return false;
        if (!patronymic.equals(that.patronymic)) return false;
        return nickName.equals(that.nickName);
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + patronymic.hashCode();
        result = 31 * result + nickName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickName='" + nickName + '\'' +
                ", fullName='" + getFullName() + '\'' +
                '}';
    }
}
