package com;

import java.util.List;
import java.util.Map;

/**
 * <h1>ServiceManager!</h1> The ServiceManager interface provides methods to
 * create an entity, delete an entity and create multiple entities
 *
 * @author Suman Jha
 * @version 1.0
 * @since 2017-11-30
 */
public interface ServiceManager {
	public Entity createEntity(long id, String name) throws Exception;

	public void deleteEntity(Entity entity) throws Exception;

	public List<Entity> createEntities(Map<Long, String> entities) throws Exception;
}
