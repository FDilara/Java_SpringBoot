# Annotations

# Sensitive Data

PII sensitive data in database can be encrypted using SpringBoot AttributeConvertor with direct search capabilities. Security and data privacy are essential for any modern cloud application that processes a customer's PII (Personally Identifiable Information) data such as name, email, mobile phone, social security. Even if the data is leaked, it should be considered that customer credentials cannot be compromised.

# @Sensitive

It is used to mask sensitive information during logging of model classes. For example sensitive data; credit cards, national IDs, other financial or PII information.

It is applied to the fields whose value is desired to be masked during logging. (Field Level)

# @JsonProperty

This annotation is used to specify the property name in JSON. (use serialize/deserialize for property name)

# @JsonInclude

Ignore fields with null values with **Include.NON_NULL** and fields with null values with **Include.NON_EMPTY**.

# @CookieValue

Method parameter(Request mapping parameter) level. The HTTP cookie uses this annotation.

# @CacheConfig

Class level. It provides a mechanism for sharing common cache-related settings. When this annotation is present in a class, it provides a set of default settings for any cache operations defined in that class.

# @Cacheable

Methods marked with this annotation take the default settings configured by **@CacheConfig**. If the method is not marked with the **@Cacheable** annotation, the result of this method will not be written to the cache.

# @CachePut

An annotation that indicates that a method (or all methods in a class) triggers a cache action. It is used to put a value to the cache for the given cache name and key.

# @GeneratedValue

Used to automatically generate the primary key value.

# @Temporal

Used to store Date, Time, Timestamp in database table.

