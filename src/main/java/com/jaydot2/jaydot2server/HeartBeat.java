package com.jaydot2.jaydot2server;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeartBeat {

    private String status;

    @Override
    public String toString() {
        return "HeartBeat status is " + status;
    }
}
