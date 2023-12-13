package top.ztboxs.common.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import top.ztboxs.common.constant.CommonConstant;

import java.util.List;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/12/23:17
 * @Description: 分页结果包装
 */
@Data
@ApiModel(value = "分页数据消息体", description = "分页数据统一对象")
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class PageResponse<T> {

    @ApiModelProperty(value = "总条目数", required = true)
    private Long counts;

    @ApiModelProperty(value = "页尺寸", required = true)
    private Integer pageSize;

    @ApiModelProperty(value = "总页数", required = true)
    private Long pages;

    @ApiModelProperty(value = "页码", required = true)
    private Integer current;

    @ApiModelProperty(value = "数据列表", required = true)
    private List<T> items;

}
