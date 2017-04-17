package org.nutz.pay.util;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Jianghao on 2017/4/17
 *
 * @howechiang
 */
public class Util {

    public static String buildSignParmas(Map<String, Object> params) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            params = sorting(params, "asc");
            StringBuffer sb = new StringBuffer();
            params.forEach((k, v) ->
                    sb.append(k + "=" + v + "&")
            );
            return Strings.removeLast(sb.toString(), '&');
        }
    }

    public static Map<String, Object> sorting(Map<String, Object> params, String order) {

        if (Lang.isEmpty(params)) {
            return null;
        } else {
            Map<String, Object> map = new LinkedHashMap<>();
            if(Strings.equalsIgnoreCase(order, "desc")){
                params.entrySet().stream()
                        .sorted(Map.Entry.<String, Object>comparingByKey().reversed())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            }else {
                params.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            }
            return map;
        }
    }
}
