# @RequestBody Annotation 

Annotation with data in object type.
```
@PostMapping(path = "users")
public User saveUser(@RequestBody User user) {}
```
Getting a model of type "User" from user