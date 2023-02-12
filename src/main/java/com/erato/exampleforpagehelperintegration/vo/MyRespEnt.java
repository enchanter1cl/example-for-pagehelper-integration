package com.erato.exampleforpagehelperintegration.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.HashMap;

/**
 * @author ZhangYuan
 * @date 2023/2/12
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MyRespEnt<T> {
    
    private static final long serialVersionUID = 1L;
    
    Integer code;
    
    String message;
    
    T data;

    public static MyRespEnt ok(){
        return new MyRespEnt().setCode(200).setMessage("success!");
    }

}
