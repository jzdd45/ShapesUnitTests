package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.NegativeNumException;
import org.cvtc.shapes.Renderer;
import org.cvtc.tests.substitute.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CuboidUnitTest {
	
	@Test
	public void test() throws NegativeNumException {
		Dialog dialog = new MessageBoxSub();
		Renderer cuboid = new Cuboid(dialog, 0, 0, 0);
		
		int expected = 0x00;
		int actual = cuboid.render();
		
		assertEquals(expected, actual);
	}


	@Test
	@Parameters({
		"2.45, 3, 4"
		
	})
	public void getWidth(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 2.45f;
		
		float actual = cuboid.getWidth();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"3, 5.9999, 4"
		
	})
	public void getHeight(float width, float height, float depth) throws NegativeNumException, NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 5.9999f;
		
		float actual = cuboid.getHeight();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"3, 3, 45.455"
		
	})
	public void getDepth(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 45.455f;
		
		float actual = cuboid.getDepth();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	
	@Test(expected = NegativeNumException.class)
	public void expectedNegativeNumException() throws NegativeNumException {
		
		throw new NegativeNumException();
		
	}
	
	@Test
	@Parameters({
		"10, 5, 4"
		
	})
	public void getSurfaceAreaTest1(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 220f;
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"290.4f, 3, 77.3"
		
	})
	public void getSurfaceAreaTest2(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 47102.04f;
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"20.5, 545, 54"
		
	})
	public void getSurfaceAreaTest3(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 83419f;
		
		float actual = cuboid.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"10, 5, 4"
		
	})
	public void getVolumeTest1(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 200f;
		
		float actual = cuboid.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"32.2f, 6.9f, 12.3f"
		
	})
	public void getVolumeTest2(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 2732.8142f;
		
		float actual = cuboid.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"319, 4.1, 145"
		
	})
	public void getVolumeTest3(float width, float height, float depth) throws NegativeNumException {
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		float expected = 189645.5f;
		
		float actual = cuboid.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test(expected = NegativeNumException.class)
	@Parameters({
		"-3, 4.1, 4"
		
	})
	public void cuboidThrowsExceptionIfNegativeWidth(float width, float height, float depth) throws NegativeNumException{
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		assertEquals(new NegativeNumException(), cuboid);
		
	}
	
	@Test(expected = NegativeNumException.class)
	@Parameters({
		"3, -4.1, 4"
		
	})
	public void cuboidThrowsExceptionIfNegativeHeight(float width, float height, float depth) throws NegativeNumException{
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		assertEquals(new NegativeNumException(), cuboid);
		
	}
	
	@Test(expected = NegativeNumException.class)
	@Parameters({
		"3, 4.1, -4"
		
	})
	public void cuboidThrowsExceptionIfNegativeDepth(float width, float height, float depth) throws NegativeNumException{
		
		Cuboid cuboid = new Cuboid(null, width, height, depth);
		
		assertEquals(new NegativeNumException(), cuboid);
		
	}

}
