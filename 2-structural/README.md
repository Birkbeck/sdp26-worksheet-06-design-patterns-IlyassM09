# Worksheet on Design Patterns - Part II

## Structural Design Patterns

In these exercises we will be examining the following design patterns:

1. Adapter 
2. Bridge
3. Composite 
4. Decorator 
5. Facade
6. Flyweight
7. Proxy

---

### Adapter
  
A software developer, Max, has worked on an e-commerce website. 
The website allows users to shop and pay online. The site is integrated with a third-party 
payment gateway, through which users can pay their bills using their credit card.  
Everything was going well, until his manager called him for a change in the project.

The manager has told him that they are planning to change the payment gateway vendor, 
and Max has to implement that in the code. The problem that arises here is that the site 
is attached to the `Xpay` payment gateway which takes an `Xpay` type of object. 
The new vendor, `PayD`, only allows the `PayD` type of objects to allow the process. 
Max doesn't want to change the whole set of a hundred classes which have reference to 
an object of type `XPay`. He cannot change the third party tool provided by the payment gateway. 
	
The problem arises due to the incompatible interfaces between the two different parts of the code. 
To get the process to work, Max needs to find a way to make the code compatible with the vendor's 
provided API.

The current code interface is not compatible with the new vendor's interface. 
What Max needs here is an *Adapter* which can sit in between the code and the vendor's API, 
enabling the transaction to proceed.

```java
	public interface Xpay {
		String getCreditCardNo();
	    String getCustomerName();
	    String getCardExpMonth();
	    String getCardExpYear();
        short getCardCVVNo();
	    double getAmount();
	
	    void setCreditCardNo(String creditCardNo);
		void setCustomerName(String customerName);
		void setCardExpMonth(String cardExpMonth);
		void setCardExpYear(String cardExpYear);
		void setCardCVVNo(short cardCVVNo);
		void setAmount(double amount);	
	}
```

The `Xpay` interface contains setter and getter methods for the information about 
the credit card and customer name. The interface is implemented by the class `XpayImpl`
in the repository. 
	
The new vendor's interface looks like this:
	
```java
	public interface PayD {
		String getCustCardNo();
        String getCardOwnerName();
        String getCardExpMonthDate();
		int getCVVNo();
	    double getTotalAmount();
        
        void setCustCardNo(String custCardNo);
	    void setCardOwnerName(String cardOwnerName);
        void setCardExpMonthDate(String cardExpMonthDate); 
        void setCVVNo(int cVVNo);
		void setTotalAmount(double totalAmount);
	}
```

As you can see, this interface has a set of different methods which 
need to be implemented in the code. However, `Xpay` objects are created by most parts of the code, 
and it is difficult (and risky) to change the entire set of classes. 
We need some way, that's able to fulfil the vendor's requirement to process the payment  
and also make less or no change to the current code base. 
	
You are required to use the *Adapter* pattern to implement a `XpayToPayDAdapter` 
class to meet the requirements.  
We can test your class to see whether it can solve the Max’s problem using the 
`RunAdapterExample` class from the repository.

### Bridge

Consider a scenario where, Sec Security System is a security and electronic company which produces 
and assembles products for cars. It delivers any car electronic or security system you want, 
from airbags to GPS tracking system, reverse parking system, etc. Big car companies use its 
products in their cars. The company uses a well-defined object-oriented approach to keep track 
of their products using software which is developed and maintained by them only. 
They get the car, produce the system for it and assemble it into the car.

Recently, they got new orders from BigWheel (a car company) to produce central locking 
and gear lock system for their new XZ model. To maintain this, they are creating a new software system. 
They started by creating a new abstract class `CarProductSecurity`, in which they kept some 
car-specific methods and some of the features which they thought are common to all security products. 
Then they extended the class and created two different subclasses named them `BigWheelXZCentralLocking`, 
and `BigWheelXZGearLocking`. 

After a while, another car company Motoren asked them to produce a new system of central locking 
and gear lock for their LM model. Since the same security system cannot be used in both models 
of different cars, the Sec Security System has produced the new system for them, 
and also has created to new classes `MotorenLMCentralLocking` and `MotorenLMGearLocking`, 
which also extend the `CarProductSecurity` class. 

