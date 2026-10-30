package com.example.classmath.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "students") //указывает на имя таблицы
public class UserEntity {
    @Id //помачает как primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String phone;
    @Column
    private String country;
    @Column
    private String city;
    @Column(name = "refresh_token") //название колонки в бд
    private String refreshToken;


    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }
}

