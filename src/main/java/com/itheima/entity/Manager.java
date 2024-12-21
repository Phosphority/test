package com.itheima.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Component("manager")
public class Manager {
    Integer manager_id;
    String manager_name;
    String manager_password;
    String manager_state;
}
