package com.jarohnjohnson.writersconnect;

import java.util.ArrayList;
import java.util.List;

public class User extends AbstractEntity {

    private String username;
    private String password;
    private String email;

    private List<WritingGroup> writingGroups;

    public User(String username, String password, String email, List<WritingGroup> writingGroups) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.writingGroups = writingGroups;
    }

    public User(){
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<WritingGroup> getWritingGroups() {
        return writingGroups;
    }

    public void setWritingGroups(List<WritingGroup> writingGroups) {
        this.writingGroups = writingGroups;
    }
}
