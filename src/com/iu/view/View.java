package com.iu.view;

import com.iu.member.MemberDTO;
import com.iu.util.Session;

public class View {
	
	public void view() {
		//myPage
		MemberDTO memberDTO = (MemberDTO)Session.member;
		System.out.println("ID : "+memberDTO.getId());
		System.out.println("Name : "+memberDTO.getName());
		System.out.println("Phone : "+memberDTO.getPhone());
		System.out.println("Email : "+memberDTO.getEmail());
	}
	
	public void view(String message) {
		System.out.println(message);
	}

}
