package com.example.flowable;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.test.Deployment;
import org.flowable.engine.test.FlowableRule;
import org.flowable.task.api.Task;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:org/flowable/spring/test/junit4/springTypicalUsageTest-context.xml")
public class MyBusinessProcessTest {

//	@Autowired
//	private RuntimeService runtimeService;
//
//	@Autowired
//	private TaskService taskService;
//
//	@Autowired
//	@Rule
//	public FlowableRule flowableSpringRule;
//
//	@Test
//	@Deployment
//	public void simpleProcessTest() {
//		runtimeService.startProcessInstanceByKey("simpleProcess");
//		Task task = taskService.createTaskQuery().singleResult();
//		assertEquals("My Task", task.getName());
//
//		taskService.complete(task.getId());
//		assertEquals(0, runtimeService.createProcessInstanceQuery().count());
//
//	}
}