So far so good, but what happens if another car company demands another new system of central locking 
and gear lock? One needs to create another pair of new classes for it. 
This design will create one class per system, or worse, if the reverse parking system is produced 
for each of these two car companies, two more new classes will be created for each of them.

A design with too many subclasses is not flexible and is hard to maintain. Inheritance 
also binds an implementation to the abstraction permanently, which makes it difficult to modify, 
extend, and reuse the abstraction and implementation independently.
Note that the car and the product should vary independently in order to make the software system 
easy to extend and reusable. The *Bridge* design pattern can resolve this problem.

The Bridge Pattern’s intent is to decouple an abstraction from its implementation 
so that the two can vary independently. It puts the abstraction and implementation 
into two different class hierarchies so that both can be extended independently.

The components of the Bridge Pattern are an abstraction, refined abstraction, 
an implementer, and concrete implementer. An abstraction defines the abstraction’s 
interface and also maintains a reference to an object of type implementer, 
and the link between the abstraction and the implementer is called a Bridge.
Refined Abstraction extends the interface defined by the abstraction. 
The Implementer provides the interface for implementation classes (concrete implementers). 
And the Concrete Implementer implements the Implementer interface and defines its concrete implementation. 
The Bridge Pattern decouples the interface and the implementation. 
As a result, an implementation is not bound permanently to an interface. 
The implementation of an abstraction can be configured at run-time.

For above scenario, instead of creating a subclass for each product per car model, 
we can separate the design into two different hierarchies. 
One interface `Product` is for the product which will be used as an implementer 
and the other, `Car`, will be an abstraction of car type. 
The implementer will be implemented by the concrete implementers (`Central Locking` and `GearLocking`), 
which will implementation the interface.
On the other side, the abstraction, `Car`, will be extended by more refined abstraction, `BigWheel` 
and `Motoren`. 

Provide implementations of the required methods and constructors so that 
the test code in `TestBridgePattern` produces the following output:

```
Producing Central Locking System
Modifying product Central Locking System according to BigWheel XZ model
Assembling Central Locking System for BigWheel XZ model
Car: BigWheel XZ model, Product:Central Locking System

Producing Gear Locking System
Modifying product Gear Locking System according to BigWheel XZ model
Assembling Gear Locking System for BigWheel XZ model
Car: BigWheel XZ model, Product:Gear Locking System
-----------------------------------------------------
Producing Central Locking System
Modifing product Central Locking System according to Motoren LM model
Assembling Central Locking System for Motoren LM model
Car: Motoren LM model, Product:Central Locking System

Producing Gear Locking System
Modifing product Gear Locking System according to Motoren LM model
Assembling Gear Locking System for Motoren LM model
Car: Motoren LM model, Product:Gear Locking System
```




### Composite

HTML is hierarchical in nature, its starts from an `<html>` tag which is the parent or the root element,  
and it contains other tags which can be a parent or a child tag.  

The *Composite* design pattern in Java can be implemented using the component class as an 
abstract class or an interface. In this question, you will use an abstract class, which contains 
all the important methods used in a composite class and two leaf class.

```java
	import java.util.List;

    public abstract class HtmlContent {
        public abstract String getTagName();

        public void addChild(HtmlContent htmlTag) {
            throw new UnsupportedOperationException("Current operation is not support for this object");
        }

        public void removeChild(HtmlContent htmlTag) {
            throw new UnsupportedOperationException("Current operation is not support for this object");
        }

        public List<HtmlContent> getChildren() {
            throw new UnsupportedOperationException("Current operation is not support for this object");
        }

        public abstract String getHtml();
    }
```
	
Given the above class, complete three subclasses of the class:
	
+ `HtmlText` represents a fragment of an HTML document that contains text but no tags inside it
(leaf nodes);
+ `HtmlVoidElement` represents an HTML fragment that contains a single tag but has no nested elements, 
e.g., `<br/>` or `<img src="http://abc.com/image.png"/>`;
+ `HtmlNormalElement` is used for fragments of HTML documents that are enclosed in an opening tag 
and a matching closing tag and can contain other elements (text, void or normal elements).

Method `getChildren` gives access to the contents of the normal element. 
For example, `<p>Some text</p>` will have an `HtmlText` object
with `Some text` as its only child; this element's tag name will be `p`. 

The `TestCompositePattern` class, from the repository, should be used to test out your classes.
The code should produce the following output:
	
