
package com.test.java.practice;
import org.junit.Assert;
import org.junit.Test;

import com.test.java.prctice.Audience;
import com.test.java.prctice.AudienceManager;

public class TestAudienceManager {

	@Test
	public void TestRegister() {
		AudienceManager am=new AudienceManager();
		Audience audience = new Audience();
		boolean is=am.register(audience);
		Assert.assertEquals(true,is);

	}
	@Test
	public void TestValidate() {
		AudienceManager am=new AudienceManager();
		Audience audience = new Audience();
		//audience.setUserId("12");
		//audience.setPassword("123");
		boolean val= am.validate(audience);
		Assert.assertEquals(false,val);
		
	}

}



