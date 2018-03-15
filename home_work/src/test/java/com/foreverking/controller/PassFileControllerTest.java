package com.foreverking.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CSV�ļ���������
 * 
 * @author wy
 *
 */
@ContextConfiguration(locations = { "classpath:application.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class PassFileControllerTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private IController controller;

	/**
	 * ���Ե���CSV�ļ�
	 */
	@Test
	public void tranceCSVFileTest() {
		String path = this.getClass().getClassLoader().getResource("").getPath();
		String filePath = path + "2018-03-14.csv";
		String result = controller.tranceCSVFile(filePath);
		Assert.assertEquals("SUCCESS", result);
	}

}
