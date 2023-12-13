package top.ztboxs.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/13/0:17
 * @Description: SQL工具
 */
public class SqlUtils {
    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }
}
