package com.example.demo;


import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int sum(int x, int y) {
        return x + y;
    }

}
