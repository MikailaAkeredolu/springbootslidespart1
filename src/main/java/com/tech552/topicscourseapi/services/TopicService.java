package com.tech552.topicscourseapi.services;

import com.tech552.topicscourseapi.dao.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tech552.topicscourseapi.repository.TopicRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by makerofapps on 10/20/19.
 */
@Service
public class TopicService {

    @Autowired
     private TopicRepository topicRepository;

    @Autowired
    private TopicService topicService;

//    List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring","spring framework ", "spring framework description"),
//            new Topic("java","Core Java ", "Core Java description"),
//            new Topic("angular","Angualar 8", "Angualar 8 description")
//
//    ));

    public List<Topic>getAllTopics(){
        List<Topic> listOfTopics = new ArrayList<>(); //create a list
         topicRepository.findAll().forEach(listOfTopics::add);  //for each element found, convert each topic into a row, add the element into the list
         return listOfTopics;
         //  return topics;
    }

    public Optional<Topic> getTopicById(String id){

       return topicRepository.findById(id);
        //loop through list of topics and get the id that matches then return topic object
//        for(int x = 0; x < topics.size(); x++){
//            if(topics.get(x).getId().equals(id)){
//
//                return topics.get(x);
//            }
//        }
//        return null;
    }


    public void addTopic(Topic topic){
       // topics.add(topic);
        topicRepository.save(topic);
    }



    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
//        for(int x = 0; x < topics.size(); x++){
//            if(topics.get(x).getId().equals(id)){
//                topics.set(x,topic);
//                return;
//            }
//        }
    }



    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
//        for(int x = 0; x < topics.size(); x++){
//            if(topics.get(x).getId().equals(id)){
//                topics.remove(topics.get(x));
//                return;
//            }
//        }
    }



}




//loop through each topic
//check and match the id then return the object
//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

//A singleton instance in spring boot is an instance in memory - a stereo type annotation - marks the class as a spring service this way you can just grab the same instance that spring created
//To do you create a private member variable
//Spring will inject all the depepndecies with @Autowired - needs dependency injection



// return topics;
//use the topics com.tech552.topicscourseapi.repository built in methods


//findAll() is an iterable/ runs a query to get all the topics