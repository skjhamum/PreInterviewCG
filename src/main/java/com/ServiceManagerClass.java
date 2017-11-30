package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * <h1>ServiceManagerClass!</h1> The ServiceManager class provides methods to
 * create an entity, delete an entity and create multiple entities
 *
 * @author Suman Jha
 * @version 1.0
 * @since 2017-11-30
 */
public class ServiceManagerClass implements ServiceManager {

	/**
	 * createEntity.
	 * 
	 * @param id
	 *            A variable of type long.
	 *@param name
	 *            A variable of type String.
	 * @return 
	 * 			  An Entity data type.
	 */
	@Override
	public Entity createEntity(long id, String name) throws Exception {
		if(0 <= id)
			throw new Exception("Please provide valid id");
		
		if(null == name || "".equals(name.trim()))
			throw new Exception("Please provide valid name");
		Entity entity = new Entity();
		entity.setId(id);
		entity.setName(name);
		
		return entity;
	}

	/**
	 * deleteEntity.
	 * 
	 *@param enity
	 *            A variable of type Entity.
	 * @return 
	 * 			  An Entity data type.
	 */
	@Override
	public void deleteEntity(Entity entity) throws Exception {
		if(null ==entity)
			throw new Exception("Entity cannot be null");
		//delete entity
	}

	@Override
	public List<Entity> createEntities(Map<Long, String> entities) throws Exception{
		if(null ==entities || entities.isEmpty())
			throw new Exception("Entities cannot be null or empty");
		
		List<Entity> list = new ArrayList<>();
		for(long id:entities.keySet())
		{
			Entity entity = new Entity();
			entity.setId(id);
			entity.setName(entities.get(id));
			
			//add in EntityList
			list.add(entity);
		}
		
		return list;
	}

}
