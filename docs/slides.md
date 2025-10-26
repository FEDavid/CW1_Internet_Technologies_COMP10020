---
layout: default
title: "CW1 Internet Technologies COMP10020"
description: "Spring Boot Presentation"
permalink: /presentation/
---

{% include navbar.html %}

# Spring Boot Presentation

---
### Table of Contents
- [Spring Boot Presentation](#spring-boot-presentation)
  - [Introduction](#introduction)
  - [Examples](#examples)
  - [Technology](#technology)
  - [Tutorial](#tutorial)
  - [Conclusion](#conclusion)

---


![Cover Slide](Presentation/Slide1.jpg)



 

---

![Cover Slide](Presentation/Slide2.jpg)





---
## Introduction
---

![Cover Slide](Presentation/Slide3.jpg)

context / extra information

---

![Cover Slide](Presentation/Slide4.jpg)

 context / extra information

---

![Cover Slide](Presentation/Slide5.jpg)

 context / extra information

---

![Cover Slide](Presentation/Slide6.jpg)

Although Spring Boot is appreciated for the way it **simplifies Java development and accelerates productivity**, there are still some **challenges** to keep in mind.
Thanks to Spring Boot, developers can launch a project with minimal setup, without deploying to an external application server and benefit from many features such as those offered by Spring Boot Actuator.
However, all these features increase startup time and memory usage, make debugging harder, include unnecessary libraries and make configuration more complex in large projects.

---
## Examples
---

![Cover Slide](Presentation/Slide7.jpg)

Spring Boot is widely used for **microservices**, where each service runs independently and exposes a REST API. It’s also common in **web and backend development**, for servers handling requests from mobile or front-end clients. In **cloud-native environments**, it runs smoothly in Docker containers and deploys easily on platforms like AWS or Azure. It also supports **event-driven systems** through tools like Kafka or RabbitMQ, and remains a solid choice for **enterprise applications** such as batch processing or data pipelines.

---

![Cover Slide](Presentation/Slide8.jpg)

Behind the scenes of the online shop, **the system is built from several small services**: for example, one for products, one for users, and another for orders.
The **Order Service**, for example, is quick to build with Spring Boot:
-	**REST endpoints** can be created using @RestController,
-	**Connection to the database** can be done using Spring Data,
-	The application can be **monitored** through Spring Boot Actuator.
When it’s ready, the application is simply **packaged as an executable JAR file and can be run directly** (even inside a **Docker container**).


---


![Cover Slide](Presentation/Slide9.jpg)


 Netflix has over **200 million users** on their platform so their applications must be run through a framework that can handle that much traffic. Netflix has over **3000 applications all running through Spring Boot**.

Trivago has also distributed **hundreds of millions of specific, personalised offers** to users.

---
## Technology
---

![Cover Slide](Presentation/Slide10.jpg)

For both existing businesses and start-ups, **it is vastly easier to justify a project and to successfully get a point across through functioning prototypes that actually exist in front of a user** (even if a prototype is unfinished or bug-riddled), rather than through hypotheticals and ideas.

This is what makes Spring Boot such an attractive option. There's an understanding that more time spent in development without a working prototype means less user feedback, and could hold other departments of a project back.

---

![Cover Slide](Presentation/Slide11.jpg)

While other implementations such as EscapeLink exist, Hibernate is by far the most popular amongst them, with the most usage and in-depth documentation. 

Hibernate removes human error from database configuration by mitigating manual data entry and **produces intrinsically legitimate relations automatically through Java objects**.

---

![Cover Slide](Presentation/Slide12.jpg)

Netflix utilises Cassandra through Spring Boot to deal with the immense amout of data they hold. 

While Spring Boot comes equipped with fundamental support for a wealth of database frameworks, **these are not the only frameworks compatible with Spring Boot projects.** If developers are attached to other particular database frameworks (such as MySQL or PostgreSQL), these frameworks can still be manually configured as normal to work with Spring Boot.

---

## Tutorial
---

![Cover Slide](Presentation/Slide13.jpg)

context / extra information

---

![Cover Slide](Presentation/Slide14.jpg)

context / extra information

---

![Cover Slide](Presentation/Slide15.jpg)

context / extra information

---

## Conclusion
---

![Cover Slide](Presentation/Slide16.jpg)

With AI solutions increasing in popularity at a seemingly exponential rate, there **isn't time for development teams to manually navigate through obtuse configuration procedures** and cobble together solutions that theortically might work. Spring Boot is built fundamentally with ease-of-use and smooth deployments in mind.
