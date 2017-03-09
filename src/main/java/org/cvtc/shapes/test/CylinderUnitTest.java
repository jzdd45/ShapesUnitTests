package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.NegativeNumException;
import org.cvtc.shapes.Renderer;
import org.cvtc.tests.substitute.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CylinderUnitTest {
	
	@Test
	public void test() throws NegativeNumException {
		Dialog dialog = new MessageBoxSub();
		Renderer cylinder = new Cylinder(dialog, 0, 0);
		
		int expected = 0x00;
		int actual = cylinder.render();
		
		assertEquals(expected, actual);

	}
	
	@Test
	@Parameters({
		"45.45, 4"
		
	})
	public void getHeight(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 4f;
		
		float actual = cylinder.getHeight();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	@Parameters({
		"5, 5.9999"
		
	})
	public void getRadius(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 5f;
		
		float actual = cylinder.getRadius();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	@Parameters({
		"10, 2"
		
	})
	public void getSurfaceAreaTest1(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 753.982f;
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	@Parameters({
		"12.456, 92.45"
		
	})
	public void getSurfaceAreaTest2(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 8210.295f;
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	@Parameters({
		"24.56, 56.5"
		
	})
	public void getSurfaceAreaTest3(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 12508.776f;
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	@Parameters({
		"23, 45"
		
	})
	public void getVolumeTest1(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 74785.61f;
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	@Parameters({
		"4, 450"
		
	})
	public void getVolumeTest2(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 22619.466f;
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test
	@Parameters({
		"45, 1"
		
	})
	public void getVolumeTest3(float height, float radius) throws NegativeNumException {
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		float expected = 6361.725f;
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0.001f);
		
	}
	
	@Test(expected = NegativeNumException.class)
	@Parameters({
		"-3, 4.1"
		
	})
	public void cylinderThrowsExceptionIfNegativeHeight(float height, float radius) throws NegativeNumException{
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
		assertEquals(new NegativeNumException(), cylinder);
		
	}
	
	@Test(expected = NegativeNumException.class)
	@Parameters({
		"3, -4.1"
		
	})
	public void cylinderThrowsExceptionIfNegativeRadius(float height, float radius) throws NegativeNumException{
		
		Cylinder cylinder = new Cylinder(null, height, radius);
		
	}
}
