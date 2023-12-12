package com.mezo.trainin.dataSource;

public class FakeDataSource {

    private final String username;
    private final String password;
    private final String url;

    public FakeDataSource(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
