package com.jzh.xx.transaction.config;

import org.springframework.context.annotation.Configuration;

/**
 * 支付宝沙箱支付配置类
 */

@Configuration
public class AlipayConfig {

    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */
    public static String app_id = "2021000122672654";

    /**
     * 商户私钥，您的PKCS8格式RSA2私钥
     */
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCMbZyxtM30Pk712te8gKUgUlV19zSBHiEvhQDYoz/zsjRP7+JVsjh/9M99lI6/JfiEz36niMDkBMYUX2OB+SSvG+miG1V5g3wVVGolVMTqP5ekms9cBEBg6ymwLJCH891H35Box/04aQHCZ2ZGreFV0Y2UGhY2dH8lAvLKumG6oilj5683ofrsBTfKPyZuBdrbWBZnU1uKO+TcsPt00+QDgEmNWbm61idBpapBvRVq4zSRB2iZa3IUxPYiRXpION5LR1cU9Vi+lmuwf0Gh7MpgGKOktVSVAOxgLl8kgGLjfgxqmHv48D3uhYpbS+FWLd6T+bZDsX3H9SLlcG4jENnXAgMBAAECggEAZpb1cIXMKHEUslvsW9QHznMX6BRvERz31YVvNtUctWYs/XEcgsquqBwrMW1EU7Tjt/L2bmJjuLEcHGoLgjqHaD4WEs2xRhKepd6DpT4mlZNbr29BqdGZTrS+QexsskWgFQ/oqgPgpENie6maeGwzQMTUj6v3KlU1Rc6/nQdIulT9Pi9cxrQbaTmCbsvcFhNz/u2uNAA+e8Qfo8H23CVObLnjShmbYWRL2OQuhT+gnm0SI7vEGhP+yp7Gpetxw86FjULUQBh5HP4a0Vz7RUS4QdpPNH0SP/2cEkFXv41oLgFBtnH3xnnbg/Pc8KOQrY/ZK1JqbYKMDztfVMBh/uLkMQKBgQDu4VkO9sy6tThc/RHF7qbN/GoegWyHUcWgu48KboN9KSoGzE4YWesfBcjPcHaEyGIPdmIwuhQoCRtNXJU978qIxoDFTxdZTnjo2HtVkcnwdBiSsyJ3Qw5liT1tTT+d8niXp8/ugGHblud22qIc7oqyE0DlCk1jori9gWdDQMadVQKBgQCWff+RuwxbCa2OPhpLXemnIKUdpic8RYmM4VtKD6ClNWH4bpHXR+robIp7suIIZ9Q479aiqXm9e3rbMKMYPH9EDoghc1QE8rkxcfGRbmyAl9Yu9P6GtzVJvxNeQBFi5ItrX46RxHlJBS6Tzf+UCo4qzpNLPcqrS1HbCHoEBAY6ewKBgEeyTx6UqIHpXk9ajXkQ1fPBLMCXK9G5k01Yveftn31zW2/K5i2c31riS5EnOgtEcVoet/3T+7TAdvdTMF/0lp9SpNeTk3h0ewm339yg8zE+RxnQtimBcNK8zDkAFHX9joBGF7yHv9c+hZ5ApKN2XR5xdOrJmsyqzDPkoO+og3Q5AoGAddkbXoqkhVIR2BbnzmcvhtH4mzw282rc6Ta8n0WXnmgsXThw+q311abR10Zg3QY52ZBvexfOHsTok2cGAP+3BZt/nPpMLEfLIF5DNojLbPP6JPFztBkaILMBvsfbFZ81UpMU+S9rbvQg4lvprYuKgxkbnUs5P2SPKD/+FND186sCgYBrw2566q86qp46TS7TC1gO3SEC0mv9qqbtHUW2ok9IJguz0q79NT5dJLab0nnYFL8ukxnvvtrHdQgD02OfrVe8N+MS7hhI5QtdpjN2CRrXX4DaCw9pU207SGcrLaa+U31QbwDrTq3JtemXhHTkiaY+kCi3afHAPolBu7wIJofbfA==";

    /**
     * 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥
     */
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmJ8AYfBSPPCq396vZVggnQ3vGt/wA5OSRWL1UDExKY2vGK2OVbN0lqYoR+t41on/thRbAWomZQFbisHNPd7U1nOMqcIUmY6EOs9wch+o3TW5yPHMcAOdgbADSOzvORr9Rm2rTVxwIXL7jY5E3DwDgAmwvgOESgO6TyoOD2L14XU7fTYkKxSCmni0Pj76ysbSic1zy7UdjNENk05QGBZdUyvr/DUVVpI7LzCP5fcnBp+fjxNJRzhJgOwqvt9BY5z//OcbvjMblyyXBoQpSNU8osFmtJVEUwDV9iT6Hkp4ZWRFDE0qQ2CVvcxtnxJM0F3o1y+zCZBbCHT3dEinwIcm+QIDAQAB";

    /**
     * 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    //public static String notify_url = "http://z2o7626444.qicp.vip/checkout/returnUrl";

    /**
     * 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    public static String return_url = "http://localhost:9090/checkout/returnUrl";

    /**
     * 签名方式
     */
    public static String sign_type = "RSA2";

    /**
     * 字符编码格式
     */
    public static String charset = "utf-8";

    /**
     * 支付宝网关
     */
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";
}

