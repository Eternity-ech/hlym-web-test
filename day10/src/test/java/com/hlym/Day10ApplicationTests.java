package com.hlym;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Day10ApplicationTests {

    @Test
    public void tsetGenJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("name","111");
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"hlym")//定义签名算法
                .setClaims(claims)//自定义内容
                .setExpiration(new Date(System.currentTimeMillis()+1000*300))// 有效时间
                .compact();
        System.out.println(jwt);
    }

    @Test
    public void tsetGenJwt2() {
        Claims claims = Jwts.parser()
                .setSigningKey("hlym")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiMTExIiwiZXhwIjoxNzc5NzgzMTM2fQ.vHgqaJCh3WlDEJTRbqw-DsxZ_g0tbpUJHffRU93TWl8")
                .getBody();
        System.out.println(claims);
    }
}
