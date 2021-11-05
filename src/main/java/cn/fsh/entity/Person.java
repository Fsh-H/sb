package cn.fsh.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author FSH
 * version 1.0
 */
public class Person {
    private Integer id;
    private String name;
    private String[] alias;
    private List<String> hobbies;
    private Map<String,String> relatives;
    private Role role;
    private List<Person> friends;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getRelatives() {
        return relatives;
    }

    public void setRelatives(Map<String, String> relatives) {
        this.relatives = relatives;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias=" + Arrays.toString(alias) +
                ", hobbies=" + hobbies +
                ", relatives=" + relatives +
                ", role=" + role +
                ", friends=" + friends +
                '}';
    }
}
