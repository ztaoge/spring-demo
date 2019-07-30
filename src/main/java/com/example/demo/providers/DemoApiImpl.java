package com.example.demo.providers;

import com.example.demo.api.DemoApi;
import com.example.demo.dto.BaseDTO;
import com.example.demo.dto.DemoDTO;
import com.example.demo.dto.HumanDTO;
import com.example.demo.dto.StudentDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class DemoApiImpl {

    public String test(HumanDTO dto) {

        dto.say();
        return "hello world ztaoge !!!";
    }


}
