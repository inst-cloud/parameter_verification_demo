package com.example.parameter_verification_demo.entity.param;

import lombok.Data;

import javax.validation.constraints.Pattern;

/**
 * 修改密码
 * @author aaron
 * @since 2021-06-22
 */
@Data
public class PasswordParam {

    /**
     * 密码
     */
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{8,10}$",message = "必须包含大小写字母和数字的组合，不能使用特殊字符，长度在 8-10 之间")
    private String password;

}
