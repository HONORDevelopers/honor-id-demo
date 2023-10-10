# 荣耀帐号服务端接口示例

中文|[英文](README.md)



## 目录

 * [示例简介](#示例简介)
 * [环境要求](#环境要求)
 * [参数说明](#参数说明)
 * [代码示例](#代码示例)
 * [许可证](#许可证)



## 示例简介

    荣耀帐号服务端接口示例代码封装了荣耀帐号服务端常用的接口, 示例代码以java语言开发, 提供了示例程序供您参考或使用。



## 环境要求

    JDK 版本建议 >= 1.8



## 参数说明

**示例中用到的配置参数如下：**

| 参数           | 描述                                                         |
| -------------- | ------------------------------------------------------------ |
| client_id      | App ID, 需要在[荣耀开发者服务平台](https://developer.hihonor.com/)申请, 您需要将示例中的client_id替换成您自己应用的 |
| client_secret  | App SECRET, 需要在[荣耀开发者服务平台](https://developer.hihonor.com/)申请, 您需要将示例中的client_secret替换成您自己应用的 |
| tokenUrl       | 获取access token的请求地址, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/token |
| getInfoUrl     | 获取用户信息的请求地址, https://account-drcn.platform.hihonorcloud.com/rest.php?nsp_fmt=JSON&nsp_svc=GOpen.User.getInfo |
| parseTokenUrl  | 解析access token的请求地址, https://hnoauth-login.cloud.hihonor.com/rest.php?nsp_fmt=JSON&nsp_svc=hihonor.oauth2.user.getTokenInfo |
| CERT_URL       | 获取解ID Token的公钥的地址, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/certs |
| ID_TOKEN_ISSUE | ID Token中ISS字段的值, https://honorid.hihonor.com           |



## 代码示例

**提供示例代码如下：**


| 类                                         | 实现接口                         | 描述                            |
| ------------------------------------------ | -------------------------------- | ------------------------------- |
| com.hihonor.honorid.demo.AtParserDemo      | hihonor.oauth2.user.getTokenInfo | 解析 Access Token               |
| com.hihonor.honorid.demo.Code2AtDemo       | /oauth2/v3/token                 | Code 换 Access Token            |
| com.hihonor.honorid.demo.GetInfoDemo       | GOpen.User.getInfo               | Access Token 获取用户信息       |
| com.hihonor.honorid.demo.GetServerAtDemo   | /oauth2/v3/token                 | 获取应用级 Access Token         |
| com.hihonor.honorid.demo.IDTokenParserDemo | -                                | 本地解析 ID Token               |
| com.hihonor.honorid.demo.Rt2AtDemo         | /oauth2/v3/token                 | Refresh Token 刷新 Access Token |




##  许可证
荣耀帐号服务端接口示例根据 [Apache 许可证，版本 2.0](http://www.apache.org/licenses/LICENSE-2.0) 获得许可。