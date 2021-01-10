package com.servbyte.ecommerce.security;

import com.servbyte.ecommerce.entities.Roles;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class JwtTokenService {

    private static final long serialVersionUID = -2550185165626007488L;
    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
    public static final String ROLES = "roles";
    @Value("${jwt.secret}")
    private String secret;

    public String generateToken(String username, Set<Roles> roles) {
        final long currentTime = System.currentTimeMillis();
        Claims claims = Jwts.claims().setSubject(username);
        final List<String> addRoles = roles.stream().map(roles1 -> roles1.getName()).collect(Collectors.toList());
        claims.put(ROLES, addRoles);

        return Jwts.builder()//
                .setClaims(claims)//
                .setIssuedAt(new Date())//
                .setExpiration(new Date(currentTime + 864000000))//
                .signWith(SignatureAlgorithm.HS256, secret)//
                .compact();
    }


    //retrieve expiration date from jwt token
    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    //for retrieving any information from token we will need the secret key
    private Claims getAllClaimsFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    //while creating the token -
    //1. Define  claims of the token, like Issuer, Expiration, Subject, and the ID
    //2. Sign the JWT using the HS512 algorithm and secret key.
    //3. According to JWS Compact Serialization(https://tools.ietf.org/html/draft-ietf-jose-json-web-signature-41#section-3.1)
    //   compaction of the JWT to a URL-safe string
    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver){
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    //check if token has expired
    public Boolean isTokenExpired(String token){
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    private String generateToken(Map<String, Object> claims, String subject){
        final long currentTime = System.currentTimeMillis();

        return Jwts.builder().setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(currentTime))
                .setExpiration(new Date(currentTime + 864000000))
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    //validate token
    public Boolean validateToken(String token) {
        final String username = getUsernameFromToken(token);
        return username != null && !isTokenExpired(token);
    }

    public List<String> getRoles(String token) {
        return getClaimFromToken(token, claims -> (List) claims.get(ROLES));
    }

    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

}
