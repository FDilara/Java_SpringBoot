@ComponentScan Annotation

Annotation provides the management of the detection process by scanning the component classes under the specified package or packages.

`@Component`

 `public class MyComponent { ... }`

-**basePackages** -> The packages to be scanned are specified as String lists and the component classes under these packages are detected by scanning.

Note: If the package list is not specified with basePackages, the package of the class for which @ComponentScan annotation is written is considered as basePackage.

-**basePackageClasses** -> With this feature, packages of classes in the specified class list are considered basePackages.

-useDefaultFilters -> Classes marked with @Component, @Repository, @Service, @Controller and @RestController annotations by default are considered component classes in Component scanning.

This default filter can be disabled with the useDefaultFilters property.