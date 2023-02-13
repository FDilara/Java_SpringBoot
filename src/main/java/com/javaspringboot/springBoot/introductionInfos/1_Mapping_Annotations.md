# Annotations --->

**GET**      : Used to display data.                   `@GetMapping`

**POST**     : Used to save data.                      `@PostMapping`

**PUT**      : Used to update data.                    `@PutMapping`

**PATCH**    : Used to update part of the data.        `@PatchMapping`    

-For example, to update the **password**.

**DELETE**   : Used to delete data.                    `@DeleteMapping`

-First path:

`@GetMapping("/info")`

-Second path:

`@RequestMapping(path = "/info", method = RequestMethod.GET)`

Annotations can also be used by specifying the method inside the "`@RequestMapping`" animation.