package com.example.demo.dto;

public class StudentDTO<T extends HumanDTO> extends BaseDTO {

    private T persion;

    public void say() {
        persion.say();
    }
}
