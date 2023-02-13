# @RequestHeader Annotation

Annotation to get the header from the sent request

```
@GetMapping(path = "/header")
public String getHeader(@RequestHeader("My-Header") String myHeader) {}
```
