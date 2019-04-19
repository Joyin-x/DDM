package com.joyin.demo.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wwx
 * @date 2019/4/19 11:09
 **/
public class JwtUtil {

    /**
     * 过期时间15分钟
     * */
    private static final long EXPIRE_TIME=15*60*1000;

    /**
     * token 私钥
     * */
    private static final String TOKEN_SECRET="f26e587c28064d0e855e720a6a0e618";

    /**
     * 生成签名，15分钟后过期
     *
     * @param username 用户名
     * @rerurn 加密的token
     */
    public static String sign(String username, Integer userID) {
        try {
            //过期时间
            Date date = new Date(System.currentTimeMillis() + JwtUtil.EXPIRE_TIME);
            //私钥及加密算法
            Algorithm algorithm=Algorithm.HMAC256(JwtUtil.TOKEN_SECRET);
            //设置头信息
            Map<String,Object> header=new HashMap<String,Object>();
            header.put("typ","JWT");
            header.put("alg","HS256");
            //附带username，userID信息，生成签名
            return JWT.create()
                    .withHeader(header)
                    .withIssuer("Joyin")
                    .withIssuedAt(Calendar.getInstance().getTime())
                    .withClaim("loginName",username)
                    .withClaim("userID",userID)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 校验token是否正确
     *
     * @param token 密钥
     * @return 是否正确
     * */
    public static boolean verify(String token){
        try {
            Algorithm algorithm=Algorithm.HMAC256(JwtUtil.TOKEN_SECRET);
            JWTVerifier verifier=JWT.require(algorithm).build();
            DecodedJWT jwt=verifier.verify(token);
            System.out.println(jwt);
            return true;
        } catch (UnsupportedEncodingException e) {
            return false;
        }

    }
}
