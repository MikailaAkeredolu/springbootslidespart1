package com.tech552.topicscourseapi.controller;

import com.tech552.topicscourseapi.dao.Topic;
import com.tech552.topicscourseapi.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by makerofapps on 10/20/19.
 */
@RestController
public class TopicController {

    @Autowired
    TopicService topicService;


    @RequestMapping(method = RequestMethod.GET, value="/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.GET, value ="/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopicById(id);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
         topicService.addTopic(topic);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }


    @RequestMapping(method = RequestMethod.DELETE, value ="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}
