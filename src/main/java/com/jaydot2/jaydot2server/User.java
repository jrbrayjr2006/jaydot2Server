package com.jaydot2.jaydot2server;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

    private Integer id;
    private String fullName;
    private String email;
}
