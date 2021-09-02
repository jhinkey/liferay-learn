# Service Builder Generated Classes

If you run Service Builder on an entity that has both `local-service` and `remote-service` attributes are set to `true` the `service.xml` file, Service Builder generates local and remote service classes in the `-service` module and its corresponding `-api` module.

## Module Structures

`-api` module generated classes:

```
[app]-api/src/main/java/[package-path]
├── exception
│   └── NoSuch[Entity]Exception.java
├── model
│   ├── [Entity].java
│   ├── [Entity]Model.java
│   ├── [Entity]Soap.java
│   ├── [Entity]Table.java
│   └── [Entity]Wrapper.java
└── service
    ├── persistence
    │   ├── [Entity]Persistence.java
    │   └── [Entity]Util.java
    ├── [Entity]LocalService.java
    ├── [Entity]LocalServiceUtil.java
    └── [Entity]LocalServiceWrapper.java

[app]-service/src/main/java/[package-path]
├── model
│   └── impl
│       ├── [Entity]BaseImpl.java
│       ├── [Entity]CacheModel.java
│       ├── [Entity]Impl.java // CUSTOMIZABLE
│       └── [Entity]ModelImpl.java
└── service
    ├── base
    │   └── [Entity]LocalServiceBaseImpl.java
    ├── impl
    │   └── [Entity]LocalServiceImpl.java // CUSTOMIZABLE
    └── persistence
        └── impl
            ├── constants
            │   └── [App]PersistenceConstants.java
            └── [Entity]PersistenceImpl.java
```

The generated model, persistence, and service classes are explained next.

## Model Classes

Here are the key model classes:


| Class | Module | Description |
| :---- | :----- | :---------- |
| `[Entity]` | api | `[Entity]` model interface which extends `[Entity]Model`. |
| `[Entity]BaseImpl` | service | Extends the `[Entity]ModelImpl` to represents a row in the `[App]_[Entity]` database table, with each column mapped to a `[Entity]Model` property. |
| `[Entity]CacheModel` | service | Represents the entity in cache. |
| `[Entity]Impl` | service |  (**CUSTOMIZABLE**) Model implementation. You can use this class to add helper methods and application logic to your model. If you don't add any helper methods or application logic, only the auto-generated field getters and setters are available. Whenever you add custom methods to this class, Service Builder adds corresponding methods to the `[Entity]` interface the next time you run it. |
| `[Entity]Model` | api | Base model interface. This interface and its `[Entity]ModelImpl` implementation serve only as a container for the  default property accessors Service Builder generates. Any helper methods and all application logic should be added to `[Entity]Impl`. |
| `[Entity]ModelImpl` | service | Base model implementation. |
| `[Entity]Soap` | api | SOAP model, similar to `[Entity]ModelImpl`. `[Entity]Soap` is serializable; it does not implement `[Entity]`. |
| `[Entity]Table` | api | Represents the entity's table. |
| `[Entity]Wrapper` | api | Wrapper, wraps `[Entity]`. This class is  designed to be extended and it lets you [customize the entity](/docs/7-2/customization/-/knowledge_base/c/overriding-service-builder-services-service-wrappers). |

## Persistence Classes

Here are the key persistence clases:

| Class | Module | Description |
| :---- | :----- | :---------- |
| `[Entity]Persistence` | api | Persistence interface that defines CRUD methods for the entity such as `create`, `remove`, `countAll`, `find`, `findAll`, etc. |
| `[Entity]PersistenceImpl` | impl | Persistence implementation class that implements `[Entity]Persistence`. |
| `[Entity]Util` | api | Persistence utility class that wraps `[Entity]PersistenceImpl` and provides direct access to the database for CRUD operations. This utility should only be used by the service layer; in your portlet classes, use the `[Entity]` class by referencing it with the [`@Reference` annotation](/docs/7-2/frameworks/-/knowledge_base/f/declarative-services). |

![Figure 1: Service Builder generates these persistence classes and interfaces for an example entity called *Event*. You shouldn't (and you won't need to) customize any of these classes or interfaces.](./01-understanding-the-code-generated-by-service-builder-intro/images/service-builder-persistence-diagram.png)

## Local Service Classes

Local services are generated if `local-service="true"` for the entity in the `service.xml`. Here are the key local service classes:

