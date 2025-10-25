
# Introduction to Spring Boot

---

- [Introduction to Spring Boot](#introduction-to-spring-boot)
  - [What is Spring Boot?](#what-is-spring-boot?)
  - [Why have we chosen Spring boot?](#why-have-we-chosen-spring-boot?)
  - [Pros & Cons](#pros-&-cons)

---

## What is Spring Boot?

Spring Boot is a framework built for Java, specifically designed to make it quick and easy to develop and deploy applications — whether they’re web-based, microservices, or even non-web applications.

Spring Boot is part of the larger Spring ecosystem, which includes a variety of frameworks and tools that can be used alongside Spring Boot to enhance your applications. Spring Boot also comes equipped with several embedded web servers to help with rapid deployment such as Tomcat, Undertow, Netty, or Jetty. 

This helps significantly with development as applications can be easily and repeatedly deployed and tested leading to smoother and less obtuse development cycles

Not only is Spring Boot open source, but it also includes helpful tools to make starting new projects easier — such as Spring Initializr, an online GUI that lets developers quickly create and download new project templates with all the required dependencies pre-configured.

---

## Why have we chosen Spring boot?

In 2024 a survey was taken by the popular website Stackoverflow in which users were asked-

“Which web frameworks and web technologies have you done extensive development work in over the past year, and which do you want to work in over the next year? (If you both worked with the framework and want to continue to do so, please check both boxes in that row.)”

The results shown indicate that as of 2024 roughly 11330 users stated Spring Boot as this answer – which may not seem a lot but is nearly 1/3 of Node.js and React which are both widely considered some of the most used technologies ever!

---

As of 2025, although it remains clear that Node.js and React maintain their dominant spots – as JavaScript always will! – you can note that Spring Boot has jumped in popularity edging just behind FastAPI which Stackoverflow noted as “The +5 point increase for FastAPI is one of the most significant shifts in the web framework space”.

Considering Spring Boot is a Java framework specified for web application and microservice use, this is uncommon and we believe it to be the reason why it has jumped in popularity and will continue to do so!

---

## Pros & Cons

| Pros | Cons                                                                                                                                                                                                                                                                                                  |
|---|---|
| Rapid development: auto-configuration and starter dependencies  | Applications: can be heavier than minimal frameworks |
| Standalone: includes an embedded server | Relies on a lot of auto-configuration and hidden behaviour |
| Integrates seamlessly with the Spring ecosystem : Spring Data, Spring Security, Spring Cloud… | Use of starter packages can lead to dependency bloat | 
| Production-ready : e.g. Spring Boot Actuator | Scaling large systems is a challenge : complexity |
| Large, active community and excellent documentation | Not always the best choice for very small or resource-constrained services |
