package com.sreenutech.b;

import com.sreenutech.b.model.BReq;
import com.sreenutech.b.model.BRes;

public class B {

	public BRes m2(BReq areq) {
		
		int a = 10/0;

		System.out.println("Entered into B");

		BRes bresp = new BRes();

		bresp.setStatus("delivered");
		bresp.setDesc("good");

		return bresp;

	}

}
