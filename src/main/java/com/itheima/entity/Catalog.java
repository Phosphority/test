package com.itheima.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Catalog {
    private int id;
    private String name;
    private String number;
    private String state;
}
