# HONOR ID Android Java Sample Code

[中文](README_ZH.md) | English



## Contents

* [Introduction](#Introduction)
* [Environment](#Environment)
* [Preparations](#Preparations)
* [Result](#Result)
* [License](#License)



## Introduction

Honor ID Java sample code provides an example which wrap the interface of the HonorID SDK.  Implement the interfaces of silent sign in, authorized login, cancel authorization, authorization page.



## Environment

- [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) 1.8 or later
- [Android Studio](https://developer.android.com/studio) 3.6.1 or later
  - minSdkVersion 19 or later
  - targetSdkVersion 31（recommend）
  - compileSdkVersion 31（recommend）
  - Gradle 5.4.1 or later（recommend）
- Devices for test：MagicUI 4.0 or later HONOR mobile phone
- HONOR ID APK 6.0.2.300 or later



## Preparations

1. Open the sample code project in Android Studio and run the demo application on the device or emulator where you have the latest version of the Honor ID APP installed.
2. Register [HONOR Developers](https://developer.hihonor.com/cn/) Account
3. Create Android App ID. See [Development Preparation|Apply Android Application](https://developer.hihonor.com/cn/kitdoc?category=base&kitId=11001&navigation=guides&docId=android-apply-application.md) for details
4. Import the demo into Android Studio (3.6.1 or later) before constructing the sample demo
5. Configure the demo:
   （1）Replace the "ApplicationID" in the "build.gradle" file in the example project with your own application package name.
   （2）Replace the mClientID parameter in the example project with your AppID.
6. Run your application on an Android device or emulator.



## Result

The example demo page is shown as follows:

<img src="E:/HonorIDDemo/images/honoriddemo.png" alt="account sample result" style="zoom: 80%;" />

The demo provides the following usage scenario：

1. Silent Sign In

   If error code 31(not logged in) or error code 55(scopes not authorize) returns, when application call Silent SignIn interface,  then call Intent SignIn to pull pu authorization page. After user login and authorization, application can obtain the user's authorization code. Called Silent SignIn interface again, application can obtain user's authorization code, openId, unionId and ID Token. The ID Token can be used for ID Token Pattern Sign In.

![image-20220912203820818](E:/HonorIDDemo/images/silentsignin.png)

2. Authorization Page, Authorization Pattern Sign In, Intent Sign In
3. Cancel Authorization
4. Add Authorization



## License

The Honor ID SDK demo code is licensed under [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).