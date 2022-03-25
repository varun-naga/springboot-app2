package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicservice.getAllTopics();

    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id) {
        return topicservice.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void AddTopic(@RequestBody Topic topic) {
        topicservice.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void UpdateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicservice.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicservice.deleteTopic(id);
    }
}
