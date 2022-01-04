Spring framework provides a platform to developers not worry about the infrastructure rather focus on the application specific developments.

Core technologies of spring:

Spring framework works on the principle of inversion of control. Usually in java programming we create the objects and then pass those objects to other objects which needs them. where as in spring framework we dont need to create those objects rather spring creates, manages and configures those objects/beans. Hence the name inversion of control. The component which does that is called IOC container. 

org.springframework.beans and org.springframework.context -> IOC container

There are mainly two interfaces 1. BeanFactory and ApplicationContext the second one is the child interfaces of the first one.

## Container overview
org.springframework.context.ApplicationContext is the most prefered one then the BeanFactory. The IOC container reads the configuration metadata, then creates the beans and manages them. The configuration metadata can be provided in three ways: 1. XML configuration 2. Annotations 3. JAVA coding

For XML based configuration (see the respective folder code for details)

we provide the bean details in the xml file. The main tag used is the <bean> tag where the name and the class path for that bean is mentioned.
// to instantiate the beans we have two options 1. ClassPathXmlApplicationContext ( we keep the file in resource folder and mention the name alone) 2. FileSystemApplicationContext (specify the full path where it is present).

eg: ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

to get the bean we can use the method getbean like context.getbean(beanname,beanclass);

## Bean overview
Beans are created with the meta configuration data provided. The following metadata are provided: 1. A qualified class name 2. Behavioural elements such as callbacks,scope, lifecycle elements etc. 3. References to other beans that are required to work (dependencies). 4. Other configurations such as dataaccess objects etc.
		1. Naming the bean : <bean id ="bean1" class=...></bean> or <bean name="client,client2" class=..></bean>
id-> for representing unique name to the bean. If more than one name to the bean has to be given name attribute can be used. However if name or id are not provided ,
spring creates a name on its own.
		2.  Instantiating the bean
## Dependency injection
There are two types of dependency injection: 
1. constructor based injection 2. setter based injection

In the XML configuration for constructor , we use <constructor-arg and ref> to represent the bean to be injected in constructor level.

XML configuration for setter-> Here we use <property> tag to inject in the setter method other things remain the same .

In the case of annotation based. we have the following annotation which is important
1. @autowire - two types: by type and by value
2. @component - to declare the bean as component 
3. @primary - by default inject this object
4. @Qualifier- To specify which bean has to be injected, if two or more component is present

In the java configuration, @Bean @configuration is used
@Bean is method level- to specify which bean. It also supports init method and destroy method which is usefull in the life cycle events.
Bean scope : 1. Singleton (default) single bean definition is done to a single object per spring IOC container
2. Prototype - single bean definition to any number of object instances
3. Request, session, application and websocker are used for web application specific.

The folder in this repo contains two folders :1. constructor based 2. Setter based with each sub based on the type of configuration.

