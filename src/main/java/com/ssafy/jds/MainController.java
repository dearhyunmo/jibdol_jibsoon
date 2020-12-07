package com.ssafy.jds;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.ssafy.dto.HouseDealDto;
import com.ssafy.dto.Member;
import com.ssafy.service.HouseService;
import com.ssafy.service.MemberService;

@Controller
public class MainController {
	
	@Autowired
	public MemberService MSV;
	
	@Autowired
	public HouseService HSV;
	
//	@ExceptionHandler
//	public String handler(Exception ex,Model m) {
//		m.addAttribute("msg",ex.getMessage());
//		return "Error";
//	}
	
	//@RequestMapping("/")
	@GetMapping({"/","/index"})
	public String index() {
		return "index";
	}
	
	
	@PostMapping("/login")
	public String login(String uid,String upw,Model m,HttpSession hs){
		String user=MSV.login(uid,upw);
		System.out.println(user);
		if(user!=null) {
			hs.setAttribute("user", user);
		}else{
			m.addAttribute("msg", "아이디 또는 패스워드를 확인하세요!");
			return "users/login";
		}
		return "index";
	}
	
	@GetMapping({"/logout"})
	public String logout(HttpSession hs) {
		hs.invalidate();
		return "index";
	}
	
	@GetMapping({"/login"})
	public String login() {
		return "users/login";
	}
	
	@GetMapping({"/signup"})
	public String signup() {
		return "users/signup";
	}
	
	@GetMapping({"/intro"})
	public String intro() {
		return "pages/intro";
	}

	@GetMapping({"/faq"})
	public String faq() {
		return "pages/faq";
	}
	
	@GetMapping({"/contactus"})
	public String contactus() {
		return "pages/contactus";
	}
	
	@GetMapping({"/commercial"})
	public String commercial() {
		return "map/commercial";
	}
	
//	@GetMapping({"/board/list"})
//	public String boardlist() {
//		return "";
//	}
	
//	@GetMapping({"/noticelist"})
//	public String noticelist() {
//		return "../../jib_dol_soon/resources/dist/board";
//	}
	
	@GetMapping({"/traffic"})
	public String traffic() {
		return "map/traffic";
	}
	
	@GetMapping({"/houses"})
	public String houses(@RequestParam(value="searchField",required=false,defaultValue="") String field,
	           						@RequestParam(value="searchText", required=false,defaultValue="") String text,Model m) {
		List<HouseDealDto> houselists = null;
		
		switch(field){
			case "gugun":			
				houselists=HSV.searchByGugun(text);				
//				System.out.println(houselists);
				break;
			case "dong":
				houselists=HSV.searchByDong(text);
//				System.out.println(houselists);
				break;
			case "aptName":
				houselists=HSV.searchByaptName(text);
//				System.out.println(houselists);
				break;
			default :
				houselists = HSV.searchAll();
				System.out.println(text);
		}
		m.addAttribute("field", field);
		m.addAttribute("text",  text);
		
		m.addAttribute("houselists", houselists);
		
	      //m.addAttribute("deals", houselists);
	    Gson gson = new Gson();    
	    String json = gson.toJson(houselists);
	    m.addAttribute("Marker",json);
	      
		return "map/defaultmap";
	}
		
	@GetMapping({"/detailhouse"})
	public String detailhouse(int no, Model m) {
		HouseDealDto hdd = HSV.searchByNo(no);
		m.addAttribute("houselist", hdd);
	      Gson gson = new Gson();    
	       String json = gson.toJson(hdd);
	      m.addAttribute("Marker",json);
		return "map/detailmap";
	}
	
	@PostMapping({"/signup"})
	public String signup(Member member, Model m) {
		MSV.add(member);
		m.addAttribute("msg","정상적으로 가입 하셨습니다.");
		return "users/login";
	}
	
	@GetMapping({"/userinfo"})
	public String userinfo(String userid,Model m){
		Member mem=MSV.search(userid);
		m.addAttribute("mem",mem);
		return "users/userinfo";
	}
	
	@GetMapping({"/signupdate"})
	public String signupdate(String userid,Model m){
		Member mem=MSV.search(userid);
		m.addAttribute("mem",mem);
		return "users/signupdate";
	}
	
	@PostMapping({"/signupdate"})
	public String edituser(Member member, Model m) {
		MSV.update(member);
		return "index";
	}
	
	@GetMapping({"/deleteuser"})
	public String deleteuser(String userid, HttpSession hs,Model m) {
		hs.invalidate();
		MSV.delete(userid);
		return "index";
	}
	
	@GetMapping({"/userlist"})
	public String userlist(Model m) {
		List<Member> members=null;
		members=MSV.searchAll();
		m.addAttribute("mems", members);
		return "admin/userlist";
	}
	
//	
//	@GetMapping({"/sitemap"})
//	public String sitemap() {
//		return "menu/sitemap";
//	}
//	
//	@GetMapping({"/freelist"})
//	public String freelist() {
//		return "board/free/list";
//	}
//	
//	@GetMapping({"/freeview"})
//	public String freeview() {
//		return "board/free/view";
//	}
//	
//	@GetMapping({"/freewrite"})
//	public String freewirte() {
//		return "board/free/write";
//	}
//	
//	@GetMapping({"/noticelist"})
//	public String noticelist() {
//		return "board/notice/list";
//	}
//	
//	@GetMapping({"/noticeview"})
//	public String noticeview() {
//		return "board/notice/view";
//	}
//	
//	@GetMapping({"/noticewrite"})
//	public String noticewirte() {
//		return "board/notice/write";
//	}
//	
//	@GetMapping({"/findpw"})
//	public String findpw() {
//		return "user/findpw";
//	}
//	
//	
//	@GetMapping({"/findbyphone"})
//	public String findbyphone(String userid, String name, String phone, Model m) {
//		String pw = MSV.findbyphone(userid, name, phone);
//		m.addAttribute("pw", pw);
//		return "user/login";
//	}
//	
//	@GetMapping({"/findbyemail"})
//	public String findbyemail(String userid, String name, String email, Model m) {
//		String pw = MSV.findbyemail(userid, name, email);
//		m.addAttribute("pw", pw);
//		return "user/login";
//	}
}
