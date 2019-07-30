package com.example.demo.api;

import com.example.demo.dto.BaseDTO;
import com.example.demo.dto.HumanDTO;

public interface DemoApi {
    public String test (Class<? extends BaseDTO> dto);
}
