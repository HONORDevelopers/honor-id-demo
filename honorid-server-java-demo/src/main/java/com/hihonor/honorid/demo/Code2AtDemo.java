/*
Copyright 2021. Honor Device Co.,Ltd. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.hihonor.honorid.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a demo for get access token by code.
 *
 * @author l00017689
 * @since 2022-08-30
 */
public class Code2AtDemo {

    public static void main(String[] args) throws IOException {

        // NONOR ID OAuth adress for interface "/oauth2/v3/token"
        String tokenUrl = "https://hnoauth-login.cloud.hihonor.com/oauth2/v3/token";

        // fixed value for code to access token interface
        String grantType = "authorization_code";

        // replace with your redirect_uri
        String redirectUri = "";

        // replace with your client_id
        String clientId = "";

        // replace with your client_secret
        String clientSecret = "";

        // Because the request body used in this example is UrlEncodedFormEntity,
        // the request parameters will be automatically urlencoded,
        // so the parameters do not need to be urlencoded separately;
        String code = "DQB6e3x9QgbS52eU4aDuv3K/yibNrsFRM0cIPxZjszuV/RvJVXLnRJZ/7TBi6IaNDX5w/lKusvn93sJ3tb4E1zo47jNDZoFyFfj30D6VPk5B3ivl0ZbT1G67Da+74HIiZsKGKfAoZotgcX5Rszy9GIOv1dltKpZahBVSJavAypYBA5UtggCyf4Hbfl";

        // You need to decode it first, if the code parameter is urlencoded.
        // code = java.net.URLDecoder.decode(code, "utf-8");

        // get At by code
        JSONObject tokens = getTokenByCode(tokenUrl, grantType, redirectUri, clientId, clientSecret, code);

        System.out.println(tokens.toJSONString());
    }

    /**
     * get access token by code
     *
     * @param tokenUrl token url
     * @param grantType grant_type
     * @param redirectUri redirect_uri
     * @param clientId client_id
     * @param clientSecret client_secret
     * @param code code
     * @return JSONObject
     * @throws IOException
     */
    private static JSONObject getTokenByCode(String tokenUrl, String grantType, String redirectUri, String clientId,
                                             String clientSecret, String code) throws IOException {
        HttpPost httpPost = new HttpPost(tokenUrl);
        List<BasicNameValuePair> request = new ArrayList<>();
        request.add(new BasicNameValuePair("grant_type", grantType));
        request.add(new BasicNameValuePair("redirect_uri", redirectUri));
        request.add(new BasicNameValuePair("code", code));
        request.add(new BasicNameValuePair("client_id", clientId));
        request.add(new BasicNameValuePair("client_secret", clientSecret));
        httpPost.setEntity(new UrlEncodedFormEntity(request));

        try (CloseableHttpResponse response = HttpClientUtil.getClient().execute(httpPost)) {

            HttpEntity responseEntity = response.getEntity();

            // access_token and id_token are base64 encoded and may have escaping characters, such as: \/
            // if you use json parsing tools such as fastjson or jackson, it will be automatically escaped.
            String ret = responseEntity != null ? EntityUtils.toString(responseEntity) : null;
            JSONObject jsonObject = (JSONObject) JSON.parse(ret);
            EntityUtils.consume(responseEntity);
            return jsonObject;
        }
    }
}