| Class | Module | Description |
| :---- | :----- | :---------- |
| `[Entity]LocalService` | api | Local service interface. |
| `[Entity]LocalServiceBaseImpl` | service | Local service base implementation. This is an abstract class. Service Builder injects a number of instances of various service and persistence classes into this class. `@abstract` |
| `[Entity]LocalServiceImpl` (**CUSTOMIZABLE**) | service | Local service implementation. This is the only class in the local service that you should modify | service | it's where you add your business logic. For any methods added here, Service Builder adds corresponding methods to the `[Entity]LocalService` interface the next time you run it. |
| `[Entity]LocalServiceUtil` | api | Local service utility class  which wraps `[Entity]LocalServiceImpl`. This class is generated for backwards compatibility purposes only. Use the `*LocalService` class by referencing it with the [`@Reference` annotation](/docs/7-2/frameworks/-/knowledge_base/f/declarative-services). |
| `[Entity]LocalServiceWrapper` | api | Local service wrapper which implements `[Entity]LocalService`. This class is designed to be extended and it lets you [customize the entity's local services](/docs/7-2/customization/-/knowledge_base/c/overriding-service-builder-services-service-wrappers). |

## Local Service Classes

Remote services are generated if `remote-service="true"` for the entity in the `service.xml`. Here are the key remote service classes:

| Class | Module | Description |
| :---- | :----- | :---------- |
| `[Entity]Service` | api | Remote service interface. 
| `[Entity]ServiceImpl` (**CUSTOMIZABLE**) | service | Remote service implementation. This is the only class in the remote service that you should modify manually. Here, you can write code that adds additional security checks and invokes the local services. For any custom methods added here, Service Builder adds corresponding methods to the `[Entity]Service` interface the next time you run it. 
| `[Entity]ServiceBaseImpl` | service | Remote service base implementation. This  is an abstract class.  `@abstract`
| `[Entity]ServiceUtil` | api | Remote service utility class  which wraps `[Entity]ServiceImpl`. This class is generated for backwards compatibility purposes only. Use the `*Service` class by referencing it with the [`@Reference` annotation](/docs/7-2/frameworks/-/knowledge_base/f/declarative-services).
| `[Entity]ServiceWrapper` | api | Remote service wrapper which implements `[Entity]Service`. This class is designed to be extended and it lets you [customize the entity's remote services](/docs/7-2/customization/-/knowledge_base/c/overriding-service-builder-services-service-wrappers).
| `[Entity]ServiceHttp` | service | TODO
| `[Entity]ServiceSoap` | service | SOAP utility which the remote  `[Entity]ServiceUtil` remote service utility can access. 

```{note}
`*Util` classes are generated for backwards compatibility purposes only. Your module applications should avoid calling the util classes. Use the non-util classes instead--you can reference them using the [`@Reference` annotation](/docs/7-2/frameworks/-/knowledge_base/f/declarative-services).
```

You can add custom methods to the `[Entity]LocalServiceImpl`, `[Entity]ServiceImpl` and `[Entity]Impl` classes.

```{important}
Whenever you add methods to, remove methods from, or change a method signature of a `[Entity]LocalServiceImpl`, `[Entity]ServiceImpl` and `[Entity]Impl` class, you should run Service Builder again to regenerate the affected interfaces and the service JAR.
```

```{note}
Service Builder may generate code that requires adding dependencies to your `-service` module build file. 
```

```{warning}
If you modify generated classes other than the `[Entity]LocalServiceImpl`, `[Entity]ServiceImpl` and `[Entity]Impl` classes, Service Builder overwrites the changes the next time you run it.
```

<!-- Move this to a DI tutorial
```{note}
When `spring` is the dependency injector (see *Dependency Injector* in [Defining Global Service Information](/docs/7-2/appdev/-/knowledge_base/a/defining-global-service-information)), the `-LocalServiceBaseImpl` classes Service Builder generates include `-LocalService` and `-Persistence` member fields of all the `service.xml`'s entities. `-LocalServiceImpl` classes inherit these fields and are Spring beans. The Spring beans can reference each other. For example, Spring bean A can have a Spring bean B field and vice versa. Liferay's `spring` dependency injector accommodates Spring bean circular references. The `ds` dependency injector does not accommodate circular references. When using `ds` as the dependency injector, `-LocalServiceImpl` classes are OSGi Declarative Services. Such services start only after all the other services they reference have started. If declarative service A has a declarative service B member field and vice versa, neither service can start. For this reason, the `-LocalServiceBaseImpl` classes Service Builder generates don't include `-LocalService` member fields of the `service.xml`'s other entities. When using the `ds` dependency injector, you must make sure member fields you add to service classes don't create circular dependencies. 
``` -->