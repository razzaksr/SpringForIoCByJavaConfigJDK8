package com.example.springboot8jdk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

public class Servicing {
    private Hai[] hais={
            new Hai(1,"abc",789),
            new Hai(1,"abc",789),
            new Hai(1,"abc",789),
    };

    public void display(){
        System.out.println(Arrays.toString(hais));
    }
}
