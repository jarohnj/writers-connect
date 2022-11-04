package com.jarohnjohnson.writersconnect;

import java.util.List;

public class WritingGroup extends AbstractEntity {

    private List<User> users;

    public WritingGroup(List<User> users) {}

    public WritingGroup() {}

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
