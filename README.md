# Stigg Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/io.stigg/stigg-java)](https://central.sonatype.com/artifact/io.stigg/stigg-java/0.1.0-alpha.2)
[![javadoc](https://javadoc.io/badge2/io.stigg/stigg-java/0.1.0-alpha.2/javadoc.svg)](https://javadoc.io/doc/io.stigg/stigg-java/0.1.0-alpha.2)

<!-- x-release-please-end -->

The Stigg Java SDK provides convenient access to the Stigg REST API from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

Javadocs are available on [javadoc.io](https://javadoc.io/doc/io.stigg/stigg-java/0.1.0-alpha.2).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("io.stigg:stigg-java:0.1.0-alpha.2")
```

### Maven

```xml
<dependency>
  <groupId>io.stigg</groupId>
  <artifactId>stigg-java</artifactId>
  <version>0.1.0-alpha.2</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;
import io.stigg.models.v1.customers.CustomerResponse;
import io.stigg.models.v1.customers.CustomerRetrieveParams;

// Configures using the `stigg.apiKey` and `stigg.baseUrl` system properties
// Or configures using the `STIGG_API_KEY` and `STIGG_BASE_URL` environment variables
StiggClient client = StiggOkHttpClient.fromEnv();

CustomerResponse customerResponse = client.v1().customers().retrieve("REPLACE_ME");
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;

// Configures using the `stigg.apiKey` and `stigg.baseUrl` system properties
// Or configures using the `STIGG_API_KEY` and `STIGG_BASE_URL` environment variables
StiggClient client = StiggOkHttpClient.fromEnv();
```

Or manually:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;

StiggClient client = StiggOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;

StiggClient client = StiggOkHttpClient.builder()
    // Configures using the `stigg.apiKey` and `stigg.baseUrl` system properties
    // Or configures using the `STIGG_API_KEY` and `STIGG_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter    | System property | Environment variable | Required | Default value               |
| --------- | --------------- | -------------------- | -------- | --------------------------- |
| `apiKey`  | `stigg.apiKey`  | `STIGG_API_KEY`      | true     | -                           |
| `baseUrl` | `stigg.baseUrl` | `STIGG_BASE_URL`     | true     | `"https://api.example.com"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import io.stigg.client.StiggClient;

StiggClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Stigg API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.v1().customers().retrieve(...)` should be called with an instance of `CustomerRetrieveParams`, and it will return an instance of `CustomerResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;
import io.stigg.models.v1.customers.CustomerResponse;
import io.stigg.models.v1.customers.CustomerRetrieveParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `stigg.apiKey` and `stigg.baseUrl` system properties
// Or configures using the `STIGG_API_KEY` and `STIGG_BASE_URL` environment variables
StiggClient client = StiggOkHttpClient.fromEnv();

CompletableFuture<CustomerResponse> customerResponse = client.async().v1().customers().retrieve("REPLACE_ME");
```

Or create an asynchronous client from the beginning:

```java
import io.stigg.client.StiggClientAsync;
import io.stigg.client.okhttp.StiggOkHttpClientAsync;
import io.stigg.models.v1.customers.CustomerResponse;
import io.stigg.models.v1.customers.CustomerRetrieveParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `stigg.apiKey` and `stigg.baseUrl` system properties
// Or configures using the `STIGG_API_KEY` and `STIGG_BASE_URL` environment variables
StiggClientAsync client = StiggOkHttpClientAsync.fromEnv();

CompletableFuture<CustomerResponse> customerResponse = client.v1().customers().retrieve("REPLACE_ME");
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import io.stigg.core.http.Headers;
import io.stigg.core.http.HttpResponseFor;
import io.stigg.models.v1.customers.CustomerResponse;
import io.stigg.models.v1.customers.CustomerRetrieveParams;

HttpResponseFor<CustomerResponse> customerResponse = client.v1().customers().withRawResponse().retrieve("REPLACE_ME");

int statusCode = customerResponse.statusCode();
Headers headers = customerResponse.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import io.stigg.models.v1.customers.CustomerResponse;

CustomerResponse parsedCustomerResponse = customerResponse.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`StiggServiceException`](stigg-java-core/src/main/kotlin/io/stigg/errors/StiggServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                           |
  | ------ | ------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](stigg-java-core/src/main/kotlin/io/stigg/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](stigg-java-core/src/main/kotlin/io/stigg/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](stigg-java-core/src/main/kotlin/io/stigg/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](stigg-java-core/src/main/kotlin/io/stigg/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](stigg-java-core/src/main/kotlin/io/stigg/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](stigg-java-core/src/main/kotlin/io/stigg/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](stigg-java-core/src/main/kotlin/io/stigg/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](stigg-java-core/src/main/kotlin/io/stigg/errors/UnexpectedStatusCodeException.kt) |

- [`StiggIoException`](stigg-java-core/src/main/kotlin/io/stigg/errors/StiggIoException.kt): I/O networking errors.

- [`StiggRetryableException`](stigg-java-core/src/main/kotlin/io/stigg/errors/StiggRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`StiggInvalidDataException`](stigg-java-core/src/main/kotlin/io/stigg/errors/StiggInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`StiggException`](stigg-java-core/src/main/kotlin/io/stigg/errors/StiggException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

The SDK defines methods that return a paginated lists of results. It provides convenient ways to access the results either one page at a time or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, use the `autoPager()` method, which automatically fetches more pages as needed.

When using the synchronous client, the method returns an [`Iterable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)

```java
import io.stigg.models.v1.customers.CustomerListPage;
import io.stigg.models.v1.customers.CustomerListResponse;

CustomerListPage page = client.v1().customers().list();

// Process as an Iterable
for (CustomerListResponse customer : page.autoPager()) {
    System.out.println(customer);
}

// Process as a Stream
page.autoPager()
    .stream()
    .limit(50)
    .forEach(customer -> System.out.println(customer));
```

When using the asynchronous client, the method returns an [`AsyncStreamResponse`](stigg-java-core/src/main/kotlin/io/stigg/core/http/AsyncStreamResponse.kt):

```java
import io.stigg.core.http.AsyncStreamResponse;
import io.stigg.models.v1.customers.CustomerListPageAsync;
import io.stigg.models.v1.customers.CustomerListResponse;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

CompletableFuture<CustomerListPageAsync> pageFuture = client.async().v1().customers().list();

pageFuture.thenRun(page -> page.autoPager().subscribe(customer -> {
    System.out.println(customer);
}));

// If you need to handle errors or completion of the stream
pageFuture.thenRun(page -> page.autoPager().subscribe(new AsyncStreamResponse.Handler<>() {
    @Override
    public void onNext(CustomerListResponse customer) {
        System.out.println(customer);
    }

    @Override
    public void onComplete(Optional<Throwable> error) {
        if (error.isPresent()) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error.get());
        } else {
            System.out.println("No more!");
        }
    }
}));

// Or use futures
pageFuture.thenRun(page -> page.autoPager()
    .subscribe(customer -> {
        System.out.println(customer);
    })
    .onCompleteFuture()
    .whenComplete((unused, error) -> {
        if (error != null) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error);
        } else {
            System.out.println("No more!");
        }
    }));
```

### Manual pagination

To access individual page items and manually request the next page, use the `items()`,
`hasNextPage()`, and `nextPage()` methods:

```java
import io.stigg.models.v1.customers.CustomerListPage;
import io.stigg.models.v1.customers.CustomerListResponse;

CustomerListPage page = client.v1().customers().list();
while (true) {
    for (CustomerListResponse customer : page.items()) {
        System.out.println(customer);
    }

    if (!page.hasNextPage()) {
        break;
    }

    page = page.nextPage();
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `STIGG_LOG` environment variable to `info`:

```sh
export STIGG_LOG=info
```

Or to `debug` for more verbose logging:

```sh
export STIGG_LOG=debug
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `stigg-java-core` is published with a [configuration file](stigg-java-core/src/main/resources/META-INF/proguard/stigg-java-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`StiggOkHttpClient`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClient.kt) or [`StiggOkHttpClientAsync`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

Also note that there are bugs in older Jackson versions that can affect the SDK. We don't work around all Jackson bugs ([example](https://github.com/FasterXML/jackson-databind/issues/3240)) and expect users to upgrade Jackson for those instead.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;

StiggClient client = StiggOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import io.stigg.models.v1.customers.CustomerResponse;

CustomerResponse customerResponse = client.v1().customers().retrieve(RequestOptions.builder().timeout(Duration.ofSeconds(30)).build());
```

Or configure the default for all method calls at the client level:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;
import java.time.Duration;

StiggClient client = StiggOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

StiggClient client = StiggOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;

StiggClient client = StiggOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `stigg-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`StiggClient`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClient.kt), [`StiggClientAsync`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientAsync.kt), [`StiggClientImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientImpl.kt), and [`StiggClientAsyncImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientAsyncImpl.kt), all of which can work with any HTTP client
- `stigg-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`StiggOkHttpClient`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClient.kt) and [`StiggOkHttpClientAsync`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClientAsync.kt), which provide a way to construct [`StiggClientImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientImpl.kt) and [`StiggClientAsyncImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientAsyncImpl.kt), respectively, using OkHttp
- `stigg-java`
  - Depends on and exposes the APIs of both `stigg-java-core` and `stigg-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`stigg-java` dependency](#installation) with `stigg-java-core`
2. Copy `stigg-java-client-okhttp`'s [`OkHttpClient`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`StiggClientImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientImpl.kt) or [`StiggClientAsyncImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientAsyncImpl.kt), similarly to [`StiggOkHttpClient`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClient.kt) or [`StiggOkHttpClientAsync`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`stigg-java` dependency](#installation) with `stigg-java-core`
2. Write a class that implements the [`HttpClient`](stigg-java-core/src/main/kotlin/io/stigg/core/http/HttpClient.kt) interface
3. Construct [`StiggClientImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientImpl.kt) or [`StiggClientAsyncImpl`](stigg-java-core/src/main/kotlin/io/stigg/client/StiggClientAsyncImpl.kt), similarly to [`StiggOkHttpClient`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClient.kt) or [`StiggOkHttpClientAsync`](stigg-java-client-okhttp/src/main/kotlin/io/stigg/client/okhttp/StiggOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import io.stigg.core.JsonValue;
import io.stigg.models.v1.customers.CustomerRetrieveParams;

CustomerRetrieveParams params = CustomerRetrieveParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import io.stigg.core.JsonValue;
import io.stigg.models.v1.customers.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .defaultPaymentMethod(CustomerCreateParams.DefaultPaymentMethod.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](stigg-java-core/src/main/kotlin/io/stigg/core/Values.kt) object to its setter:

```java
import io.stigg.models.v1.customers.CustomerRetrieveParams;

CustomerRetrieveParams params = CustomerRetrieveParams.builder().build();
```

The most straightforward way to create a [`JsonValue`](stigg-java-core/src/main/kotlin/io/stigg/core/Values.kt) is using its `from(...)` method:

```java
import io.stigg.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](stigg-java-core/src/main/kotlin/io/stigg/core/Values.kt):

```java
import io.stigg.core.JsonMissing;
import io.stigg.models.v1.customers.CustomerRetrieveParams;

CustomerRetrieveParams params = CustomerRetrieveParams.builder()
    .id(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import io.stigg.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.v1().customers().retrieve(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import io.stigg.core.JsonField;
import java.util.Optional;

JsonField<Object> field = client.v1().customers().retrieve(params)._field();

if (field.isMissing()) {
  // The property is absent from the JSON response
} else if (field.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = field.asString();

  // Try to deserialize into a custom type
  MyClass myObject = field.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`StiggInvalidDataException`](stigg-java-core/src/main/kotlin/io/stigg/errors/StiggInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import io.stigg.models.v1.customers.CustomerResponse;

CustomerResponse customerResponse = client.v1().customers().retrieve(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import io.stigg.models.v1.customers.CustomerResponse;

CustomerResponse customerResponse = client.v1().customers().retrieve(RequestOptions.builder().responseValidation(true).build());
```

Or configure the default for all method calls at the client level:

```java
import io.stigg.client.StiggClient;
import io.stigg.client.okhttp.StiggOkHttpClient;

StiggClient client = StiggOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/stiggio/stigg-java/issues) with questions, bugs, or suggestions.
