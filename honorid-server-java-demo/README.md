# Honor Server REST Sample Code

English| [中文](READNE.MD)

[TOC]

## Brief introduction

The REST sample code Honor Account Service has been encapsulated and includes a rich sample program for your reference or direct use. Code2AtDemo code obtains AT, AtParserDemo parses user AT, GetInfoDemo token method obtains user information, GetServerAtDemo server obtains token, IDTokenParserDemo parses token, Rt2AtDemo refreshes token.

## Environmental requirements

JDK version 1.8 and above.

## hardware requirements

Computers with Windows 10/Windows 7 operating system installed (desktop or laptop)

## configuration

| parameter      | describe                                                     |
| -------------- | ------------------------------------------------------------ |
| client_id      | App ID, Need to [access the Honor Developer Service Platform](https://developer.hihonor.com/)To apply, you need to include the client in the example_ Replace the ID with your own application |
| client_secret  | App SECRET, Need to[access the Honor Developer Service Platform](https://developer.hihonor.com/)To apply, you need to include the client in the example_ Replace the secret with your own application |
| tokenUrl       | Obtain the request address for the access token, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/token |
| getInfoUrl     | Request address for obtaining user information,, https://account-drcn.platform.hihonorcloud.com/rest.php?nsp_fmt=JSON&nsp_svc=GOpen.User.getInfo |
| parseTokenUrl  | Parsing the request address of the access token, https://hnoauth-login.cloud.hihonor.com/rest.php?nsp_fmt=JSON&nsp_svc=hihonor.oauth2.user.getTokenInfo |
| CERT_URL       | Obtain the address of the public key for the solution ID Token, https://hnoauth-login.cloud.hihonor.com/oauth2/v3/certs |
| ID_TOKEN_ISSUE | The value of the ISS field in the ID Token, https://honorid.hihonor.com |

## Install

Download demo, configure and download Maven, so you need a jar package that can be downloaded from the compiler Regular compilation startup

## Sample code

The Java sample code for the server side of Honor Account Service provides the following usage scenarios:



The Java sample code for the server side of Honor Account Service provides the following usage scenarios:

1. In/oauth2/v3/token. Java, use Authorization Code to replace Access Token

2. .IN/hihonor.oauth2.user.getTokenInfo.java,Parse Access Token

3. In GOpen.User.getInfo.java, use Access Token to obtain user information

4. In/oauth2/v3/token. Java, obtain the application level Access Token

5. In/oauth2/v3/tokeninfo.java, resolve ID Token locally

   6./oauth2/v3/token. Java, use Refresh Token to refresh Access Token

## Running results

Success:

1. Obtain Access Token, Refresh Token,return parameters access_token,exprires_in,id_token,refresh_token,scope,token_type. [detailed information](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-code2at.md&token=)

2. Interface parsing Access Token,it can be concluded that open_id, scope , union_id, expire_in, client_id .[detailed information](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-parse-at.md&token=)

3. Return parameters openID,displayName,headPictureURL.[detailed information](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-get-userinfo.md&token=)

4. Return parameters access_token,expires_in,token_type.[detailed information](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-get-server-at.md&token=)

5. Response results and ID_ Does the scope of the token include openid, email, and profile .[detailed information](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-parse-idtoken.md&token=)

6. Obtain new Access Token，return parameters access_token,expires_in,id_token,refresh_token,scope,token_type.[detailed information](https://developer.hihonor.com/cn/kitdoc?category=基础服务&kitId=11001&navigation=ref&docId=web-rt2at.md&token=)

Failure error code:

1.1101；

2.102；

3.1101；

4.1101；

5.1500；

6.1101；

## Technical support

If you have any information about the sample code, you can find it in the [Honor Developer Community](https://developer.hihonor.com/cn/forum/?navation=dh11614886576872095748%2F1 )Get the latest information about the account REST sample code and exchange insights with other developers.

If you have any questions about using this sample code, please go to the Honor Developer Community for more opinions and suggestions. If there is an error while running the sample code, please submit an issue or pull request to GitHub

## Authorization License

The Honor Account Service sample code has been licensed by [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0).

