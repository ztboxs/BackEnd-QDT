package top.ztboxs.user.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/12/21:55
 * @Description: 删除请求
 */
@Data
public class DeleteRequestDto implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;

}
