package org.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junitparams.Parameters;

public class CylinderUnitTest {
	@Test
	@Parameters({
		"45.45, 4"
		
	})
	public void getHeight(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 4f;
		
		float actual = cylinder.getHeight();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"5, 5.9999"
		
	})
	public void getRadius(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 5f;
		
		float actual = cylinder.getRadius();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	
	@Test(expected = NegativeNumException.class)
	public void expectedNegativeNumException() throws NegativeNumException{
		
		throw new NegativeNumException();
		
	}
	
	@Test
	@Parameters({
		"10, 2"
		
	})
	public void getSurfaceAreaTest1(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 753.982f;
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"12.456, 92.45"
		
	})
	public void getSurfaceAreaTest2(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 8210.295f;
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"24.56, 56.5"
		
	})
	public void getSurfaceAreaTest3(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 12508.776f;
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"23, 45"
		
	})
	public void getVolumeTest1(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 74785.61f;
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"4, 450"
		
	})
	public void getVolumeTest2(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 22619.466f;
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"45, 1"
		
	})
	public void getVolumeTest3(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		float expected = 6361.725f;
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test(expected = NegativeNumException.class)
	@Parameters({
		"-3, 4.1"
		
	})
	public void cylinderThrowsExceptionIfNegativeHeight(float height, float radius) throws NegativeNumException{
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		assertEquals(new NegativeNumException(), cylinder);
		
	}
	
	@Test(expected = NegativeNumException.class)
	@Parameters({
		"3, -4.1"
		
	})
	public void cylinderThrowsExceptionIfNegativeRadius(float height, float radius) throws NegativeNumException{
		
		Cylinder cylinder = new Cylinder(height, radius);
		
		assertEquals(new NegativeNumException(), cylinder);
		
	}
}
