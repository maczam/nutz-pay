package org.nutz.pay.util;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Jianghao on 2017/4/17
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Util {

    /**
     * Map排序
     *
     * @param params 待排序对象
     * @param order  排序后的对象
     * @return
     */
    public static Map<String, Object> sorting(Map<String, Object> params, String order) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            Map<String, Object> map = new LinkedHashMap<>();
            if (Strings.equalsIgnoreCase(order, "desc")) {
                params.entrySet().stream()
                        .sorted(Map.Entry.<String, Object>comparingByKey().reversed())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            } else {
                params.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            }
            return map;
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @param f      过滤字段
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params, String[] f) {

        if (Lang.isEmpty(f)) {
            return buildParmas(params);
        } else {
            Arrays.asList(f).stream().forEach(params::remove);
            return buildParmas(params);
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            params = Util.sorting(params, "asc");
            StringBuffer sb = new StringBuffer();
            params.forEach((k, v) -> sb.append(k + "=" + v + "&"));
            return Strings.removeLast(sb.toString(), '&');
        }
    }

}
