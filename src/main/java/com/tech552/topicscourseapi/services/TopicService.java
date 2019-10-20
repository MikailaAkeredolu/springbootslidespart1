package com.tech552.topicscourseapi.services;

import dao.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by makerofapps on 10/20/19.
 */
@Service
public class TopicService {
    @Autowired
    private TopicService topicService;

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","spring framework ", "spring framework description"),
            new Topic("java","Core Java ", "Core Java description"),
            new Topic("angular","Angualar 8", "Angualar 8 description")

    ));

    public List<Topic>getAllTopics(){
        return topics;
    }

    public Topic getTopicById( String id){
        //loop through list of topics and get the id that matches then return topic object
        for(int x = 0; x < topics.size(); x++){
            if(topics.get(x).getId().equals(id)){

                return topics.get(x);
            }
        }
        return null;
    }


    public void addTopic(Topic topic){
        topics.add(topic);
    }



    public void updateTopic(String id, Topic topic) {
        for(int x = 0; x < topics.size(); x++){
            if(topics.get(x).getId().equals(id)){
                topics.set(x,topic);
                return;
            }
        }
    }



    public void deleteTopic(String id) {
        for(int x = 0; x < topics.size(); x++){
            if(topics.get(x).getId().equals(id)){
                topics.remove(topics.get(x));
                return;
            }
        }
    }



}




//loop through each topic
//check and match the id then return the object
//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

//A singleton instance in spring boot is an instance in memory - a stereo type annotation - marks the class as a spring service this way you can just grab the same instance that spring created
//To do you create a private member variable
//Spring will inject all the depepndecies with @Autowired - needs dependency injection
