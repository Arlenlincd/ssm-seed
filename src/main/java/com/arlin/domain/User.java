package com.arlin.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/7/18
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
}
