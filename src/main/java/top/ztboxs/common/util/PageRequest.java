package top.ztboxs.common.util;

import lombok.Data;
import top.ztboxs.common.constant.CommonConstant;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/12/23:53
 * @Description: 分页请求
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private Integer current = 1;

    /**
     * 页面大小
     */
    private Integer pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
