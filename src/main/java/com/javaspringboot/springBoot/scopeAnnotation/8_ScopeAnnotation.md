# @Scope Annotation

Bean'laerin hangi aşamalarda oluşturulması gerektiği belirtilen bir anotasyondur.

1.  **"singleton"** (Default) -> Only one object is created for each IoC Container.
   
    USE ->

    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) 
                             
    @Scope("singleton")

2.  **"prototype"** -> A new object is created in each injection operation.

    USE ->

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
   
    @Scope("prototype")

3.  **"request"** -> A new object is created for each HTTP request.

    USE ->

    @RequestScope
                 
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)

4.  **"session"** -> An object is created for each HTTP session.

    USE ->         

    @SessionScope
    
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
