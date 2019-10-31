package com.tech552.topicscourseapi.repository;

import com.tech552.topicscourseapi.dao.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by makerofapps on 10/20/19.
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

}
