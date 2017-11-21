# Software Engineering Complete

#### A dedicated handbook on the whole development process of a software engineering project

_Based on [textbook](https://nus-cs2103.github.io/website/book/common/print.html) of CS2103T Software Engineering_<br>
_Correct as AY2017/2018 Semester 1_<br>
_School of Computing, National University of Singapore_

## Introduction

According to _IEEE Standard Glossary of Software Engineering Terminology_, software Engineering is the application of a systematic, disciplined, quantifiable approach to the development, operation, and maintenance of software.

According to _The Mythical Man-Month_, software engineering (or programming) is fun because:
- The sheer joy of making things;
- The pleasure of making things that are useful to other people;
- The fascination of fashioning complex puzzle-like objects of interlocking moving parts and watching them work in subtle cycles, playing out the consequences of principles built in from the beginning;
- The joy of always learning, which springs from the nonrepeating nature of the task;
- The delight of working in such a tractable medium.

Frederick P. Brooks also stated in his book, software engineering may not be fun because:
- One must perform perfectly;
- Other people set one's objectives, provide one's resources, and furnish one's information;
- The dependence upon others;
- Finding nitty little bugs is just tedious work;
- The last difficult bugs taking more time to find than the first;
- The product over which one has labored so long appears to be obsolete upon (or before) completion.

A software project may be either: 
- a _brown-field_ project: develop a product to replace/update an existing software product; or
- a _green-field_ project: develop a totally new system with no precedent.

## Requirements

A **software requirement** specifies a need to be fulfilled by the software product. Requirements come from stakeholders (a party that is potentially affected by the software project, usually users).

There are two types of software requirements:
- Functional requirements: specify what the system should do;
- Non-functional requirements (NFR): specify the constraints under which system is developed and operated, such as availability, budget constraint, capacity, compatibility, performance, portability, robustness, security, stability, testability.

### Gathering requirements

- Brainstorming: a group activity designed to generate many diverse and creative ideas, at which there are no "bad" ideas;
- User survey: to solicit responses and opinions from a large number of stakeholders;
- Observation: uncover product requirements by observing users in their natural work environment;
- Interview: interviewing stakeholders and domain experts;
- Focus group: a kind of informal interview within an interactive group setting;
- Prototyping: to create a mock-up, scaled-down version, or a partial system to see how users interact with the system;
- Product survey: to study existing products in the market.

### Specifying requirements

- Prose: a normal textual description to describe requirements, usually used as "_vision_";
- Feature list: a list of features of a product grouped according to some criteria such as aspect, priority;
- User story: a short, simple description of a feature (_both functional and NFRs_) told from the user's perspective, in the format of `As a {user type/role} I can {function} so that {benefit}`, where high-level user stories are called **epics**;
- Use case: to describe an interaction between the user (called "_actor_") and the system for a specific functionality of the system, which consists of a sequence of actions.
	- A use case describes only the externally visible behavior, not internal details, of a system;
	- A use case can have main success scenario (MSS) and extensions;
	- A use case can include another use case or use another use case as extension.

### Glossary

A glossary serves to ensure that all stakeholders have a common understanding of the noteworthy terms, abbreviation, acronyms, etc.

## Design

Design is the creative process of transforming the problem into a solution; the solution is also called design. There are two types of design in software engineering:
- Product/external design: designing the external behavior of the product to meet the users' requirements;
- Implementation/internal design: designing how the product will be implemented to meet the required external behavior.

In a large software engineering project, design should be done at multiple levels. This can be done in a top-down manner, bottom-up manner or a mix.

Apart from an overall design, sometimes **agile design** is also important but it is different in the following ways: agile designs are emergent, they're not defined up front. Although you will often do some initial architectural modeling at the very beginning of a project, this will be just enough to get your team going.

### Design principles

- Abstraction: _data abstraction_ ignores lower level data items and thinking in terms of bigger entities, while _control abstraction_ abstracts away details of the actual control flow to focus on tasks at a simplified level;
- Coupling: a measure of the degree of dependence between components, classes, methods, etc. `X is coupled to Y` if a change to Y can potentially require a change in X. High coupling is discouraged since maintenance, integration and testing will be harder. Thus, we should **reduce coupling**, or so-called **de-couple**.
- Cohesion: a measure of how strongly-related and focused the various responsibilities of a component are. Weak cohesion will lead to difficulty in understandability, maintainability and reusability of the module. Thus, we should **improve coheson**.
- **Open-closed Principle (OCP)**: _A module should be open for extension but closed for modification. That is, modules should be written so that they can be extended, without requiring them to be modified._
- **Dependency Inversion Principle** states that
	- High-level modules should not depend on low-level modules. Both should depend on abstractions;
	- Abstractions should not depend on details. Details should depend on abstractions.

### Object-oriented programming

- A programming paradigm guides programmers to analyze programming problems and structure programming solutions in a specific way. A few popular paradigm includes procedural programming (C), functional programming (JavaScript and Haskel) and object-oriented programming (Java);
- OOP views the world as a network of interacting objects. OOP solutions try to simulate such a network inside the computer's memory, although no need to follow the real world exactly;
- Object ultimately achieves three goals:
	- Encapsulation: to encapsulate both state (data) and behaviour (operations on data);
	- Abstraction: to abstract away the lower level details and work with bigger granularity entities;
	- Information hiding: state and behaviour only accessible via the interface;
	- Message passing: to interact with each other by sending messages.
- A class contains instructions for creating a specific kind of objects;
	- Class level members: variables or methods that are shared by all instances of a class, which are accessed via class name;
	- Enumeration: a fixed set of values that can be considered as a data type.

#### Class relationship

- Association: connections between objects or classes, may change over time;
	- Navigability: to decide which party knows the other class, usually identical to in which class the associated field is defined;
	- Multiplicity: to decide for each party how many objects take part in the association;
	- Association class: a normal class but plays the role of association in the network.
- Dependency: a weaker form of association, not directly linked in the network but still can interact with each other;
- Composition: to represent a strong **_whole-part_** relationship. When the _whole_ is destroyed, _parts_ are destroyed too;
- Aggregation: a weaker form of composition, to represent a **_container-contained_** relationship.

#### Class inheritance


## UML diagram

UML stands for unified modelling language.

### Architecture diagram

### Class diagram

### Object diagram 

### Sequence diagram

### Activity diagram

### Use case diagram

- Use a dashed line with `<<extend>>` to show **extension**;
	- Note the direction of the dashed line is from the extension to the use case it extends.
- Use a dotted arrow with `<<include>>` to show **inclusion**;
	- Note how the arrow direction is different from the << extend >> arrows.
- Use the notation for inheritance in class diagram to show **actor generalization**.

The diagram below shows how to draw a use case diagram:

![Use case diagram for a blog system](img/UseCaseDiagramBlogSystem.png)