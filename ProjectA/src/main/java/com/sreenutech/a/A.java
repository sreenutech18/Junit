package com.sreenutech.a;

import com.sreenutech.a.model.AReq;
import com.sreenutech.a.model.ARes;
import com.sreenutech.b.B;
import com.sreenutech.b.model.BReq;
import com.sreenutech.b.model.BRes;
import com.sreenutech.c.C;

public class A {
	
	
	private B b;
	private C c;
	
	public A(B b,C c) {
		
		this.b = b;
		this.c = c;
	}
	
	public ARes m1(AReq areq) {
		
		//prpeare the breq with the help of areq
		BReq breq = new BReq();
		breq.setOid(areq.getOid());
		breq.setName(areq.getName());
		
		BRes bresp = b.m2(breq);
		
		//call c
		
		float f = c.m3(areq.getOid());
		
		System.out.println("cresp is:"+f);
		//prepare aresp 
		
		ARes aresp = new ARes();
		aresp.setStatus(bresp.getStatus());
		aresp.setDesc(bresp.getDesc());
		aresp.setPrice(f);
	System.out.println("aresp is :"+aresp);
	return aresp;
	
	}

}
