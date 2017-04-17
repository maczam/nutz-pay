package org.nutz.pay.util;

import org.nutz.http.*;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;

import java.util.Map;

/**
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class HttpUtil {

    /**
     * 普通Get请求
     *
     * @param url
     * @return
     */
    public static String get(String url) {

        if (Strings.isBlank(url))
            return null;
        else if (!Strings.isUrl(url))
            return null;
        else
            return Http.get(url).getContent();
    }

    /**
     * 普通Post请求
     *
     * @param url
     * @param parms
     * @return
     */
    public static String post(String url, Map<String, Object> parms) {

        if (Strings.isBlank(url))
            return null;
        else if (!Strings.isUrl(url))
            return null;
        else if (parms.isEmpty())
            return null;
        else
            return Http.post(url, parms, 10000);
    }

    /**
     * 带Header信息的Post请求
     *
     * @param url
     * @param header
     * @param parms
     * @return
     */
    public static String post(String url, Header header, Map<String, Object> parms) {

        if (Strings.isBlank(url))
            return null;
        else if (!Strings.isUrl(url))
            return null;
        else if (Lang.isEmpty(header))
            return null;
        else if (header.getAll().isEmpty())
            return null;
        else
            return Http.post3(url, parms, header, 10000).getContent();
    }

    /**
     * 带Header信息Get请求
     *
     * @param url
     * @param header
     * @return
     */
    public static String get(String url, Header header) {

        if (Strings.isBlank(url))
            return null;
        else if (!Strings.isUrl(url))
            return null;
        else if (Lang.isEmpty(header))
            return null;
        else if (header.getAll().isEmpty())
            return null;
        else
            return Http.get(url, header, 10000).getContent();
    }

    /**
     * Post发送Json请求
     *
     * @param url
     * @param json
     * @return
     */
    public static String post(String url, Json json) {

        if (Strings.isBlank(url))
            return null;
        else if (!Strings.isUrl(url))
            return null;
        else if (Lang.isEmpty(json))
            return null;
        else {
            Request req = Request.create(url, Request.METHOD.POST);
            req.getHeader().set("Content-Type", "application/json;charset=UTF-8");
            req.setData(json.toString());
            Response resp = Sender.create(req).send();
            return resp.getContent();
        }
    }

    /**
     * Post发送Xml请求
     *
     * @param url
     * @param xml
     * @return
     */
    public static String post(String url, String xml) {

        if (Strings.isBlank(url))
            return null;
        else if (!Strings.isUrl(url))
            return null;
        else if (Lang.isEmpty(xml))
            return null;
        else {
            Request req = Request.create(url, Request.METHOD.POST);
            req.getHeader().set("Content-Type", "application/xml;charset=UTF-8");
            req.setData(xml);
            Response resp = Sender.create(req).send();
            return resp.getContent();
        }
    }
}
