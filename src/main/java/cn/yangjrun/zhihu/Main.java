package cn.yangjrun.zhihu;

import okhttp3.*;

import java.io.IOException;

/**
 * @author jirun.yang
 * @date 2020-03-10 16:43
 **/
public class Main {

    public static void main(String[] args) {
//        String url = "http://www.xxxx.com";
//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url(url)
//                .get()  //默认为GET请求，可以不写
//                .build();
//        final Call call = client.newCall(request);

        OkHttpClient client = new OkHttpClient();
        //创建表单请求参数
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("name", "zhangsan");
        builder.add("age", "18");
        FormBody formBody = builder.build();
        Request request = new Request.Builder()
//                .url(url)
                .post(formBody)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
            }
        });
    }

}
