package com.itheima.entity;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Manager {
    Integer manager_id;
    String manager_name;
    String manager_password;
    String manager_state;
}
