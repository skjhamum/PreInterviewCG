package com;
/**
 * <h1>TestExercise!</h1> The TestExercise provide junit test cases to verify ServiceManager implementation
 *
 * @author Suman Jha
 * @version 1.0
 * @since 2017-11-30
 */

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExercise {

	private ServiceManager serviceManager;

	@BeforeClass
	public void initialize() {
		serviceManager = new ServiceManagerClass();
	}

	@AfterClass
	public void clean() {
		serviceManager = null;
	}

	// This test case will verify createEntity implementation
	@Test
	public void testcreateEntity() {

		try {
			Entity entity = serviceManager.createEntity(100, "firstEntity");
			// it should return Entity instance
			assertNotNull("Entity should not be null", entity);
			// id should be same which we provide
			assertEquals("Id should be same", entity.getId(), 100);
		} catch (Exception e) {
			fail("It should not throw Exception");
			e.printStackTrace();
		}
	}

	// This test case is for failure case if we provide id value as 0
	@Test
	public void testcreateEntityForIdValueAsZero() {

		try {
			Entity entity = serviceManager.createEntity(0, "firstEntity");
			fail("It should throw Exception");
		} catch (Exception e) {
		}
	}

	// This test case is for failure case if we provide name as null
	@Test
	public void testcreateEntityForNameAsNull() {

		try {
			Entity entity = serviceManager.createEntity(100, null);
			fail("It should throw Exception");
		} catch (Exception e) {
		}
	}

	// This test case will verify delete implementation
	@Test
	public void testDeleteEntity() {

		try {
			Entity entity = new Entity();
			entity.setId(100);
			entity.setName("firstEntity");
			
			serviceManager.deleteEntity(entity);
		} catch (Exception e) {
			fail("TestDeleteEntity method should not throw Exception");
			e.printStackTrace();
		}
	}
	//We can add few more methods to verify createEntities

}
