package com.clone.trello.cloneTrello.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.trello.cloneTrello.model.Card;
import com.clone.trello.cloneTrello.model.User;
import com.clone.trello.cloneTrello.service.CardService;
import com.clone.trello.cloneTrello.service.ColumnService;
import com.clone.trello.cloneTrello.service.LabelService;
import com.clone.trello.cloneTrello.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/")
@Validated
public class CloneController {
	
	@GetMapping("/searchCard/{value}")
	public String search(@PathVariable("value") String value) {
		return "We are returning "+value;
	}
	
	@PostMapping("data/found/token")
	public User login() {
		
		String token = getJWTToken();
		User user = new User();
		user.setUser("user");
		user.setToken(token);		
		return user;		
	}
	
	private String getJWTToken() {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		String token = Jwts
				.builder()
				.setId("demo")
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}


}
