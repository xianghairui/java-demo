package com.xiang.demo.java.designpattern.test;

import org.junit.Test;

import com.xiang.demo.java.designpattern.createmodel.builder.Builder;

/**
 * @ClassNmae BuilderTest
 * @Description 建造者模式
 *              从这点看出，建造者模式将很多功能集成到一个类里，这个类
 *              可以创造出比较复杂的东西。所以与工程模式的区别就是：工厂
 *              模式关注的是创建单个产品，而建造者模式则关注创建符合对象，
 *              多个部分。因此，是选择工厂模式还是建造者模式，依实际情况而定。
 * @author hairui
 * @Date 2017年4月24日 下午1:36:10
 */
public class BuilderTest {

	@Test
	public void test() {

		Builder builder = new Builder();
		builder.produceMailSender(10);

	}

}
