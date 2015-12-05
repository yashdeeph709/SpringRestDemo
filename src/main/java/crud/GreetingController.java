package crud;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("/addGreeting")
    public Employee addGreeting(@RequestParam(value="id", defaultValue="0") int id,
    							@RequestParam(value="name", defaultValue="default") String name,
    							@RequestParam(value="age", defaultValue="11") int age,
    							@RequestParam(value="description", defaultValue="default") String description) {
        return new Employee(id,name, age, description);
    }
    @RequestMapping("/greetings")
    public Employee[] greetings(){
    	Employee[] employees=new Employee[3];
    	employees[0]=new Employee(0, "asdfasd", 0, "sadfasd");
    	employees[1]=new Employee(0, "asdfasdf", 0, "asdfasdf");
    	employees[2]=new Employee(0, "asdfasd", 0, "asfasdf");
		return employees;	
    }
}