```html
    <html>
    <body>
    <p>
    Testing html tag library
    <br/>
    Start a new line
    </p>
    <p>
    Paragraph 2
    </p>
    </body>
    </html>
```

### Decorator

You are commissioned by a pizza company make an extra topping calculator. 
A user can ask to add extra topping to a pizza and our job is to add toppings and 
increase its price using our classes.

**Please note**: the main aim of the *Decorator* design pattern is to attach 
additional responsibilities to an object dynamically. 

+ Decorators provide a flexible alternative to subclassing for extending functionality. 
+ Decorators prevent the proliferation of subclasses leading to less complexity and confusion.

For simplicity, let's create a simple `Pizza` interface which contains only two methods:

```java
    public interface Pizza { 
        String getDesc();
        double getPrice();
    }
```

The `getDesc` method is used to obtain the pizza's description, whereas the `getPrice` method 
is used to obtain the price.

Provide two implementations of the `Pizza` interface:

+ `SimplyVegPizza`,
+ `SimplyNonVegPizza`.

The decorator wraps the object whose functionality needs to be increased, 
so it needs to implement the same interface. 
Provide an *abstract decorator* class which will be extended by all the concrete decorators.

Now provide several implementations of `PizzaDecorator` and 
check out your classes with the given test class (`TestDecoratorPattern`)

+ `Cheese implements PizzaDecorator`
+ `Green Olives implements PizzaDecorator`
+ `Ham implements PizzaDecorator`
+ `Meat implements PizzaDecorator`
+ `RomaTomatoes implements PizzaDecorator`

The code should produce the following output:

```
  Desc: SimplyVegPizza (230), Roma Tomatoes (5.20), Green Olives (5.47), Spinach (7.92)
  Price: 248.59
  Desc: SimplyNonVegPizza (350), Meat (14.25), Cheese (20.72), Cheese (20.72), Ham (18.12)
  Price: 423.81
 ```

### Facade

"BetterBisc" is product-based company, and it has launched a product in the market, 
named "Schedule Server".
It is a kind of server in itself, and it is used to manage jobs. The jobs could be any kind of jobs 
like sending a list of emails, SMS, reading or writing files from a destination, 
or just simply transferring files from a source to the destination.
	
The product is used by the developers to manage such types of job and enables them to concentrate 
on their business goals. The server executes each job at their specified time and also manages 
any underling issues like concurrency, security, etc. As a developer, one just needs to code 
the relevant business requirements and a good amount of API calls is provided to schedule 
a job according to their needs.
	
Everything was going fine, until the clients started complaining about starting and 
stopping the server.  Although the server is working well, the initialisation and the 
shutdown processes are very complex, and they want an easy way to do that. 
The server has exposed a complex interface to the clients which looks a bit *busy* to them.
	
We need to provide an easy way to *start* and *stop* the server.
	
A complex interface to the client is already considered as a fault in the design of the current system. 
Fortunately or unfortunately, we cannot start the design and the coding from scratch. 
We need a way to resolve this problem and make the interface easy to access.
	
The problem faced by the clients in using the schedule server is the complexity brought 
by the server in order to start and stop its services. The client wants a simple way to do it.  

To start the server, the client needs to create an object of the `ScheduleServer` class and then 
needs to call the following methods (in sequence) to start and initialise the server.

```java
	ScheduleServer scheduleServer = new ScheduleServer();	
	scheduleServer.startBooting();
	scheduleServer.readSystemConfigFile();
	scheduleServer.init();
	scheduleServer.initializeContext();
	scheduleServer.initializeListeners();
	scheduleServer.createSystemObjects();
	System.out.println("Start working......");
	System.out.println("After work done.........");
```
	
To stop the server, the client needs to call the following methods in sequence:
	
```java
	scheduleServer.releaseProcesses();
	scheduleServer.destroy();
	scheduleServer.destroySystemObjects();
	scheduleServer.destroyListeners();
	scheduleServer.destroyContext();
	scheduleServer.shutdown();	
```
	
To resolve this, you will create a *Facade* class `ScheduleServerFacadeImpl`,
which will *wrap* a server object. 
This class will provide a simple interface (methods) for the client. 
These interfaces internally will call the methods on the server object.
The code below shows how facade makes a complex interface simple to use:
	
