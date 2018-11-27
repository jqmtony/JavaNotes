package com.client.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class JSONUtils {

    private JSONUtils(){}

    private static JSONUtils instance;

    public static JSONUtils getInstance(){
        if (instance == null){
            instance = new JSONUtils();
        }
        return instance;
    }
    /**
     * `���б�ת����json�ַ���
     * @param t
     * @return
     */
    public static <T>String listToJSONString(List<T> list){
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        return array.toJSONString();
    }
    /**
     * `�Ѷ���ת����json�ַ�����user.... >>> string, string userinfro = objectToJsonString(user);
     * @param t
     * @return
     */
    public static <T>String objectToJSONString(T t){
        return JSON.toJSONString(t);
    }
    /**
     * `���ַ���ת������Ӧ���͵��б�
     * @param str
     * @param clazz
     * @return
     */
    public static <T>List<T> JSONStringToList (String response , Class<T> clazz) {
    	JSONArray json = JSONArray.parseArray(response);
    	  return (List<T>)JSONArray.parseArray(json.toJSONString(), clazz);
    }
    /**
     * `��json�ַ���ת���ɶ���, user user = jsonstringtoojbe(string, user.class);
     * @param str
     * @param clazz
     * @return
     */
    public static <T>T JSONStringToObject (String response , Class<T> clazz) {
    	return JSON.parseObject(response,clazz);
    }
}
