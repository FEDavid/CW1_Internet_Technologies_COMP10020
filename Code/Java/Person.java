package com.spring_demo.coursework1;

public class Person {
    private Long id;
    private String name;
    private String occupation;
    private int age;
    private String image;

    public Person(Long id, String name, String occupation, int age, String image) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.image = image;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getOccupation() { return occupation; }
    public int getAge() { return age; }
    public String getImage() { return image; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setOccupation(String occupation) { this.occupation = occupation; }
    public void setAge(int age) { this.age = age; }
    public void setImage(String image) { this.image = image; }
}
