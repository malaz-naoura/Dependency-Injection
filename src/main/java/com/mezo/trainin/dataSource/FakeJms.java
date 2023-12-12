package com.mezo.trainin.dataSource;

public class FakeJms {

    private final String username;
    private final String password;

    public FakeJms(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "FakeJms{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
