package org.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junitparams.Parameters;

public class SphereUnitTest {
	
	@Test
	@Parameters({
		"5.5"
		
	})
	public void getRadius(float radius) throws NegativeNumException {
		
		Sphere sphere = new Sphere(radius);
		
		float expected = 5.5f;
		
		float actual = sphere.getRadius();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	
	@Test(expected = NegativeNumException.class)
	public void expectedNegativeNumException() throws NegativeNumException{
		
		throw new NegativeNumException();
		
	}
	
	@Test
	@Parameters({
		"34.5"
		
	})
	public void getSurfaceAreaTest1(float radius) throws NegativeNumException {
		
		Sphere sphere = new Sphere(radius);
		
		float expected = 14957.123f;
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"10"
		
	})
	public void getSurfaceAreaTest2(float radius) throws NegativeNumException {
		
		Sphere sphere = new Sphere(radius);
		
		float expected = 1256.637f;
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"45.1"
		
	})
	public void getSurfaceAreaTest3(float radius) throws NegativeNumException {
		
		Sphere sphere = new Sphere(null, radius);
		
		float expected = 25560.121f;
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"23"
		
	})
	public void getVolumeTest1(float radius) throws NegativeNumException {
		
		Sphere sphere = new Sphere(radius);
		
		float expected = 50965.01f;
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"18.5"
		
	})
	public void getVolumeTest2(float radius) throws NegativeNumException {
		
		Sphere sphere = new Sphere(radius);
		
		float expected = 26521.85f;
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	@Parameters({
		"1.345677"
		
	})
	public void getVolumeTest3(float radius) throws NegativeNumException {
		
		Sphere sphere = new Sphere(radius);
		
		float expected = 10.207f;
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0.001);
		
	}

	@Test(expected = NegativeNumException.class)
	@Parameters({
		"-4.1"
		
	})
	public void sphereThrowsExceptionIfNegativeRadius(float radius) throws NegativeNumException{
		
		Sphere sphere = new Sphere(radius);
		
		assertEquals(new NegativeNumException(), sphere);
		
	}
}
