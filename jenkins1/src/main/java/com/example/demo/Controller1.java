package com.example.demo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(
//		origins =
//	{
////		"*"
//		"http://192.168.0.163:5500"
//			,
//		"http://192.168.0.37:5500"
//			,
//	"http://192.168.0.37:9999"
//	}
//		,
//allowCredentials = "true" 
//)
public class Controller1 {
	@PostMapping("login/{id}")
	public String a(
			
			HttpSession session
			,String id
			,
			HttpServletRequest request,	HttpServletResponse response 
			) {
//		ResponseCookie cookie = ResponseCookie.from("Lax", "Lax")
//				.path("/")
//				.sameSite("")
//				.secure(true)
//				.httpOnly(true)
//				
//				.domain("192.168.0.163")
//				.build();
//		response.addHeader("Set-Cookie", cookie.toString());
		
//		String name="JSESSIONID";
//		Cookie []cookieArr = request.getCookies();
//		if(cookieArr != null) {
//			for(Cookie c: cookieArr) {
//				if(name.equals(c.getName())){
//
//					String value=c.getValue();
//					ResponseCookie cookie = ResponseCookie.from(name, value)
//				            .path("/")
//				            .sameSite("None")
//				            .httpOnly(false)
//				            .secure(true)
////				            .secure(false)
////				            .maxAge(maxAge)
//				            .build();
//
//				        response					
//				        .addHeader("Set-Cookie", cookie.toString());
//				}
//			}
//		}
		session.setAttribute("loginedId", "오문정아이디");
		return session.getId();
		
	}
	@GetMapping("checklogined")
	public String b(HttpSession session
			,
			HttpServletRequest request,	HttpServletResponse response
			) {
//		ResponseCookie cookie = ResponseCookie.from("Lax", "Lax")
//				.path("/")
//				.sameSite("")
//				.secure(true) //
//				.httpOnly(true)
//				.domain("192.168.0.163")
//				.build();
//		response.addHeader("Set-Cookie", cookie.toString());
		
//		String name="JSESSIONID";
//		Cookie []cookieArr = request.getCookies();
//		if(cookieArr != null) {
//			for(Cookie c: cookieArr) {
//				if(name.equals(c.getName())){
//
//					String value=c.getValue();
//					ResponseCookie cookie = ResponseCookie.from(name, value)
//				            .path("/")
//				            .sameSite("None")
//				            .httpOnly(false)
//				            .secure(true)
////				            .secure(false)
////				            .maxAge(maxAge)
//				            .build();
//
//				        response					
//				        .addHeader("Set-Cookie", cookie.toString());
//				}
//			}
//		}
		return session.getId() + ": session.logined=" + session.getAttribute("loginedId");
	}
}
