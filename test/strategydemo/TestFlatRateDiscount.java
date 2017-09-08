package strategydemo;

import org.junit.Test;

import org.junit.Assert;

public class TestFlatRateDiscount {

	@Test
	public void test() {
		DiscountStrategy strategy = new FlatRateDiscountStrategy(50);
		float ans = 50;
		float result = strategy.applyDiscount(100);
		Assert.assertEquals(ans, result, 0.5);
	}
}
