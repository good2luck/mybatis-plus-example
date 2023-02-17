package top.xudj.mp.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {

    /**
     * 如果配置type = IdType.ASSIGN_ID，默认雪花算法，可以实现IdentifierGenerator自定义
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer age;
    private String email;

    private String telPhone;

    @TableLogic
    private int deleted;

}
