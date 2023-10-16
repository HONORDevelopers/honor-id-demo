# 荣耀服务端REST示例代码

[![Apache-2.0](https://img.shields.io/badge/license-Apache-blue)](http://www.apache.org/licenses/LICENSE-2.0)
[![Open Source Love](https://img.shields.io/static/v1?label=Open%20Source&message=%E2%9D%A4%EF%B8%8F&color=green)](https://developer.hihonor.com/demos/)
[![Java Language](https://img.shields.io/badge/language-java-green.svg)](https://www.java.com/en/)

[English](README.md) | 中文

## 目录

[TOC]



## 简介

REST示例代码荣耀账号服务进行了封装，包含丰富的示例程序，方便您参考或直接使用。Code2AtDemo代码获取AT,AtParserDemo解析用户的AT,GetInfoDemo令牌方式获取用户信息，GetServerAtDemo服务器获取令牌，IDTokenParserDemo解析令牌，Rt2AtDemo刷新令牌。

## 环境要求

JDK 1.8及以上版本。

## 硬件要求

安装有Windows 10/Windows 7操作系统的计算机（台式机或者笔记本）

## 配置

| 参数           | 描述                                                         |
| -------------- | ------------------------------------------------------------ |
| client_id      | App ID, 需要在[荣耀开发者服务平台](https://developer.hihonor.com/)申请, 您需要将示例中的client_id替换成您自己应用的 |
| client_secret  | App SECRET, 需要在[荣耀开发者服务平台](https://developer.hihonor.com/)申请, 您需要将示例中的client_secret替换成您自己应用的 |
| tokenUrl       | 获取access token的请求地址, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/token |
| getInfoUrl     | 获取用户信息的请求地址, https://account-drcn.platform.hihonorcloud.com/rest.php?nsp_fmt=JSON&nsp_svc=GOpen.User.getInfo |
| parseTokenUrl  | 解析access token的请求地址, https://hnoauth-login.cloud.hihonor.com/rest.php?nsp_fmt=JSON&nsp_svc=hihonor.oauth2.user.getTokenInfo |
| CERT_URL       | 获取解ID Token的公钥的地址, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/certs |
| ID_TOKEN_ISSUE | ID Token中ISS字段的值, https://honorid.hihonor.com           |



## 安装

下载demo,配置并下载maven所以需要jar包，能在编译器正常编译启动



## 示例代码

荣耀帐号服务的服务端Java示例代码提供了以下使用场景：

1./oauth2/v3/token.java中，使用Authorization Code换Access Token

2.hihonor.oauth2.user.getTokenInfo.java中，解析Access Token

3.GOpen.User.getInfo.java中，使用Access Token获取用户信息

4./oauth2/v3/token.java中，获取应用级Access Token 

5./oauth2/v3/tokeninfo.java中，本地解析ID Token

6./oauth2/v3/token.java中，使用Refresh Token刷新Access Token



## 运行结果

成功：

1.获取 Access Token, Refresh Token 凭证，返回参数access_token,exprires_in,id_token,refresh_token,scope,token_type[详细信息](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-code2at.md&token=)

2.接口解析 Access Token, 解析后可得 open_id, scope , union_id, expire_in, client_id[详细信息](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-parse-at.md&token=)

3.返回参数openID,displayName,headPictureURL[详细信息](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-get-userinfo.md&token=)

4.返回参数access_token,expires_in,token_type[详细信息;](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-get-server-at.md&token=)

5.响应结果与id_token的scope是否包含openid、email、profile有关[详细信息;](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-parse-idtoken.md&token=)

6.获取新的Access Token，返回参数access_token,expires_in,id_token,refresh_token,scope,token_type[详细信息](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-rt2at.md&token=)

失败错误码：

1.1101；

2.102；

3.1101；

4.1101；

5.1500；

6.1101；



## 技术支持

如果您对该示例代码相关信息，可在[荣耀开发者社区](https://developer.hihonor.com/cn/forum/?navation=dh11614886576872095748%2F1)获取关于账号REST示例代码最新讯息，并与其他开发者交流见解。

如果您对使用该示例代码有疑问，请前往荣耀开发者社区，获取更多意见和建议。如您的运行示例代码时出现错误，请到GitHub提交issue或pull request.

​       

## 授权许可

荣耀账号服务示例代码经过[Apache 2.0授权许可](http://www.apache.org/licenses/LICENSE-2.0)。