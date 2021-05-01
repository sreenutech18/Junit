package com.sreenutech.a;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.sreenutech.a.model.AReq;
import com.sreenutech.a.model.ARes;
import com.sreenutech.b.B;
import com.sreenutech.b.model.BReq;
import com.sreenutech.b.model.BRes;
import com.sreenutech.c.C;

@RunWith(MockitoJUnitRunner.class)
public class ATest {
	
	@Mock
	B b;
	
	@Mock 
	C c;
	
	@Test
	public void testM1_Success_Scenario() {
		
		//MockitoAnnotations.openMocks(this);
		
		//B b = new B();
		//C c = new C();
		//stubbing
		//B b = Mockito.mock(B.class);
		//C c = Mockito.mock(C.class);
		//expectation
		Mockito.when(b.m2(ArgumentMatchers.any(BReq.class))).thenReturn(buildBResp());
		
		Mockito.when(c.m3(ArgumentMatchers.anyString())).thenReturn(1000f);
		
		
		A a = new A(b,c);
		
		AReq areq = new AReq();
		areq.setOid("123");
		areq.setName("mobile");
		
		ARes aresp = a.m1(areq);
		
		//verify the result
		assertNotNull(aresp);
		
		assertEquals("delivered", aresp.getStatus());
		assertEquals(1000f, aresp.getPrice(),0);
		
	}

	private BRes buildBResp() {
		
		System.out.println("Entered into mock resp");
		BRes bres = new BRes();
		
		bres.setStatus("delivered");
		bres.setDesc("good");
		
		return bres;
	}
	


}