```java
	public class TestFacade {
		public static void main(String[] args) {
            ScheduleServer scheduleServer = new ScheduleServerImpl();
            ScheduleServerFacade facadeServer = new ScheduleServerFacadeImpl(scheduleServer);
            facadeServer.startServer();

            System.out.println("Start working......");
            System.out.println("After work done.........");

            facadeServer.stopServer();
		}
	}
```

### Flyweight

Let’s consider the following scenario. The X-programming site allows users to create and 
execute programs using their favorite programming language. It provides you with plenty of 
programming language options. You choose one, write a program with it and execute it to see the result. 
But now the site has started losing its users, the reason being the slowness of the site. 
The users are not interested in it anymore. The site is very popular and sometimes there could be 
more than thousands of programmers using it. Because of that, the site is crawling. 
But the heavy usage is not the real problem behind the slowness of the site.

The class `Code` below is used to set the code done by the programmer in order to get it executed. 
The `Code` object is a lightweight simple object having a property `code` along with its setter and getter.

```java
    public class Code {
        private String code;
        
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
```

The `Platform` interface is implemented by the language-specific platform in order to execute the code. 
It has one method, `execute`, which takes the `Code` object as its parameter.

```java
    public interface Platform {
        void execute(Code code);
    }
```

For example, class `JavaPlatform` implements the `Platform` interface and provides an implementation 
for the `execute` method to run the code in Java.

```java
    public class JavaPlatform implements Platform {
        public JavaPlatform() {
            System.out.println("JavaPlatform object created");
        }

        @Override
        public void execute(Code code) {
            System.out.println("Compiling and executing Java code: " + code);
        }
    }
```

The `Code` object is light-weight, and there should also be one `Code` object per user code. 
But, the `Platform` is a heavy object, which is used to set the execution environment. 
Creating too many `Platform` objects is a time-consuming and heavy task. 
We need to control the creation of the `Platform` object which can be done using the *Flyweight Pattern*.

The intent of the Flyweight Pattern is to use shared objects to support large numbers of 
fine-grained objects efficiently. A *flyweight* is a shared object that can be used 
in multiple contexts simultaneously. The flyweight acts as an independent object 
in each context – it’s indistinguishable from an instance of the object that’s not shared.

The key concept here is the distinction between intrinsic and extrinsic state. 
*Intrinsic state* is stored in the flyweight; it consists of information that’s independent 
of the flyweight’s context, thereby making it sharable. The *extrinsic state* depends on 
and varies with the flyweight’s context and therefore can’t be shared. 
Client objects are responsible for passing extrinsic state to the flyweight when it needs it.

You need to implement the flyweight factory class `PlatformFactory`, in particular, its class 
method `getPlatformInstance` that returns shared `Platform` instances, one for each of the 
programming languages (C, C++, Java and Ruby). Hint: using a map would make the task easy.

The test code in `TestFlyweight` should produce the following output:

```
CPlatform object created
Compiling and executing C code: C Code...
-------------------------------------
Compiling and executing C code: C Code2...
-------------------------------------
JavaPlatform object created
Compiling and executing Java code: JAVA Code...
-------------------------------------
Compiling and executing Java code: JAVA Code2...
-------------------------------------
RubyPlatform object created
Compiling and executing Ruby code: RUBY Code...
-------------------------------------
Compiling and executing Ruby code: RUBY Code2...
-------------------------------------
```

### Proxy

The *Proxy* design pattern which has several variations, which include Virtual Proxy and Protection Proxy.
   
#### Virtual Proxy
    	
The *Virtual Proxy* design pattern is a memory saving technique that recommends 
postponing an object creation until it is needed; it is used when creating an object the 
is expensive in terms of memory usage or processing involved.
    	
Suppose there is a `Company` object in your application and this object contains 
a list of employees of the company in a `ContactList` object. There could be thousands 
of employees in a company. Loading the `Company` object from the database along with 
the list of all its employees in the `ContactList` object could be very time-consuming. 
In some cases you don’t even require the list of the employees, but you are forced 
to wait until the company and its list of employees loaded into the memory.
    	
One way to save time and memory is to avoid loading of the employee objects until required,  
and this is done using the *Virtual Proxy*.  This technique is also known as *Lazy Loading*, 
where you are fetching the data only when it is required. 
   
