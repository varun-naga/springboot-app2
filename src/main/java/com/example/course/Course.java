package com.example.course;

import com.example.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public Course(String id, String name, String description,String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic=new Topic(topicId,"","");
    }

    public Course() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {

        return description;
    }

    public String getId() {

        return id;
    }

    public void setTopic(Topic topic) {
        this.topic=topic;
    }
}
