package com.springbootquickstart.courseapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootquickstart.courseapi.dto.Topic;
import com.springbootquickstart.courseapi.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicservice;

	@RequestMapping(path = "/topics")
	public List<Topic> getTopics() {
		return topicservice.getTopics();
	}

	@RequestMapping(path = "/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicservice.getTopicById(id);
	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicservice.updateTopic(id, topic);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicservice.deleteTopic(id);
	}

}
