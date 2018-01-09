package com.example.flowable;

import com.example.common.MyService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@EnableAutoConfiguration()
@EnableAutoConfiguration
public class FlowableApplication {

    public static void main(String[] args) {

        SpringApplication.run(FlowableApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner init(final MyService myService) {
//
//        return new CommandLineRunner() {
//            public void run(String... strings) throws Exception {
//                myService.createDemoUsers();
//            }
//        };
//    }

    @Bean
    public CommandLineRunner init(final RepositoryService repositoryService,
                                  final RuntimeService runtimeService,
                                  final TaskService taskService) {

        return strings -> {
            System.out.println("Number of process definitions : "
                    + repositoryService.createProcessDefinitionQuery().count());
            System.out.println("Number of tasks : " + taskService.createTaskQuery().count());
            runtimeService.startProcessInstanceByKey("oneTaskProcess");
            System.out.println("Number of tasks after process start: "
                    + taskService.createTaskQuery().count());
        };
    }

}
