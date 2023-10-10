# HONOR ID SERVER API Sample

英文|[中文](README_ZH.md)



## Table of Contents

 * [Introduction](#introduction)
 * [Supported Environments](#supported-environments)
 * [Parameter Description](#Parameter Description)
 * [Sample Code](#Sample Code)
 * [License](#License)



## Introduction

    This samples code encapsulates APIs of the HONOR ID server. It provides sample program for your reference or usage.
    The following describes of Java sample code.



## Supported Environments

    JDK version >= 1.8 is recommended.



## Parameter Description

The describes parameters are as follows:

| Parameter      | Description                                                  |
| -------------- | ------------------------------------------------------------ |
| client_id      | App ID, which can be obtained from [HONOR Developers](https://developer.hihonor.com/en) website, please replace it with your app's client ID. |
| client_secret  | App SECRET, which can be obtained from [HONOR Developers](https://developer.hihonor.com/en) website, please replace it with your app's client Secret. |
| tokenUrl       | The request address for getting access token, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/token |
| getInfoUrl     | The request address for getting user info, https://account-drcn.platform.hihonorcloud.com/rest.php?nsp_fmt=JSON&nsp_svc=GOpen.User.getInfo |
| parseTokenUrl  | The request address for parsing access token, https://hnoauth-login.cloud.hihonor.com/rest.php?nsp_fmt=JSON&nsp_svc=hihonor.oauth2.user.getTokenInfo |
| CERT_URL       | The request address for getting public key of parsing ID Token, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/certs |
| ID_TOKEN_ISSUE | The value of the ISS field in the ID Token,  https://honorid.hihonor.com |



## Sample Code

This demo provides demonstration for following scenarios:


| Class                                      | Interface                        | Description                         |
| ------------------------------------------ | -------------------------------- | ----------------------------------- |
| com.hihonor.honorid.demo.AtParserDemo      | hihonor.oauth2.user.getTokenInfo | Parse Access Token                  |
| com.hihonor.honorid.demo.Code2AtDemo       | /oauth2/v3/token                 | Get Access Token by Code            |
| com.hihonor.honorid.demo.GetInfoDemo       | GOpen.User.getInfo               | Get user info by Access Token       |
| com.hihonor.honorid.demo.GetServerAtDemo   | /oauth2/v3/token                 | Get Server Access Token             |
| com.hihonor.honorid.demo.IDTokenParserDemo | -                                | Parse ID Token in your local server |
| com.hihonor.honorid.demo.Rt2AtDemo         | /oauth2/v3/token                 | Get Access Token by Refresh Token   |



##  License

This samples is licensed under the [Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0).