package com.example.ecommerce.Dto;

public class UserDto {
    private String username;
    private String password;
    // 기타 필요한 필드 추가 가능

    // 기본 생성자
    public UserDto() {
    }

    // 모든 필드를 포함하는 생성자
    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter와 Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString, equals, hashCode 메소드 구현 가능
}
