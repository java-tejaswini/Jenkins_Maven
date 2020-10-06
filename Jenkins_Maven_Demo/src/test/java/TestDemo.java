import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.Demo;

public class TestDemo {

	@Test
	public void testAdd() {
		Demo d=new Demo();
		int ans=d.add(10, 10);
		assertEquals(100, ans);
	}

}
