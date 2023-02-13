### A data will come over the "path(end-point)" and we will use the data.

How to perform the assignment to the parameter?

# 1.@PathVariable Annotation

-First use:
```
@GetMapping(path = "/message/{message}")
public String getMessage(@PathVariable String message) {}
```

-Second use:

```
@GetMapping(path = "/message/{m}")
public String getMessage(@PathVariable("m") String message) {}
```

Required property:
```
@GetMapping(path = {"/message", ""/message/{message}"})
public String getMessage(@PathVariable(name = "message", required = false) String message) {}
```

When **"required" = false**, the endpoint can run without parameters.

Need to add other end-point in "@GetMapping" annotation.

Add the "PathVariable" annotation in front of the parameter.

# 2.@RequestParam Annotation
```
@GetMapping(path = "/message2")
public String getMessage(@RequestParam String message) {}
```
```
@GetMapping(path = "/message2")
public String getMessage(@RequestParam("m") String message) {}
```

Required property:
```
@GetMapping(path = "/message2")
public String getMessage(@RequestParam(name = "message", required = false, defaultValue = "My default message") String message) {}
```

When **"required" = false**, the endpoint can run without parameters.

**"defaultValue"** parameter: Value displayed when a message is not entered.