The  `Company` class (provided in the repository) has a reference to `ContactList` 
interface whose real object will be loaded only when requested by a call of the `contactList()` method.

```java
   import java.util.List;

   public interface ContactList { 
       List<Employee> getEmployeeList();
   }
```
   
The `ContactList` interface only contains one method, `getEmployeeList()`, 
which is used to obtain the employee list of the company (see the class `ContactListImpl` 
from the repository). The class should create a real `ContactList` object, 
which will return the list of employees of the company. The object will be *loaded on demand*, 
only when required (see the class `ContactListProxyImpl`).  `ContactListProxyImpl` 
is the proxy class which also implements `ContactList` and holds a reference to the real `ContactList` 
object. In the implementation of the method `getEmployeeList()` that you will provide,
the method will check if the `contactList` reference is `null`, 
then it will create a real `ContactList` object and then 
will invoke the `getEmployeeList()` method on it to get the list of the employees. 
An  `Employee` class is also provided in the repository: 
   
You should then test your code with the `TestVirtualProxy` class from the repository, 
and it should produce the following output:
    	
```
   Company object created...
   Company Name: ABC Company
   Company Address: Alabama
   Company Contact No.: 011-2845-8965
   Requesting for contact list
   Creating contact list and fetching list of employees...
   Employee Name: Employee A, EmployeeDesignation: SE, Employee Salary: 2565.55
   Employee Name: Employee B, EmployeeDesignation: Manager, Employee Salary: 22574.0
   Employee Name: Employee C, EmployeeDesignation: SSE, Employee Salary: 3256.77
   Employee Name: Employee D, EmployeeDesignation: SSE, Employee Salary: 4875.54
   Employee Name: Employee E, EmployeeDesignation: SE, Employee Salary: 2847.01	
```
   
#### Protection Proxy
   
In general, objects in an application interact with each other to implement 
the overall application functionality.  Most application object are generally accessible 
to all other objects in the application. At times, it may be necessary to restrict 
the accessibility of an object only to a limited set of client objects based 
on their access rights.  When a client object tries to access such an object, 
the client is given access to the services provided by the object only if the client 
can furnish proper authentication credentials. In such cases,  separate object can be 
designated with the responsibility of verifying the access 
privileges of different client objects when they access the actual object. 
   
In other words, every client must successfully authenticate with this designated object 
to get access to the actual object functionality. Such an object with which a client 
needs to authenticate to get access to the actual object can be referred as an object 
authenticator which is implemented using the *Protection Proxy* design pattern.
   
We will return to the `ReportGenerator` application that you worked on earlier 
for the pizza company. The owner now requires that only she can generate the daily report and that 
no other employee should be able to do so. To implement this security feature, 
you are going to use the *Protection Proxy* design pattern which will check if the object which is 
trying to generate the report is the owner; 
in this case, the report gets generated, otherwise it will not.

```java
   public interface Staff { 
        boolean isOwner();
        void setReportGenerator(ReportGeneratorProxy reportGenerator);
   }
```
   
The `Staff` interface is used by the `Owner` and the `Employee` 
classes and the interface has two methods: 
   
+ `isOwner()` returns a boolean to check whether the calling object is the owner or not.
+ The other method is used to set the `ReportGeneratorProxy`, which is a protection proxy 
used to generate the report.
   
See the `Employee` class in the repository which implements the `Staff` interface. 
Since it's an employee, `isOwner()` method returns `false`. 
The `generateDailyReport()` method asks `ReportGenerator` to generate the daily report. 
   
The `Owner` class looks almost the same as the `Employee` class; 
the only real difference is that the `isOwner()` method returns `true`.
   
The `ReportGeneratorProxy` acts as a *Protection Proxy*, 
which has only one method `generateDailyReport()` that is used to generate the report. 
You should implement the method so that it first checks whether the staff member is authorised
to see the report. If so, the method generates the report (see Remote Proxy for the RMI code);
otherwise it returns a string with `"Not Authorised to view report"` as the message.

The `TestProtectionProxy` test code should produce the following output:
   
```
   For owner:
   ********************Location X Daily Report********************
   Location ID: 012
   Today’s Date: Sun Sep 14 13:28:12 IST 2014
   Total Pizza Sell: 112
   Total Sale: $2534
   Net Profit: $1985
   
   ***************************************************************
   
   For employee:
   Not Authorised to view report.	
```
   