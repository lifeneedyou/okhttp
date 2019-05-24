package com.ok.http.client.okhttp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Hello world!
 *
 */
public class CrawlData 
{
	public static String downloadHtml(String url) {
        String body = null;
        OkHttpClient client = new OkHttpClient();
        //请求
        Request request = new Request.Builder().url(url).build();
        //发起请求
        try {
 
            Response response = client.newCall(request).execute();
            body = new String(response.body().bytes());
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return body;//取得目标
    }
}
