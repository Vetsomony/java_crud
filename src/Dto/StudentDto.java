package Dto;

public class StudentDto {
    private int id;
    private String name;
    private int  age;

    private String pod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public StudentDto(int id, String name, int age, String pod) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pod = pod;
    }

    @Override
    public String toString() {
        return String.format("| %-5s | %-20s | %-5s | %-7s | ", id, name, age, pod);

    }
}
